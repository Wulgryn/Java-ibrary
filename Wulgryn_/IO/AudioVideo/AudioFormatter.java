package Wulgryn.IO.AudioVideo;

import javax.sound.sampled.AudioFormat;

public class AudioFormatter {
    float Hz = 8000.0f;
    int bitrate = 8;
    int channel = 1;
    boolean signed = true;
    boolean bigEndian = false;


    public AudioFormatter()
    {

    }

    public AudioFormatter(AudioFormat audioformat, Boolean signed)
    {
        Hz = audioformat.getSampleRate();
        bitrate = audioformat.getSampleSizeInBits();
        channel = audioformat.getChannels();
        bigEndian = audioformat.isBigEndian();
        this.signed = signed;
    }

    public AudioFormatter(AudioFormat audioformat)
    {
        this(audioformat, true);
    }

    public AudioFormatter(float Hertz)
    {
        Hz = Hertz;
    }

    public AudioFormatter(float Hertz, int bitrate)
    {
        this(Hertz);
        this.bitrate = bitrate;
    }

    public AudioFormat Get()
    {
        return new AudioFormat(Hz, bitrate, channel, signed, bigEndian);
    }

    public void SetHertz(float Hz)
    {
        this.Hz = Hz;
    }

    public void SetBitrate(int bitrate)
    {
        this.bitrate = bitrate;
    }

    public void SetChannel(int channel)
    {
        this.channel = channel;
    }

    public void SetSigned(boolean signed)
    {
        this.signed = signed;
    }

    public void SetBigEndian(boolean bigEndian)
    {
        this.bigEndian = bigEndian;
    }
}
