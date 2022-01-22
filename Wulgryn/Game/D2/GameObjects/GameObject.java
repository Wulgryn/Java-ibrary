package Wulgryn.Game.D2.GameObjects;

import java.awt.Color;

import Wulgryn.Game.D2.Components.Components;
import Wulgryn.Game.D2.Components.ComponentObjects.Transform;
import Wulgryn.Window.Paint.Paint2D.Paint;

public class GameObject {
    private Components components = new Components(this);
    public Color color = Color.CYAN;

    public GameObject()
    {
        GameObjectCollector.GameObjectCollection.add(this);
        components.Add(Transform.class);
    }
    protected void Render()
    {
        Transform t = (Transform) components.Get(Transform.class);
        Paint.Draw.Square.Draw(t.Position().IntX(), t.Position().IntY(), t.Size().IntWidth(), t.Size().IntHeight(), color);//, t.rotate());
    }

    public Components Components()
    {
        return components;
    }
}
