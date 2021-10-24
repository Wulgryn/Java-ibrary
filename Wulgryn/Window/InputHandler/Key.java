package Wulgryn.Window.InputHandler;

public class Key {
    public static boolean delay = true;
    protected final boolean[] states = new boolean[]{false, false, false};

    public boolean GetDown() {
        boolean b = states[0];
        states[0] = false;
        return b;
    }
    protected void SetDown()
    {
        if(!delay) states[1] = true;
        else states[1] = false;
        states[2] = false;
        states[0] = true;
    }
    public boolean GetPressed() 
    {
        return states[1];
    }
    protected void SetPressed()
    {
        states[0] = false;
        states[2] = false;
        states[1] = true;
    }

    public boolean GetUp() {
        return states[2];
    }
    protected void SetUp()
    {
        states[0] = false;
        states[1] = false;
        states[2] = true;
    }
}
