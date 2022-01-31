package Wulgryn.Game.D2.Components.ComponentObjects.Collision;

import java.util.ArrayList;
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
import Wulgryn.Properties.Stopper;

public class ColliderCollection {
    //https://www.reddit.com/r/roguelikedev/comments/a1ssfz/how_to_design_an_ecs_in_java/

    public static Vector2 CalculateVector2(GameObject gameObject, Vector2 vector2)
    {
        Transform transform = GetComponent.Transform(gameObject.Components());
        Point2 point = transform.Position();
        Size2 size = transform.Size();
        Stopper s = new Stopper();
        s.Start();
        for (GameObject colliderGameObject : GameObjectCollector.GetGameObjectList()) {
            if(colliderGameObject.equals(gameObject)) continue;
            Point2 vectorPoint = point.AddVector2(vector2);
            Transform colliderTransform = GetComponent.Transform(colliderGameObject.Components());
            Point2 colliderPoint = colliderTransform.Position();
            Size2 colliderSize = colliderTransform.Size();

            int right = vectorPoint.IntX() + size.IntWidth();
            int left = vectorPoint.IntX();
            int up = vectorPoint.IntY();
            int down = vectorPoint.IntY() + size.IntHeight();

            int colliderRight = colliderPoint.IntX() + colliderSize.IntWidth();
            int colliderLeft = colliderPoint.IntX();
            int colliderUp = colliderPoint.IntY();
            int colliderDown = colliderPoint.IntY() + colliderSize.IntHeight();

            //Common.Out(vector2.AsString(),vectorPoint.AsString(),GameObjectCollector.GetGameObjectList().indexOf(colliderGameObject)
            //,down > colliderUp && up < colliderDown && right > colliderLeft && left < colliderLeft && vector2.IntX() > 0
            //,down > colliderUp && up < colliderDown && left < colliderRight && right > colliderRight && vector2.IntX() < 0
            //,right > colliderLeft && left < colliderRight && down > colliderUp && up < colliderUp && vector2.IntY() > 0
            //,right > colliderLeft && left < colliderRight && up < colliderDown && down > colliderDown && vector2.IntY() < 0);

            if(down > colliderUp && up < colliderDown)
            {
                if(right > colliderLeft && left < colliderLeft  && vector2.IntX() > 0)
                {
                    vector2.SetX(0);
                    point.SetX(colliderLeft - size.Width());
                }
                if(left < colliderRight && right > colliderRight && vector2.IntX() < 0)
                {
                    vector2.SetX(0);
                    point.SetX(colliderRight);
                }
            }
            right = vectorPoint.IntX() + size.IntWidth();
            left = vectorPoint.IntX();
            up = vectorPoint.IntY();
            down = vectorPoint.IntY() + size.IntHeight();
            if(right > colliderLeft && left < colliderRight)
            {
                if(down > colliderUp && up < colliderUp && vector2.IntY() > 0)
                {
                    vector2.SetY(0);
                    point.SetY(colliderUp - size.Height());
                }
                if(up < colliderDown && down > colliderDown && vector2.IntY() < 0)
                {
                    vector2.SetY(0);
                    point.SetY(colliderDown);
                }
            }
        }
        s.Stop();
        //s.ListTimes();
        return vector2;
    }
}