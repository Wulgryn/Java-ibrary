package Wulgryn.Window;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import Wulgryn.Parameters.Point;
import Wulgryn.Window.InputHandler.Input;
import Wulgryn.Window.InputHandler.Keycode;
import Wulgryn.Window.InputHandler.Mouse;

public class Frame {
    
    private static JFrame window;
    private static Graphics windowGraphics;


    private static BufferedImage frameImage;
    private static Color backColor = Color.BLACK;
    private static int FPS = 0;

    public static Graphics frame;
    public static final Method[] innerMethods = new Method[17];


    public static boolean ShowFPS = false;
    public static int FPS_limit = 60;

    public static boolean Enabled = true;

    static
    {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.addComponentListener(new ComponentListener()
        {

            @Override
            public void componentResized(ComponentEvent e) {
                try
                {
                    innerMethods[0].invoke(null);
                }catch(Exception ex){}
                OnResize();
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                try
                {
                    innerMethods[1].invoke(null);
                }catch(Exception ex){}
            }

            @Override
            public void componentShown(ComponentEvent e) {
                try
                {
                    innerMethods[2].invoke(null);
                }catch(Exception ex){}
                
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                try
                {
                    innerMethods[3].invoke(null);
                }catch(Exception ex){}
                
            }
        });
        window.addFocusListener(new FocusListener()
        {

            @Override
            public void focusGained(FocusEvent e) {
                try
                {
                    innerMethods[4].invoke(null);
                }catch(Exception ex){}
            }

            @Override
            public void focusLost(FocusEvent e) {
                try
                {
                    innerMethods[5].invoke(null);
                }catch(Exception ex){}
            }
            
        });
        window.addWindowListener(new WindowListener()
        {

            @Override
            public void windowOpened(WindowEvent e) {
                try
                {
                    innerMethods[6].invoke(null);
                }catch(Exception ex){}
            }

            @Override
            public void windowClosing(WindowEvent e) {
                try
                {
                    innerMethods[7].invoke(null);
                }catch(Exception ex){}
            }

            @Override
            public void windowClosed(WindowEvent e) {
                try
                {
                    innerMethods[8].invoke(null);
                }catch(Exception ex){}
            }

            @Override
            public void windowIconified(WindowEvent e) {
                try
                {
                    innerMethods[9].invoke(null);
                }catch(Exception ex){}
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                try
                {
                    innerMethods[10].invoke(null);
                }catch(Exception ex){}
            }

            @Override
            public void windowActivated(WindowEvent e) {
                try
                {
                    innerMethods[12].invoke(null);
                }catch(Exception ex){}
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                try
                {
                    innerMethods[13].invoke(null);
                }catch(Exception ex){}
            }
        });
        window.addWindowStateListener(new WindowStateListener()
        {

            @Override
            public void windowStateChanged(WindowEvent e) {
                if(e.getNewState() == 6)
                {
                    try
                    {
                        innerMethods[11].invoke(null);
                    }catch(Exception ex){}
                }
                try
                {
                    innerMethods[14].invoke(null);
                }catch(Exception ex){}
                
            }
            
        });
        new Input(window);
    }

    public static class Size
    {
        public static Wulgryn.Parameters.Size Get()
        {
            return new Wulgryn.Parameters.Size(window.getWidth(), window.getHeight());
        }
        public static void Set(Wulgryn.Parameters.Size size)
        {
            window.setSize(size.Width(),size.Height());
        }
    }

    public static class Location
    {
        public static Point Get()
        {
            return new Point(window.getX(), window.getY());
        }
        public static void Set(Point point)
        {
            window.setLocation(point.X(),point.Y());
        }
    }

    public static class Undecorated
    {
        public static boolean Get()
        {
            return window.isUndecorated();
        }
        public static void Set(boolean b)
        {   
            window.dispose();
            window.setUndecorated(b);
            window.setVisible(true);
        }
    }

    public static class Visibility
    {
        public static boolean Get()
        {
            return window.isVisible();
        }
        public static void Set(boolean b)
        {
            window.setVisible(b);
        }
    }

    public static class WindowState
    {
        public static int Get() {
            return window.getState();
        }
        public static void Set(int state) {
            window.setState(state);
        }
    }

    public static class BackColor
    {
        public static Color Get() {
            return backColor;
        }
        public static void Set(Color c)
        {
            backColor = c;
        }
    }

