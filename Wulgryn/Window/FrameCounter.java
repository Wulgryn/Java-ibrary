package Wulgryn.Window;

public class FrameCounter {
    private int count = 0, frames = 0;
    private long last = 0;

    public void Add()
    {
        count += 1;
    }

    public int Get()
    {
        if(last + 1000 < System.currentTimeMillis())
        {
            last = System.currentTimeMillis();
            frames = count;
            count = 0;
        }
        return frames;
    }
}
