package Wulgryn.Game.D2.Components.ComponentObjects;

import java.util.List;

import Wulgryn.Game.D2.Components.ComponentObjects.Collision.ColliderCollection;
import Wulgryn.Game.D2.GameObjects.GameObject;
import Wulgryn.Game.D2.GameObjects.GameObjectCollector;
import Wulgryn.Parameters.p2D.Point2;
import Wulgryn.Parameters.p2D.Size2;
import Wulgryn.Parameters.p2D.Vector2;

public class Transform {
    private Point2 location = new Point2(0, 0);
    private Size2 size = new Size2(100, 100);
    private double rotation = 0;
    public boolean isCollide = true;
    public boolean isTrigger = true;

    public static long FPS_Limit = 60;

    GameObject gameObject;

    public Transform(GameObject gameobject) {gameObject = gameobject;}

    public Transform Move(Vector2 v)
    {
        if(!isCollide)
        {
            location.AddX(v.X()).AddY(v.Y());
            return this;
        }
        ColliderCollection.TryMove(gameObject, v);
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

    public double Rotate(){return rotation;}
    public Point2 Position(){return location;}
    public Size2 Size(){return size;}
}
