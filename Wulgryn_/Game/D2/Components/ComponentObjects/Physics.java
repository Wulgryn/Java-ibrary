package Wulgryn.Game.D2.Components.ComponentObjects;

import java.awt.Color;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import Wulgryn.Game.D2.Components.Components;
import Wulgryn.Game.D2.Components.GetComponent;
import Wulgryn.Game.D2.GameObjects.GameObject;
import Wulgryn.Parameters.p2D.Point2;
import Wulgryn.Parameters.p2D.Vector2;
import Wulgryn.Properties.Common;
import Wulgryn.Window.Fonts;
import Wulgryn.Window.FrameCounter;
import Wulgryn.Window.Paint.Paint2D.Paint;

public class Physics {
    public State state = State.Solid;
    public enum State {
        Liquid,
        Solid,
        Aeriform,
    }

    public double bounciness = 0.0;
    public double mass = 1.0;

    public boolean Gravity = true;
}
