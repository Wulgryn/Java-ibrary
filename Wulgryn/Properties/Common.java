package Wulgryn.Properties;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;

import Wulgryn.Parameters.p2D.Size2Int;

public class Common {
    public static void Wait(long millis)
    {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {}
    }

    public static void DoNothing()
    {
        
    }

    public static Size2Int GetScreenSize()
    {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        return new Size2Int(d.width, d.height);
    }

    static String fin;
    public static void Out(Object... args)
    {
        fin = "";
        Arrays.asList(args).stream().forEach(f -> 
        {
            fin += " : " + f.toString();
        });
        fin = fin.trim().substring(1,fin.length() - 1);
        System.out.println(fin);
    }
}
