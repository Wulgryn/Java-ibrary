package Wulgryn.Properties;

public class Common {
    public static void Wait(long millis)
    {
        long last = System.currentTimeMillis();
        while(last + millis > System.currentTimeMillis())
        {

        }
    }

    public static int LowerHigherNull(float num)
    {
        if(num > 0) return 1;
        if(num < 0) return -1;
        return 0;
    }

    public static float Avarage(float... num)
    {
        float calc = 0;
        for(int i = 0; i < num.length; i++)
        {
            calc += num[i];
        }
        return calc / num.length;
    }

    public static void ClearUnUsedRam()
    {
        System.gc();
    }
}
