package Wulgryn.Properties;

import Wulgryn.Parameters.Size;

import java.awt.Dimension;
import java.awt.Toolkit;

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

    public static Size GetScreenSize()
    {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        return new Size(d.width, d.height);
    }
}
