package Wulgryn.Window.InputHandler;

import Wulgryn.Parameters.Point;

public class Mouse {
    public static MouseButton ANY = new MouseButton();
    public static MouseButton LEFT = new MouseButton();
    public static MouseButton MIDDLE = new MouseButton();
    public static MouseButton RIGHT = new MouseButton();

    protected static Point ScreenLocation;
    protected static Point WindowLocation;

    private static int direction_ = 0;

    public static Point GetWindowLocation()
    {
        return WindowLocation;
    }

    public static Point GetScreenLocation()
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
