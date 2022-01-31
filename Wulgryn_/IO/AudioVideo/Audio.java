package Wulgryn.IO.AudioVideo;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import Wulgryn.Properties.Common;

public class Audio {
    Clip sound;
    String path = "";
    public AudioFormatter audioFormatter = new AudioFormatter();

    public Audio(String path)
    {
        try {
            File f = new File(path);
            AudioInputStream converted = AudioSystem.getAudioInputStream(audioFormatter.Get(), AudioSystem.getAudioInputStream(f.getAbsoluteFile()));

            sound = AudioSystem.getClip();
            sound.open(converted);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.path = path;
    }

    public void Volume(float vol)
    {
        Clip clip = sound;

        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

        double gain = vol;   
        float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
        gainControl.setValue(dB);
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

    public void ForcePlay()
    {
        try {
            File f = new File(path);
            AudioInputStream converted = AudioSystem.getAudioInputStream(audioFormatter.Get(), AudioSystem.getAudioInputStream(f.getAbsoluteFile()));

            sound = AudioSystem.getClip();
            sound.open(converted);
            //converted.vo
            sound.start();
        } catch (Exception e) {
            //TODO: handle exception
        }
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
