package Wulgryn.Properties;

import java.util.ArrayList;
import java.util.List;

public class Stopper {
    private List<Long> times = new ArrayList<Long>();


    private long time = 0;
    public void Start()
    {
        time = System.currentTimeMillis();
    }

    public void Stop()
    {
        times.add(System.currentTimeMillis() - time);
    }

    public void ListTimes()
    {
        times.forEach(t ->
        {
            Common.Out(times.indexOf(t),Mathf.MilliToTime(t));
        });
    }

    public int GetTimesCount() {return times.size();}

    public long GetTime(int index) {return times.get(index);}
}
