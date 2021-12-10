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
}
