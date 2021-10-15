package Wulgryn.Window.InputHandler;

public class MouseButton {
    protected final boolean[] states = new boolean[]{false,false};

    protected void SetDown()
    {
        states[1] = false;
        states[0] = true;
    }

    public boolean GetDown()
    {
        return states[0];
    }

    protected void SetUp()
    {
        states[0] = false;
        states[1] = true;
    }

    public boolean GetUp()
    {
        return states[1];
    }
}
