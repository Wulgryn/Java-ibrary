package Wulgryn.Properties;

import java.awt.Dimension;
import java.awt.Toolkit;

import Wulgryn.Parameters.p2D.Size2Int;

public class Common {
    public static void Wait(long millis)
    {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {}
    }

    public static void DoSomething()
    {
        DoNothing();
    }

    public static void DoNothing()
    {
        
    }

    public static Size2Int GetScreenSize()
    {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        return new Size2Int(d.width, d.height);
    }

    public static void Out(Object... args)
    {
        String fin = "";
        for (Object f : args) {
            if(f != null)fin += " : " + f.toString();
        }
        fin = fin.trim().substring(1,fin.length() - 1);
        System.out.println(fin);
    }

    public static Object[] Swap(Object a, Object b) {return new Object[]{b,a};}

    public static String Listing(Object... args)
    {
        String s = "";
        for(int i = 0; i < args.length;i++)
        {
            if(i < args.length - 1)s += args[i] + " : ";
            else s += args[i];
        }
        return s;
    }
}
