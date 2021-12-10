package Wulgryn.Game.D2.Components;

import Wulgryn.Game.D2.Components.ComponentObjects.Transform;

public class GetComponent {
    public static Transform Transform(Components components)
    {
        return (Transform)components.Get(Transform.class);
    }
}