    public static void Render(Method setup,Method start,Method update,Method lateUpdate)
    {
        window.setSize(1000,1000);
        Setup(setup);
        if(window.getWidth() > 0 && window.getHeight() > 0)
        {
            frameImage = new BufferedImage(window.getWidth(),window.getHeight(),BufferedImage.TYPE_INT_RGB);
            frame = frameImage.getGraphics();
        }
        window.setVisible(true);
        windowGraphics = window.getGraphics();

        Start(start);
        if(update != null)new Thread()
        {
            public void run() {
                FrameCounter fc = new FrameCounter();
                long last = 0;
                Paint.g = (Graphics2D)frame;
                while(true)
                {
                    if(last + (1000 / FPS_limit) < System.currentTimeMillis())
                    {
                        last = System.currentTimeMillis();
                        LateUpdate(lateUpdate);
                        if(frameImage != null)
                        {
                            windowGraphics.drawImage(frameImage, 0, 0, null);
                            frame.setColor(backColor);
                            frame.fillRect(0, 0, frameImage.getWidth(), frameImage.getHeight());
                        }
                        Update(update);
                        Mouse.ResetButtons();
                        Keycode.ResetKeys();
                        fc.Add();
                        FPS = fc.Get();
                        if(ShowFPS && frameImage != null) 
                        {
                            frame.setColor(Color.GREEN);
                            frame.setFont(new Font("Arial",Font.PLAIN,13));
                            frame.drawString("FPS: " + fc.Get(), 20, 60);
                        }

                        if(Input.lastButton == Input.GetMouseButtonCode())
                        {
                            switch(Input.lastButton)
                            {
                                case 1:
                                    Mouse.LEFT.SetPressed();
                                    break;
                                case 2:
                                    Mouse.MIDDLE.SetPressed();
                                    break;
                                case 3:
                                    Mouse.RIGHT.SetPressed();
                                    break;
                                case 0:
                                {
                                    //Mouse.r
                                }
                            }
                        } 
                    }
                }
            };
        }.start();
    }

    private static void Setup(Method setup)
    {
        try {
            if(setup != null)setup.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Start(Method start)
    {
        try {
            if(start != null)start.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void LateUpdate(Method lateUpdate)
    {
        try {
            if(lateUpdate != null)lateUpdate.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Update(Method update)
    {
        try {
            if(update != null)update.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void OnResize()
    {
        windowGraphics = window.getGraphics();
        if(window.getWidth() > 0 && window.getHeight() > 0)
        {
            frameImage = new BufferedImage(window.getWidth(),window.getHeight(),BufferedImage.TYPE_INT_RGB);
            frame = frameImage.getGraphics();
        }
        else frameImage = null;
        Paint.g = (Graphics2D)frame;
    }

    public static int GetFPS()
    {
        return FPS;
    }

    public static void SetFullScreen()
    {
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void Focus()
    {
        window.toFront();
        window.requestFocus();
    }

    public static void SetAlwaysOnTop(boolean b)
    {
        window.setAlwaysOnTop(b);
    }

    public static void SetTitle(String title)
    {
        window.setTitle(title);
    }

    public static void SetSizeable(boolean b)
    {
        window.setResizable(b);
    }

    public static void SetShape(Shape shape)
    {
        window.setUndecorated(true);
        window.setShape(shape);
    }

    public static void SetIcon(Image image,Wulgryn.Parameters.Size size)
    {
        java.awt.Image icon = image.Get().getScaledInstance(size.Width(), size.Height(), size.Width());
        java.awt.Image ticon = null;
        if(window.getIconImages().size() > 1)
        {
            ticon = window.getIconImages().get(1);
        }
        window.setIconImages(Arrays.asList(new java.awt.Image[]{icon,ticon}));
    }

    public static void SetTaskBarIcon(Image image,Wulgryn.Parameters.Size size)
    {
        java.awt.Image ticon = image.Get().getScaledInstance(size.Width(), size.Height(), size.Width());
        java.awt.Image icon = image.Get().getScaledInstance(size.Width(), size.Height(), size.Width());;
        if(window.getIconImages().size() > 0)
        {
            icon = window.getIconImages().get(0);
        }
        window.setIconImages(Arrays.asList(new java.awt.Image[]{icon,ticon}));
    }
}
