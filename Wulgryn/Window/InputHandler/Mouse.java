package Wulgryn.Window.InputHandler;

import Wulgryn.Parameters.Point;

public class Mouse {
    public static MouseButton ANY = new MouseButton();
    public static MouseButton LEFT = new MouseButton();
    public static MouseButton MIDDLE = new MouseButton();
    public static MouseButton RIGHT = new MouseButton();

    protected static Point ScreenLocation;
    protected static Point WindowLocation;

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
        return MouseButton.GetDirection();
    }
}
