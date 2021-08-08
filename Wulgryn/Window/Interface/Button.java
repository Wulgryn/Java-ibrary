package Wulgryn.Window.Interface;

import java.awt.Color;
import java.lang.reflect.Method;

import Wulgryn.Parameters.Point;
import Wulgryn.Parameters.Size;
import Wulgryn.Window.Image;
import Wulgryn.Window.Paint;
import Wulgryn.Window.InputHandler.Input;
import Wulgryn.Window.InputHandler.Mouse;

public class Button {
    Size size;
    Point location;

    Method onHover;
    Method onClick;

    Image DefaultImage;
    Image hoverImage;
    Image ClickImage;

    public Button(Size size, Point location)
    {
        this.size = size;
        this.location = location;
    }

    public void Create()
    {
        int mx = 0;
        int my = 0;
        try {
            mx = Mouse.GetWindowLocation().X();
            my = Mouse.GetWindowLocation().Y();   
        } catch (Exception e) {
        }

        int endW = location.X() + size.Width();
        int endH = location.Y() + size.Height();
        if(DefaultImage == null)
        {
            Paint.Draw.Square(location.X(), location.Y(), size.Width(), size.Height(), Color.green);
        }
        else Paint.Draw.Image(location.X(), location.Y(), DefaultImage.Get());
        if(mx > location.X() && mx < endW && my > location.Y() && my < endH)
        {
            if(hoverImage == null)
            {
                Paint.Draw.Square(location.X(), location.Y(), size.Width(), size.Height(), Color.orange);
            }
            else Paint.Draw.Image(location.X(), location.Y(), hoverImage.Get());
            if(onHover != null)
            {
                try {
                    onHover.invoke(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(Input.GetButtonDown(Mouse.ANY))
            {
                if(ClickImage == null)
                {
                    Paint.Draw.Square(location.X(), location.Y(), size.Width(), size.Height(), Color.red);
                }
                else Paint.Draw.Image(location.X(), location.Y(), ClickImage.Get());
                if(onClick != null)
                {
                    try {
                        onClick.invoke(null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }   
        }


    }

    public void OnHover(Class<?> class_, String methodname)
    {
        try {
            onHover = class_.getMethod(methodname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void OnClick(Class<?> class_, String methodname)
    {
        try {
            onClick = class_.getMethod(methodname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SetDefaultImage(Image image)
    {
        DefaultImage = image;
    }

    public void SetOnHoverImage(Image image)
    {
        hoverImage = image;
    }

    public void SetOnClickImage(Image image)
    {
        ClickImage = image;
    }

    public void SetSize(Size size)
    {
        this.size = size;
    }

    public void SetLocation(Point location)
    {
        this.location = location;
    }

    public Point GetLocation()
    {   
        return location;
    }

    public Size GetSize()
    {
        return size;
    }
}
