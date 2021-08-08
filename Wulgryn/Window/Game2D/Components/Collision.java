package Wulgryn.Window.Game2D.Components;

import Wulgryn.Parameters.Motion;
import Wulgryn.Parameters.Point;
import Wulgryn.Parameters.PointF;
import Wulgryn.Parameters.Size;
import Wulgryn.Window.Frame;

public class Collision {
    static int[][] Collisions = new int[0][0];
    static int ID_num = 1;
    static int outOfWindowID = 0;
    static int FoundedID = -1;

    public static Collision FoundedColl = null;
    
    int ID;
    public Size size;
    public Point location;

    public static void ResetCollision()
    {
        Collisions = new int[Frame.Size.Get().Width()][Frame.Size.Get().Height()];
        FoundedColl = null;
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
        if(ID == FoundedID)
        {
            FoundedColl = this;
            FoundedID = -1;
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

    public int GetID(Motion motion)
    {
        PointF p = new PointF(location.X() + motion.X(), location.Y() + motion.Y());

        for(int i = 0; i < size.Width();i++) for(int j = 0; j < size.Height();j++)
            {
                int id = Collision.GetID(p.IntX() + i, p.IntY() + j);
                if(id != ID && id != 0) 
                {
                    return id;
                }
            }
        return 0;
    }

    public int GetID(Motion motion,int ID)
    {
        PointF p = new PointF(location.X() + motion.X(), location.Y() + motion.Y());

        for(int i = 0; i < size.Width();i++) for(int j = 0; j < size.Height();j++)
            {
                int id = Collision.GetID(p.IntX() + i, p.IntY() + j);
                if(id != this.ID && id != 0 && id == ID) 
                {
                    return id;
                }
            }
        return 0;
    }

    public void OnCollide(Class<?> classname, String methodname, Motion motion)
    {
        if(GetID(motion) == 0) return;
        try {
            classname.getMethod(methodname).invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OnCollide(Class<?> classname, String methodname, Motion motion, int ID)
    {
        if(GetID(motion) != ID) return;
        try {
            classname.getMethod(methodname).invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void SetFoundedID(int ID)
    {
        FoundedID = ID;
    }
}
