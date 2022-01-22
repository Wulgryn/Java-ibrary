package Wulgryn.Game.D2.GameObjects;

import java.util.ArrayList;
import java.util.List;

public class GameObjectCollector {
    static List<GameObject> GameObjectCollection = new ArrayList<>();

    public static void Render()
    {
        GameObjectCollection.stream().forEach(g -> 
        {
            g.Render();
        });
    }

    public static List<GameObject> GetGameObjectList(){return GameObjectCollection;}
}
