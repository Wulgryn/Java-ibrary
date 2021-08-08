package Wulgryn.Window.Game2D.Components;

import Wulgryn.Parameters.Point;
import Wulgryn.Parameters.Size;
import Wulgryn.Window.Frame;

public class Collision {
    static int[][] Collisions = new int[0][0];
    static int ID_num = 1;
    static int outOfWindowID = 0;
    
    int ID;
    public Size size;
    public Point location;

    public static void ResetCollision()
    {
        Collisions = new int[Frame.Size.Get().Width()][Frame.Size.Get().Height()];
    }

    public Collision(int x, int y, int Width, int Height)
    {
        size = new Size(Width, Height);
        location = new Point(x, y);
        ID = ID_num;
        ID_num++;
    }

    public void ChangeCollision(Size size, Point location)
    {
        this.size = size;
        this.location = location;
    }

    public void Create()
    {
        for(int i = 0; i < size.Width(); i++)for(int j = 0; j < size.Height(); j++)
        {
            if(location.X() + i > 0 && location.X() + i < Collisions.length && location.Y() + j > 0 && location.Y() + j < Collisions[location.X() + i].length) Collisions[location.X() + i][location.Y() + j] = ID;
        }
    }

    public int GetID()
    {
        return ID;
    }

    public static int GetID(int x,int y)
    {
        if(x < 0 || x > Collisions.length - 1) return outOfWindowID;
        if(y < 0 || y > Collisions[x].length - 1) return outOfWindowID;
        return Collisions[x][y];
    }

    public static void SetOutOfWindowID(int ID)
    {
        outOfWindowID = ID;
    }
}
