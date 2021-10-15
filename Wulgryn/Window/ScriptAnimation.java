package Wulgryn.Window;

import Wulgryn.Properties.Common;

import java.lang.reflect.Method;

public class ScriptAnimation {
    int FrameCount;
    int FPS = 60;
    Method Startmethod;
    Method method;
    Method EndMethod;

    Class<?> callClass;

    boolean run = false;

    public boolean StopOnEnd = true;

    public ScriptAnimation(Class<?> className,String methodName, int FrameCount, int FPS)
    {
        this.FrameCount = FrameCount;
        this.FPS = FPS;
        callClass = className;
        try {
            method = callClass.getMethod(methodName);
        } catch (Exception e) {
            //TODO: handle exception
        }
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

    public void Start()
    {
        run = true;
    }

    public void Stop()
    {
        run = false;
    }

    int currFrame = 0;
    long last = 0;
    public void GetFrame()
    {
        if(last + (1000 / FPS) < System.currentTimeMillis() && run)
        {
            last = System.currentTimeMillis();
            if(currFrame == 0)
            {
                try {
                    if(Startmethod != null) Startmethod.invoke(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                if(method != null) method.invoke(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(currFrame == FrameCount)
            {
                try {
                    if(EndMethod != null) EndMethod.invoke(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if(StopOnEnd) run = false;
                currFrame = 0;
            }
            currFrame++;
        }
    }

    public void SetStartMethod(String methodName)
    {
        try {
            Startmethod = callClass.getMethod(methodName);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void SetEndMethod(String methodName)
    {
        try {
            EndMethod = callClass.getMethod(methodName);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
