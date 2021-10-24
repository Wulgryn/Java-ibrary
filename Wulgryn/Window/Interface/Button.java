package Wulgryn.Window.Interface;

import java.awt.Color;

import Wulgryn.Parameters.Point;
import Wulgryn.Parameters.Size;
import Wulgryn.Properties.Action;
import Wulgryn.Window.Paint;
import Wulgryn.Window.InputHandler.Input;
import Wulgryn.Window.InputHandler.Mouse;

public class Button {
    private Size size = new Size(100, 100);
    private Point location = new Point(0, 0);

    public boolean drawOutLine = false;

    public Action click = new Action(-1);

    public Button(){}

    public Button(Size size)
    {
        this.size = size;
    }

    public Button(Point location)
    {
        this.location = location;
    }

    public Button(Size size,Point location)
    {
        this(size);
        this.location = location;
    }

    public void Invoke()
    {
        if(drawOutLine)Paint.Draw.Square(location.X(),location.Y(),size.Width(),size.Height(),Color.green);

        Point mouse = Mouse.GetWindowLocation();
        if(location.X() < mouse.X() && mouse.X() < location.X() + size.Width() && location.Y() < mouse.Y() && location.Y() + size.Height() > mouse.Y() && Input.GetButtonDown(Mouse.LEFT))
        {
            click.Invoke();
        }
    }

    
}
