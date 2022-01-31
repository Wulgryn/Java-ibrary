package Wulgryn.Properties;

import java.util.HashMap;

public class Stopper {
    private HashMap<String,Long> times = new HashMap<String,Long>();
    private int id = 0;

    private long time = 0;
    private String name = "";
    public void Start()
    {
        time = System.nanoTime();
        name = id + "";
        id++;
    }

    public void Start(String name)
    {
        time = System.nanoTime();
        this.name = name;
    }

    public void Stop()
    {
        times.put(name, System.nanoTime() - time);
    }

    public void ListTimes()
    {
        for (String name : times.keySet()) {
            Common.Out(name,times.get(name) + " nanosec",times.get(name) / 1000000 + " millisec");
        }
    }

    public int GetTimesCount() {return times.size();}

    public long GetTime(int index) {return times.values().stream().toList().get(index);}
    public long GetTime(String name){return times.get(name);}
}
