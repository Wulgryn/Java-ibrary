package Wulgryn.Window;

import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Method;

import Wulgryn.IO.FileManager;
import Wulgryn.Properties.Common;

public class Animation {
    int FPS = 60;
    BufferedImage[] images;
    boolean run = false;

    public boolean StopOnEnd = true;

    Method m;

    public Animation(BufferedImage[] images)
    {
        this.images = images;
    }

    public Animation(File[] files)
    {
        images = FileManager.ToImages(files);
    }

    public Animation(BufferedImage[] images,int FPS)
    {
        this(images);
        this.FPS = FPS;
    }

    public Animation(File[] files,int FPS)
    {
        this(files);
        this.FPS = FPS;
    }

    public void Start()
    {
        run = true;
    }

    public void Stop()
    {
        run = false;
    }

    public void Await(long millisec)
    {
        new Thread(){
            public void run() {
                run = false;
                Common.Wait(millisec);
                run = true;
            };
        }.start();
    }

    long last = 0;
    int frameCount = 1;
    public BufferedImage GetFrame()
    {
        if(last + (1000 / FPS) < System.currentTimeMillis() && run)
        {
            last = System.currentTimeMillis();
            frameCount++;
            if(frameCount > images.length - 1)
            {
                if(StopOnEnd) Stop();
                if(m != null)
                {
                    try {
                        m.invoke(null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                frameCount = 1;
            } 
        }
        return images[(frameCount - 1) < 0 ? 0 : frameCount - 1];
    }

    public int GetFrameCount() {
        return frameCount;
    }

    public void SetMethodOnEnd(Class<?> class_, String methodname)
    {
        try {
            m = class_.getMethod(methodname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
