package Wulgryn.IO.AudioVideo;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import Wulgryn.Properties.Common;

public class Sound {
    Clip sound;
    
    public Sound(String path)
    {
        try {
            File f = new File(path);
            AudioInputStream ai = AudioSystem.getAudioInputStream(f.getAbsoluteFile());
            sound = AudioSystem.getClip();
            sound.open(ai);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Play()
    {
        sound.start();
    }

    public void Stop()
    {
        sound.stop();
    }

    public void Await(long millis)
    {
        Stop();
        Common.Wait(millis);
        Play();
    }

    public void PlayInLoop()
    {
        sound.stop();
        sound.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public void SetOffset(int pos) {
        sound.setFramePosition(pos);
    }
}
