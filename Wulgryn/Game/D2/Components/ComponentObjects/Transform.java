package Wulgryn.Game.D2.Components.ComponentObjects;

import Wulgryn.Parameters.p2D.Point2;
import Wulgryn.Parameters.p2D.Size2;
import Wulgryn.Parameters.p2D.Vector2;

public class Transform {
    public Point2 location = new Point2(0, 0);
    public Size2 size = new Size2(100, 100);
    public double rotation = 0;

    public Transform Move(Vector2 v)
    {
        location.AddX(v.X()).AddY(v.Y());
        return this;
    }

    public Transform SetSize(Size2 size)
    {
        this.size = size;
        return this;
    }

    public Transform SetRotation(double rot)
    {
        rotation = rot;
        return this;
    }

    public double rotate(){return rotation;}
    public Point2 position(){return location;}
    public Size2 scale(){return size;}
}
