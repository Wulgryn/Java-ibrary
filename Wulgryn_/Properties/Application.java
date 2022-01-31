package Wulgryn.Properties;

public class Application {
    
    public static void ClearUnusedRam()
    {
        System.gc();
    }

    public static void Exit()
    {
        System.exit(0);
    }

    public static void Exit(int code)
    {
        System.exit(code);
    }
}
