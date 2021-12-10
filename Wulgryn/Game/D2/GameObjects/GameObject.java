package Wulgryn.Game.D2.GameObjects;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;

import Wulgryn.Game.D2.Components.Components;
import Wulgryn.Game.D2.Components.ComponentObjects.Transform;

public class GameObject {
    private Components components = new Components();

    public GameObject()
    {
        GameObjectCollector.GameObjectCollection.add(this);
        components.Add(Transform.class);
    }
    protected void Render()
    {
        Transform t = (Transform) components.Get(Transform.class);
        //Paint.Draw.Square(0, 0, t.size.Width(), t.size.Height(), Color.green);
    }

    public Components Components()
    {
        return components;
    }
}
