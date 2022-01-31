package Wulgryn.Properties;

public class Mathf{

    public static int LowerHigherNull(double num)
    {
        if(num > 0) return 1;
        if(num < 0) return -1;
        return 0;
    }
    public static int LowerHigherNull(double num,int defaultValue)
    {
        if(num > 0) return 1;
        if(num < 0) return -1;
        return defaultValue;
    }

    public static double Avarage(double... num)
    {
        double calc = 0;
        for(int i = 0; i < num.length; i++)
        {
            calc += num[i];
        }
        return calc / num.length;
    }

    public static double Distance(double x1, double y1,double x2, double y2)
    {
        double a = Math.abs(x2 - x1);
        a *= a;
        double b = Math.abs(y2 - y1);
        b *= b;
        return Math.sqrt(a + b);
    }
    public static double C(double a, double b)
    {
       return Math.sqrt((a*a) + (b*b));
    }

    public static double Distance(double p, double p1)
    {
        return Math.abs(p1 - p);
    }

    public static String MilliToTime(long millis)
    {
        long mill = millis - (millis / 1000 * 1000);
        long sec = millis / 1000 - (millis / 1000 / 60 * 60);
        long min = millis / 1000 / 60 - (millis / 1000 / 60 / 60 * 60);
        long hour = millis / 1000 / 60 / 60 - (millis / 1000 / 60 / 60 / 24 * 24);
        long day = millis / 1000 / 60 / 60 / 24 - (millis / 1000 / 60 / 60 / 24 / 365 * 365);
        long year = millis / 1000 / 60 / 60 / 24 / 365;
        if(year % 4 == 0) 
        {
            day = millis / 1000 / 60 / 60 / 24 - (millis / 1000 / 60 / 60 / 24 / 366 * 366);
            year = millis / 1000 / 60 / 60 / 24 / 366;
        }
        day = millis / 1000 / 60 / 60 / 24 - (millis / 1000 / 60 / 60 / 24 / 365 * 365) - (year / 4);
        return Common.Listing(year+"Y",day+"D",hour+"H",min+"M",sec+","+mill);
    }

    public static String NanoToTime(long nanos)
    {
        long nano = nanos - (nanos / 1000000 *1000000);
        long mill = nanos / 1000000 - (nanos / 1000000 / 1000 * 1000);
        long sec = nanos / 1000000 / 1000 - (nanos / 1000000 / 1000 / 60 * 60);
        long min = nanos / 1000000 / 1000 / 60 - (nanos / 1000000 / 1000 / 60 / 60 * 60);
        long hour = nanos / 1000000 / 1000 / 60 / 60 - (nanos / 1000000 / 1000 / 60 / 60 / 24 * 24);
        long day = nanos / 1000000 / 1000 / 60 / 60 / 24 - (nanos / 1000000 / 1000 / 60 / 60 / 24 / 365 * 365);
        long year = nanos / 1000000 / 1000 / 60 / 60 / 24 / 365;
        if(year % 4 == 0)
        {
            day = nanos / 1000000 / 1000 / 60 / 60 / 24 - (nanos / 1000000 / 1000 / 60 / 60 / 24 / 366 * 366);
            year = nanos / 1000000 / 1000 / 60 / 60 / 24 / 366;
        }
        return Common.Listing(year+" Y",day+" D",hour+" H",min+" M",sec+" S",mill+","+nano);
    }
}
