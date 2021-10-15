package Wulgryn.Window.Interface;

import java.awt.Color;

import Wulgryn.Parameters.Point;
import Wulgryn.Parameters.Size;
import Wulgryn.Window.InputHandler.Input;
import Wulgryn.Window.InputHandler.Mouse;
import Wulgryn.Window.Paint.PaintF;

public class Panel {
    Size size;
    Point location;

    boolean show = true;

    String title = "A long title";


    public Panel(Point location, Size size)
    {
        this.location = location;
        this.size = size;
        Setup();
    }

    Button close;

    private void Setup()
    {
        close = new Button(new Size(40, 28), new Point(location.X() + size.Width() - 40,location.Y()));
        close.SetTitle("  X");
    }

    public void Create()
    {
        if(!show) return;
        PaintF.Fill.Square(location.X() + 5, location.Y() + 5, size.Width(), size.Height(), Color.black);
        PaintF.Fill.Square(location.X(), location.Y(), size.Width(), size.Height(), Color.lightGray);
        PaintF.Draw.Square(location.X() - 1, location.Y() - 1, size.Width() + 2, size.Height() + 2, Color.black);

        PaintF.Fill.Square(location.X(), location.Y(), size.Width(), 30, Color.white);
        PaintF.Draw.String(location.X() + 10, location.Y() + 20, title, Color.black);

        close.Create();
        if(close.Click()) Hide();
    }

    public void SetLocation(Point location)
    {
        this.location = location;
    }

    public void SetSize(Size size)
    {
        this.size = size;
    }

    public void Show()
    {
        show = true;
    }

    public void Hide()
    {
        show = false;
    }
}
