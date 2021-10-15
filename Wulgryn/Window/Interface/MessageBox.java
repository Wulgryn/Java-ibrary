package Wulgryn.Window.Interface;

import java.awt.Color;


import Wulgryn.Parameters.Point;
import Wulgryn.Parameters.Size;
import Wulgryn.Window.Fonts;
import Wulgryn.Window.Frame;

public class MessageBox {
    /*static Paint p;
    static Window w;
    static Button[] buttons;
    static String message;

    public static void Show(String message)
    {
        Create(message, "");
    }

    public static void Show(String message, String title)
    {
        Create(message, title);
    }

    public static void Show(String message, String title, Button[] btns)
    {
        buttons = btns;
        Create(message, title);
    }

    private static void Create(String text, String title)
    {
        if(w != null)w.Close();
        message = text;
        w = new Window(MessageBox.class);
        w.FPS_limit = 15;
        w.SetAlwaysOnTop(true);
        w.SetSizeable(false);
        w.StartRender();
        w.ShowFPS = false;
        w.SetTitle(title);
        w.SetBackColor(Color.lightGray);

        p = w.GetPaint();
        for (Button button : buttons) {
            button.SetWindow(w);
        }
    }

    public static void Hide()
    {
        //w.Close();
    }

    public static void Setup()
    {
        String[] str = message.split("\n");
        w.SetSize(new Size(290,110 + (str.length - 1) * 15));

        w.SetLocation(new Point(Frame.Location.Get().X() + Frame.Size.Get().Width() / 2 - w.GetSize().Width() / 2, Frame.Location.Get().Y() + Frame.Size.Get().Height() / 2 - w.GetSize().Height() / 2));
        
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].ChangeButton(new Size(70, 20), new Point(w.GetSize().Width() - 90 - i * 90, w.GetSize().Height() - 40));
        }
    }

    public static void Update()
    {
        for (Button button : buttons) {
            button.Create();
        }
        String[] str = message.split("\n");
        for(int i = 0; i < str.length; i++)
        {
            p.DrawString(30, 55 + i * 15, str[i], Color.black,Fonts.GetDefault());
        }
    }

    public static Button[] YesNo(Class<?> classname, String yesClickMethod, String noClickMethod)
    {
        Button b1 = new Button(new Size(0, 0), new Point(0, 0));
        b1.OnClick(classname, yesClickMethod);
        b1.SetTitle("Yes");

        Button b2 = new Button(new Size(0, 0), new Point(0, 0));
        b2.OnClick(classname, noClickMethod);
        b2.SetTitle("No");
        
        return new Button[]{b2, b1};
    }

    public static Button[] Ok(Class<?> classname, String okClickMethod)
    {
        Button b1 = new Button(new Size(0, 0), new Point(0, 0));
        b1.OnClick(classname, okClickMethod);
        b1.SetTitle("Ok");
        
        return new Button[]{b1};
    }

    public static Button[] OkCancel(Class<?> classname, String okClickMethod, String cancelClickMethod)
    {
        Button b1 = new Button(new Size(0, 0), new Point(0, 0));
        b1.OnClick(classname, okClickMethod);
        b1.SetTitle("Ok");

        Button b2 = new Button(new Size(0, 0), new Point(0, 0));
        b2.OnClick(classname, cancelClickMethod);
        b2.SetTitle("Cancel");
        
        return new Button[]{b2, b1};
    }

    public static Button[] YesCancel(Class<?> classname, String yesClickMethod, String cancelClickMethod)
    {
        Button b1 = new Button(new Size(0, 0), new Point(0, 0));
        b1.OnClick(classname, yesClickMethod);
        b1.SetTitle("Yes");

        Button b2 = new Button(new Size(0, 0), new Point(0, 0));
        b2.OnClick(classname, cancelClickMethod);
        b2.SetTitle("Cancel");
        
        return new Button[]{b2, b1};
    }

    public static Button[] Retry(Class<?> classname, String retryClickMethod)
    {
        Button b1 = new Button(new Size(0, 0), new Point(0, 0));
        b1.OnClick(classname, retryClickMethod);
        b1.SetTitle("Retry");
        
        return new Button[]{b1};
    }

    public static Button[] RetryCancel(Class<?> classname, String retryClickMethod, String cancelClickMethod)
    {
        Button b1 = new Button(new Size(0, 0), new Point(0, 0));
        b1.OnClick(classname, retryClickMethod);
        b1.SetTitle("Retry");

        Button b2 = new Button(new Size(0, 0), new Point(0, 0));
        b2.OnClick(classname, cancelClickMethod);
        b2.SetTitle("Cancel");
        
        return new Button[]{b2, b1};
    }

    public static Button[] YesNoCancel(Class<?> classname, String yesClickMethod, String noClickMethod, String cancelClickMethod)
    {
        Button b1 = new Button(new Size(0, 0), new Point(0, 0));
        b1.OnClick(classname, yesClickMethod);
        b1.SetTitle("Yes");

        Button b2 = new Button(new Size(0, 0), new Point(0, 0));
        b2.OnClick(classname, noClickMethod);
        b2.SetTitle("No");

        Button b3 = new Button(new Size(0, 0), new Point(0, 0));
        b3.OnClick(classname, cancelClickMethod);
        b3.SetTitle("Cancel");
        
        return new Button[]{b3, b2, b1};
    }*/
}
