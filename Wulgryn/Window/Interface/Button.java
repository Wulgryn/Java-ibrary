package Wulgryn.Window.Interface;

import java.awt.Color;
import java.lang.reflect.Method;

import Wulgryn.Parameters.Point;
import Wulgryn.Parameters.Size;
import Wulgryn.Window.Fonts;
import Wulgryn.Window.Image;
import Wulgryn.Window.InputHandler.Input;
import Wulgryn.Window.InputHandler.Mouse;
import Wulgryn.Window.Paint.PaintF;

public class Button {
    private Size size;
    private Point location;

    private Method onHover;
    private Method onClick;

    private Image DefaultImage;
    private Image hoverImage;
    private Image ClickImage;

    private String title = "";
    private boolean drawTitle = true;

    private boolean canclick = true;

    private boolean click = false;

    public Button(Size size, Point location) {
        this.size = size;
        this.location = location;
    }

    public void DrawTitle(boolean b)
    {
        drawTitle = b;
    }

    public void SetTitle(String title)
    {
        this.title = title;
    }

    public void ChangeButton(Size size, Point location)
    {
        this.size = size;
        this.location = location;
    }

    public void Create() {
        int mx = 0;
        int my = 0;
        try {
            mx = Mouse.GetWindowLocation().X();
            my = Mouse.GetWindowLocation().Y();
        } catch (Exception e) {
        }

        int endW = location.X() + size.Width();
        int endH = location.Y() + size.Height();
        if (DefaultImage == null) {
            PaintF.Draw.Square(location.X(), location.Y(), size.Width(), size.Height(), Color.green);
        } else {
            PaintF.Draw.Image(location.X(), location.Y(), DefaultImage.Get());
        }
        if (mx > location.X() && mx < endW && my > location.Y() && my < endH) {
            if (hoverImage == null) {
                PaintF.Draw.Square(location.X(), location.Y(), size.Width(), size.Height(), Color.orange);
            } else {
                PaintF.Draw.Image(location.X(), location.Y(), hoverImage.Get());
            }
            if (onHover != null) {
                try {
                    onHover.invoke(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (Input.GetButtonDown(Mouse.ANY) && canclick) {
                canclick = false;
                click = true;
                if (ClickImage == null) {
                    PaintF.Draw.Square(location.X(), location.Y(), size.Width(), size.Height(), Color.red);
                } else {
                    PaintF.Draw.Image(location.X(), location.Y(), ClickImage.Get());
                }
                if (onClick != null) {
                    try {
                        onClick.invoke(null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        if(Input.GetButtonUp(Mouse.ANY)) 
        {
            canclick = true;
            click = false;
        }

        if(drawTitle)
        {
            int width = (int)PaintF.g.getFontMetrics(Fonts.GetDefault()).getStringBounds(title, PaintF.g).getCenterX();
            int height = (int)PaintF.g.getFontMetrics(Fonts.GetDefault()).getStringBounds(title, PaintF.g).getCenterY();
            PaintF.Font = Fonts.GetDefault();
            PaintF.Draw.String(location.X() + width, location.Y() + size.Height() + height, title, Color.black, Fonts.GetDefault());
        }

    }

    public void OnHover(Class<?> class_, String methodname) {
        try {
            onHover = class_.getMethod(methodname);
        } catch (Exception e) {
        }
    }

    public void OnClick(Class<?> class_, String methodname) {
        try {
            onClick = class_.getMethod(methodname);
        } catch (Exception e) {
        }
    }

    public void SetDefaultImage(Image image) {
        DefaultImage = image;
    }

    public void SetOnHoverImage(Image image) {
        hoverImage = image;
    }

    public void SetOnClickImage(Image image) {
        ClickImage = image;
    }

    public void SetSize(Size size) {
        this.size = size;
    }

    public void SetLocation(Point location) {
        this.location = location;
    }

    public Point GetLocation() {
        return location;
    }

    public Size GetSize() {
        return size;
    }

    public boolean Click()
    {
        boolean b = click;
        click = false;
        return b;
    }
}
