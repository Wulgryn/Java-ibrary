package Wulgryn.Game.D2.Components.ComponentObjects.Collision;

import java.util.LinkedList;
import java.util.List;

import Wulgryn.Game.D2.Components.GetComponent;
import Wulgryn.Game.D2.Components.ComponentObjects.Transform;
import Wulgryn.Game.D2.GameObjects.GameObject;
import Wulgryn.Game.D2.GameObjects.GameObjectCollector;
import Wulgryn.Parameters.p2D.Point2;
import Wulgryn.Parameters.p2D.Size2;
import Wulgryn.Parameters.p2D.Vector2;
import Wulgryn.Properties.Common;

public class ColliderCollection {
    //https://www.reddit.com/r/roguelikedev/comments/a1ssfz/how_to_design_an_ecs_in_java/
    
    public static Vector2 TryMove(GameObject gameObject, Vector2 vector)
    {
        List<GameObject> colliders = new LinkedList<GameObject>();
        Transform transform = GetComponent.Transform(gameObject.Components());
        Point2 p2 = transform.Position();
        GameObjectCollector.GetGameObjectList().forEach(g ->
        {

        });
        return null;
    }
}