package Wulgryn.Window.Game2D;

import java.awt.Color;

import Wulgryn.Parameters.Motion;
import Wulgryn.Parameters.PointF;
import Wulgryn.Parameters.Size;
import Wulgryn.Window.Animation;
import Wulgryn.Window.Image;
import Wulgryn.Window.Paint;
import Wulgryn.Window.Game2D.Components.Collision;

public class Object {
    Size size = new Size(50,50);
    PointF location = new PointF(0, 0);
    Animation[] animations = new Animation[0];
    Image image;
    Collision coll;
    Motion motion = new Motion(0, 0);

    static int FoundedID = -1;
    public static Object FoundedObject = null;

    int thisID;
    
    public boolean HitBox = true;
    public boolean Trigger = true;
    //-1 to disable
    public int animation_number = -1;

    public Object(Size size)
    {
        this.size = size;
        Setup();
    }

    public Object(PointF location)
    {
        this.location = location;
        Setup();
    }

    public Object(Size size, PointF location)
    {
        this.size = size;
        this.location = location;
        Setup();
    }

    public Object()
    {
        Setup();
    }

    public void Setup()
    {
        coll = new Collision(location.IntX(), location.IntY(), size.Width(), size.Height());
    }

    public void SetDefaultImage(Image image)
    {
        this.image = image;
    }
    
    public void Create()
    {
        if(animations.length > 0 && animation_number > -1)
        {
            Paint.Draw.Image(location.X(), location.Y(), animations[animation_number].GetFrame());
        }
        else
        {
            if(image == null)
            {
                Paint.Draw.Square(location.X(), location.Y(), size.Width(), size.Height(), Color.orange);
            }
            else
            {
                Paint.Draw.Image(location.X(), location.Y(), image.Get());
            }
        }
        if(HitBox)
        {
            if(FoundedID == coll.GetID() && Trigger)
            {
                FoundedObject = this;
                FoundedID = -1;
            }
            coll.Create();
        }
    }

    public void SetLocation(PointF location)
    {
        this.location = location;
        coll.ChangeCollision(size, location.ToIntPoint());
    }

    public void SetSize(Size size)
    {
        this.size = size;
        coll.ChangeCollision(size, location.ToIntPoint());
    }

    public void Move(Motion motion)
    {
        if(Trigger)
        {
            this.motion = motion;
            if(coll.GetID(motion) != 0) 
            {
                motion = new Motion(0, 0);
                return;
            }
        }
        location.AddPointF(new PointF(motion.X(), motion.Y()));
        coll.ChangeCollision(size, location.ToIntPoint());
    }

    public int GetID()
    {
        return coll.GetID();
    }

    public Collision GetCollision()
    {
        return coll;
    }

    public Motion GetMotion()
    {
        return motion;
    }

    public PointF GetLocation()
    {
        return location;
    }

    public Size GetSize()
    {
        return size;
    }

    public static void SetFoundedID(int ID)
    {
        FoundedID = ID;
    }
}
