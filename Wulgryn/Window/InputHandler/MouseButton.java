package Wulgryn.Window.InputHandler;

public class MouseButton {
    protected final boolean[] states = new boolean[]{false,false,false};

    protected void SetDown()
    {
        states[1] = false;
        states[2] = false;
        states[0] = true;
    }

    public boolean GetDown()
    {
        return states[0];
    }

    public void SetPressed()
    {
        states[0] = false;
        states[1] = true;
        states[2] = false;
    }

    public boolean GetPressed()
    {
        return states[1];
    }

    protected void SetUp()
    {
        states[0] = false;
        states[1] = false;
        states[2] = true;
    }

    public boolean GetUp()
    {
        return states[2];
    }
}
