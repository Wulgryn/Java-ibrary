package Wulgryn.Properties;

public class Math {

    public static int LowerHigherNull(double num)
    {
        if(num > 0) return 1;
        if(num < 0) return -1;
        return 0;
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
}
