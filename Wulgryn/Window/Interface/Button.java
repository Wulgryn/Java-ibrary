package Wulgryn.Window.Interface;

import java.awt.Color;

import Wulgryn.Parameters.p2D.Point2Int;
import Wulgryn.Parameters.p2D.Size2Int;
import Wulgryn.Properties.Action;
import Wulgryn.Window.InputHandler.Input;
import Wulgryn.Window.InputHandler.Mouse;
import Wulgryn.Window.Paint.Paint2D.Paint;

public class Button {
    private Size2Int size = new Size2Int(100, 100);
    private Point2Int location = new Point2Int(0, 0);

    public boolean drawOutLine = false;

    public Action click = new Action(-1);

    public Button(){}

    public Button(Size2Int size)
    {
        this.size = size;
    }

    public Button(Point2Int location)
    {
        this.location = location;
    }

    public Button(Size2Int size,Point2Int location)
    {
        this(size);
        this.location = location;
    }

    public void Invoke()
    {
        if(drawOutLine)Paint.Draw.Square.Draw(location.X(),location.Y(),size.Width(),size.Height(),Color.green);

        Point2Int mouse = Mouse.GetWindowLocation();
        if(location.X() < mouse.X() && mouse.X() < location.X() + size.Width() && location.Y() < mouse.Y() && location.Y() + size.Height() > mouse.Y() && Input.GetButtonDown(Mouse.LEFT))
        {
            click.Invoke();
        }
    }

    
}
