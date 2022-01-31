package Wulgryn.Properties;

public class Time {

    public Time(long time) 
    {

    }

    public static Time FromNano(long nano)
    {
        return new Time(nano);
    }
}
