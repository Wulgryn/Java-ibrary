package Wulgryn.Window.InputHandler;

import Wulgryn.Parameters.p2D.Point2Int;

public class Mouse {
    public static MouseButton ANY = new MouseButton();
    public static MouseButton LEFT = new MouseButton();
    public static MouseButton MIDDLE = new MouseButton();
    public static MouseButton RIGHT = new MouseButton();

    protected static Point2Int ScreenLocation;
    protected static Point2Int WindowLocation = new Point2Int(0, 0);

    private static int direction_ = 0;

    public static Point2Int GetWindowLocation()
    {
        return WindowLocation;
    }

    public static Point2Int GetScreenLocation()
    {
        return ScreenLocation;
    }

    public static int GetWheelRotation()
    {
        int d = direction_;
        direction_ = 0;
        return d;
    }

    protected static void SetDirection(int direction)
    {
        direction_ = direction;
    }

    public static void ResetButtons()
    {
        if(ANY.GetUp()) ANY.states[2] = false;
        if(LEFT.GetUp()) LEFT.states[2] = false;
        if(MIDDLE.GetUp()) MIDDLE.states[2] = false;
        if(RIGHT.GetUp()) RIGHT.states[2] = false;

        if(ANY.GetUp()) ANY.states[1] = false;
        if(LEFT.GetUp()) LEFT.states[1] = false;
        if(MIDDLE.GetUp()) MIDDLE.states[1] = false;
        if(RIGHT.GetUp()) RIGHT.states[1] = false;
    }
}
