package Wulgryn.Window.InputHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

import Wulgryn.Parameters.Point;
import Wulgryn.Window.Frame;

public class Input {
    public static boolean EnableTabAsChar = false;

    private static int lastKey;
    private static int lastChar;

    private static int pressedKey;
    private static char pressedChar;

    public static int pressedButton;
    public static int lastButton;

    public Input(JFrame window)
    {
        window.setFocusTraversalKeysEnabled(EnableTabAsChar);
        window.addKeyListener(new KeyListener()
        {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int k = e.getKeyCode();
                int c = (int)e.getKeyChar();

                pressedKey = k;
                pressedChar = e.getKeyChar();

                Keycode.ANY.SetPressed();
                if(k == KeyEvent.VK_A)  Keycode.A.SetPressed();
                if(c == (int)'á')       Keycode.Á.SetPressed();
                if(k == KeyEvent.VK_B)  Keycode.B.SetPressed();
                if(k == KeyEvent.VK_C)  Keycode.C.SetPressed();
                if(k == KeyEvent.VK_D)  Keycode.D.SetPressed();
                if(k == KeyEvent.VK_E)  Keycode.E.SetPressed();
                if(c == (int)'é')       Keycode.É.SetPressed();
                if(k == KeyEvent.VK_F)  Keycode.F.SetPressed();
                if(k == KeyEvent.VK_G)  Keycode.G.SetPressed();
                if(k == KeyEvent.VK_H)  Keycode.H.SetPressed();
                if(k == KeyEvent.VK_I)  Keycode.I.SetPressed();
                if(c == (int)'í')       Keycode.Í.SetPressed();
                if(k == KeyEvent.VK_J)  Keycode.J.SetPressed();
                if(k == KeyEvent.VK_K)  Keycode.K.SetPressed();
                if(k == KeyEvent.VK_L)  Keycode.L.SetPressed();
                if(k == KeyEvent.VK_M)  Keycode.M.SetPressed();
                if(k == KeyEvent.VK_N)  Keycode.N.SetPressed();
                if(k == KeyEvent.VK_O)  Keycode.O.SetPressed();
                if(c == (int)'ó')       Keycode.Ó.SetPressed();
                if(c == (int)'ö')       Keycode.Ö.SetPressed();
                if(c == (int)'ő')       Keycode.Ő.SetPressed();
                if(k == KeyEvent.VK_P)  Keycode.P.SetPressed();
                if(k == KeyEvent.VK_Q)  Keycode.Q.SetPressed();
                if(k == KeyEvent.VK_R)  Keycode.R.SetPressed();
                if(k == KeyEvent.VK_S)  Keycode.S.SetPressed();
                if(k == KeyEvent.VK_T)  Keycode.T.SetPressed();
                if(k == KeyEvent.VK_U)  Keycode.U.SetPressed();
                if(c == (int)'ú')       Keycode.Ú.SetPressed();
                if(c == (int)'ü')       Keycode.Ü.SetPressed();
                if(c == (int)'ű')       Keycode.Ű.SetPressed();
                if(k == KeyEvent.VK_V)  Keycode.V.SetPressed();
                if(k == KeyEvent.VK_W)  Keycode.W.SetPressed();
                if(k == KeyEvent.VK_X)  Keycode.X.SetPressed();
                if(k == KeyEvent.VK_Y)  Keycode.Y.SetPressed();
                if(k == KeyEvent.VK_Z)  Keycode.Z.SetPressed();

                if(k == KeyEvent.VK_0)  Keycode.ZERO.SetPressed();
                if(k == KeyEvent.VK_1)  Keycode.ONE.SetPressed();
                if(k == KeyEvent.VK_2)  Keycode.TWO.SetPressed();
                if(k == KeyEvent.VK_3)  Keycode.THREE.SetPressed();
                if(k == KeyEvent.VK_4)  Keycode.FOUR.SetPressed();
                if(k == KeyEvent.VK_5)  Keycode.FIVE.SetPressed();
                if(k == KeyEvent.VK_6)  Keycode.SIX.SetPressed();
                if(k == KeyEvent.VK_7)  Keycode.SEVEN.SetPressed();
                if(k == KeyEvent.VK_8)  Keycode.EIGHT.SetPressed();
                if(k == KeyEvent.VK_9)  Keycode.NINE.SetPressed();

                if(k == KeyEvent.VK_F1)  Keycode.F1.SetPressed();
                if(k == KeyEvent.VK_F2)  Keycode.F2.SetPressed();
                if(k == KeyEvent.VK_F3)  Keycode.F3.SetPressed();
                if(k == KeyEvent.VK_F4)  Keycode.F4.SetPressed();
                if(k == KeyEvent.VK_F5)  Keycode.F5.SetPressed();
                if(k == KeyEvent.VK_F6)  Keycode.F6.SetPressed();
                if(k == KeyEvent.VK_F7)  Keycode.F7.SetPressed();
                if(k == KeyEvent.VK_F8)  Keycode.F8.SetPressed();
                if(k == KeyEvent.VK_F9)  Keycode.F9.SetPressed();
                if(k == KeyEvent.VK_F10) Keycode.F10.SetPressed();
                if(k == KeyEvent.VK_F11) Keycode.F11.SetPressed();
                if(k == KeyEvent.VK_F12) Keycode.F12.SetPressed();

                if(k == KeyEvent.VK_ESCAPE)  Keycode.ESCAPE.SetPressed();
                if(k == KeyEvent.VK_TAB)    Keycode.TAB.SetPressed();
                if(k == KeyEvent.VK_CAPS_LOCK)     Keycode.CAPS_LOCK.SetPressed();
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 2)  Keycode.LEFT_SHIFT.SetPressed();
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 2)  Keycode.LEFT_CTRL.SetPressed();
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 3)  Keycode.RIGHT_SHIFT.SetPressed();
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 3)  Keycode.RIGHT_CTRL.SetPressed();
                if(k == KeyEvent.VK_ALT)  Keycode.ALT.SetPressed();
                if(k == KeyEvent.VK_ALT_GRAPH)  Keycode.ALT_GRAPH.SetPressed();
                if(k == KeyEvent.VK_SPACE)  Keycode.SPACE.SetPressed();
                if(k == KeyEvent.VK_ENTER && e.getKeyLocation() == 1)  Keycode.ENTER.SetPressed();
                if(k == KeyEvent.VK_BACK_SPACE)  Keycode.BACKSPACE.SetPressed();

                if(k == KeyEvent.VK_SCROLL_LOCK)  Keycode.SCROLL_LOCK.SetPressed();
                if(k == KeyEvent.VK_INSERT)  Keycode.INSERT.SetPressed();
                if(k == KeyEvent.VK_HOME)  Keycode.HOME.SetPressed();
                if(k == KeyEvent.VK_PAGE_UP)  Keycode.PAGE_UP.SetPressed();
                if(k == KeyEvent.VK_PAGE_DOWN)  Keycode.PAGE_DOWN.SetPressed();
                if(k == KeyEvent.VK_DELETE)  Keycode.DELETE.SetPressed();
                if(k == KeyEvent.VK_END)  Keycode.END.SetPressed();

                if(k == KeyEvent.VK_UP)  Keycode.ARROW_UP.SetPressed();
                if(k == KeyEvent.VK_DOWN)  Keycode.ARROW_DOWN.SetPressed();
                if(k == KeyEvent.VK_RIGHT)  Keycode.ARROW_RIGHT.SetPressed();
                if(k == KeyEvent.VK_LEFT)  Keycode.ARROW_LEFT.SetPressed();

                if(k == KeyEvent.VK_NUM_LOCK)  Keycode.NUM_LOCK.SetPressed();
                if(k == 111)  Keycode.NUM_DEVISION.SetPressed();
                if(k == 106)  Keycode.NUM_MULTIPLICATION.SetPressed();
                if(k == 109)  Keycode.NUM_MINUS.SetPressed();
                if(k == 107)  Keycode.NUM_PLUS.SetPressed();
                if(k == 10 && e.getKeyLocation() == 4)  Keycode.NUM_ENTER.SetPressed();
                if(k == 110)  Keycode.NUM_COMMA.SetPressed();
                if(k == KeyEvent.VK_NUMPAD0)  Keycode.NUM_ZERO.SetPressed();
                if(k == KeyEvent.VK_NUMPAD1)  Keycode.NUM_ONE.SetPressed();
                if(k == KeyEvent.VK_NUMPAD2)  Keycode.NUM_TWO.SetPressed();
                if(k == KeyEvent.VK_NUMPAD3)  Keycode.NUM_THREE.SetPressed();
                if(k == KeyEvent.VK_NUMPAD4)  Keycode.NUM_FOUR.SetPressed();
                if(k == KeyEvent.VK_NUMPAD5)  Keycode.NUM_FIVE.SetPressed();
                if(k == KeyEvent.VK_NUMPAD6)  Keycode.NUM_SIX.SetPressed();
                if(k == KeyEvent.VK_NUMPAD7)  Keycode.NUM_SEVEN.SetPressed();
                if(k == KeyEvent.VK_NUMPAD8)  Keycode.NUM_EIGHT.SetPressed();
                if(k == KeyEvent.VK_NUMPAD9)  Keycode.NUM_NINE.SetPressed();

                if(k == lastKey && c == lastChar)return;
                lastKey = k;
                lastChar = c;
                
                Keycode.ANY.SetDown();
                if(k == KeyEvent.VK_A)  Keycode.A.SetDown();
                if(c == (int)'á')       Keycode.Á.SetDown();
                if(k == KeyEvent.VK_B)  Keycode.B.SetDown();
                if(k == KeyEvent.VK_C)  Keycode.C.SetDown();
                if(k == KeyEvent.VK_D)  Keycode.D.SetDown();
                if(k == KeyEvent.VK_E)  Keycode.E.SetDown();
                if(c == (int)'é')       Keycode.É.SetDown();
                if(k == KeyEvent.VK_F)  Keycode.F.SetDown();
                if(k == KeyEvent.VK_G)  Keycode.G.SetDown();
                if(k == KeyEvent.VK_H)  Keycode.H.SetDown();
                if(k == KeyEvent.VK_I)  Keycode.I.SetDown();
                if(c == (int)'í')       Keycode.Í.SetDown();
                if(k == KeyEvent.VK_J)  Keycode.J.SetDown();
                if(k == KeyEvent.VK_K)  Keycode.K.SetDown();
                if(k == KeyEvent.VK_L)  Keycode.L.SetDown();
                if(k == KeyEvent.VK_M)  Keycode.M.SetDown();
                if(k == KeyEvent.VK_N)  Keycode.N.SetDown();
                if(k == KeyEvent.VK_O)  Keycode.O.SetDown();
                if(c == (int)'ó')       Keycode.Ó.SetDown();
                if(c == (int)'ö')       Keycode.Ö.SetDown();
                if(c == (int)'ő')       Keycode.Ő.SetDown();
                if(k == KeyEvent.VK_P)  Keycode.P.SetDown();
                if(k == KeyEvent.VK_Q)  Keycode.Q.SetDown();
                if(k == KeyEvent.VK_R)  Keycode.R.SetDown();
                if(k == KeyEvent.VK_S)  Keycode.S.SetDown();
                if(k == KeyEvent.VK_T)  Keycode.T.SetDown();
                if(k == KeyEvent.VK_U)  Keycode.U.SetDown();
                if(c == (int)'ú')       Keycode.Ú.SetDown();
                if(c == (int)'ü')       Keycode.Ü.SetDown();
                if(c == (int)'ű')       Keycode.Ű.SetDown();
                if(k == KeyEvent.VK_V)  Keycode.V.SetDown();
                if(k == KeyEvent.VK_W)  Keycode.W.SetDown();
                if(k == KeyEvent.VK_X)  Keycode.X.SetDown();
                if(k == KeyEvent.VK_Y)  Keycode.Y.SetDown();
                if(k == KeyEvent.VK_Z)  Keycode.Z.SetDown();

                if(k == KeyEvent.VK_0)  Keycode.ZERO.SetDown();
                if(k == KeyEvent.VK_1)  Keycode.ONE.SetDown();
                if(k == KeyEvent.VK_2)  Keycode.TWO.SetDown();
                if(k == KeyEvent.VK_3)  Keycode.THREE.SetDown();
                if(k == KeyEvent.VK_4)  Keycode.FOUR.SetDown();
                if(k == KeyEvent.VK_5)  Keycode.FIVE.SetDown();
                if(k == KeyEvent.VK_6)  Keycode.SIX.SetDown();
                if(k == KeyEvent.VK_7)  Keycode.SEVEN.SetDown();
                if(k == KeyEvent.VK_8)  Keycode.EIGHT.SetDown();
                if(k == KeyEvent.VK_9)  Keycode.NINE.SetDown();

                if(k == KeyEvent.VK_F1)  Keycode.F1.SetDown();
                if(k == KeyEvent.VK_F2)  Keycode.F2.SetDown();
                if(k == KeyEvent.VK_F3)  Keycode.F3.SetDown();
                if(k == KeyEvent.VK_F4)  Keycode.F4.SetDown();
                if(k == KeyEvent.VK_F5)  Keycode.F5.SetDown();
                if(k == KeyEvent.VK_F6)  Keycode.F6.SetDown();
                if(k == KeyEvent.VK_F7)  Keycode.F7.SetDown();
                if(k == KeyEvent.VK_F8)  Keycode.F8.SetDown();
                if(k == KeyEvent.VK_F9)  Keycode.F9.SetDown();
                if(k == KeyEvent.VK_F10) Keycode.F10.SetDown();
                if(k == KeyEvent.VK_F11) Keycode.F11.SetDown();
                if(k == KeyEvent.VK_F12) Keycode.F12.SetDown();

                if(k == KeyEvent.VK_ESCAPE)  Keycode.ESCAPE.SetDown();
                if(k == KeyEvent.VK_TAB)    Keycode.TAB.SetDown();
                if(k == KeyEvent.VK_CAPS_LOCK)     Keycode.CAPS_LOCK.SetDown();
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 2)  Keycode.LEFT_SHIFT.SetDown();
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 2)  Keycode.LEFT_CTRL.SetDown();
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 3)  Keycode.RIGHT_SHIFT.SetDown();
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 3)  Keycode.RIGHT_CTRL.SetDown();
                if(k == KeyEvent.VK_ALT)  Keycode.ALT.SetDown();
                if(k == KeyEvent.VK_ALT_GRAPH)  Keycode.ALT_GRAPH.SetDown();
                if(k == KeyEvent.VK_SPACE)  Keycode.SPACE.SetDown();
                if(k == KeyEvent.VK_ENTER && e.getKeyLocation() == 1)  Keycode.ENTER.SetDown();
                if(k == KeyEvent.VK_BACK_SPACE)  Keycode.BACKSPACE.SetDown();

                if(k == KeyEvent.VK_SCROLL_LOCK)  Keycode.SCROLL_LOCK.SetDown();
                if(k == KeyEvent.VK_INSERT)  Keycode.INSERT.SetDown();
                if(k == KeyEvent.VK_HOME)  Keycode.HOME.SetDown();
                if(k == KeyEvent.VK_PAGE_UP)  Keycode.PAGE_UP.SetDown();
                if(k == KeyEvent.VK_PAGE_DOWN)  Keycode.PAGE_DOWN.SetDown();
                if(k == KeyEvent.VK_DELETE)  Keycode.DELETE.SetDown();
                if(k == KeyEvent.VK_END)  Keycode.END.SetDown();

                if(k == KeyEvent.VK_UP)  Keycode.ARROW_UP.SetDown();
                if(k == KeyEvent.VK_DOWN)  Keycode.ARROW_DOWN.SetDown();
                if(k == KeyEvent.VK_RIGHT)  Keycode.ARROW_RIGHT.SetDown();
                if(k == KeyEvent.VK_LEFT)  Keycode.ARROW_LEFT.SetDown();

                if(k == KeyEvent.VK_NUM_LOCK)  Keycode.NUM_LOCK.SetDown();
                if(k == 111)  Keycode.NUM_DEVISION.SetDown();
                if(k == 106)  Keycode.NUM_MULTIPLICATION.SetDown();
                if(k == 109)  Keycode.NUM_MINUS.SetDown();
                if(k == 107)  Keycode.NUM_PLUS.SetDown();
                if(k == 10 && e.getKeyLocation() == 4)  Keycode.NUM_ENTER.SetDown();
                if(k == 110)  Keycode.NUM_COMMA.SetDown();
                if(k == KeyEvent.VK_NUMPAD0)  Keycode.NUM_ZERO.SetDown();
                if(k == KeyEvent.VK_NUMPAD1)  Keycode.NUM_ONE.SetDown();
                if(k == KeyEvent.VK_NUMPAD2)  Keycode.NUM_TWO.SetDown();
                if(k == KeyEvent.VK_NUMPAD3)  Keycode.NUM_THREE.SetDown();
                if(k == KeyEvent.VK_NUMPAD4)  Keycode.NUM_FOUR.SetDown();
                if(k == KeyEvent.VK_NUMPAD5)  Keycode.NUM_FIVE.SetDown();
                if(k == KeyEvent.VK_NUMPAD6)  Keycode.NUM_SIX.SetDown();
                if(k == KeyEvent.VK_NUMPAD7)  Keycode.NUM_SEVEN.SetDown();
                if(k == KeyEvent.VK_NUMPAD8)  Keycode.NUM_EIGHT.SetDown();
                if(k == KeyEvent.VK_NUMPAD9)  Keycode.NUM_NINE.SetDown();

                if(!Key.delay)
                {
                    Keycode.ANY.SetPressed();
                    if(k == KeyEvent.VK_A)  Keycode.A.SetPressed();
                    if(c == (int)'á')       Keycode.Á.SetPressed();
                    if(k == KeyEvent.VK_B)  Keycode.B.SetPressed();
                    if(k == KeyEvent.VK_C)  Keycode.C.SetPressed();
                    if(k == KeyEvent.VK_D)  Keycode.D.SetPressed();
                    if(k == KeyEvent.VK_E)  Keycode.E.SetPressed();
                    if(c == (int)'é')       Keycode.É.SetPressed();
                    if(k == KeyEvent.VK_F)  Keycode.F.SetPressed();
                    if(k == KeyEvent.VK_G)  Keycode.G.SetPressed();
                    if(k == KeyEvent.VK_H)  Keycode.H.SetPressed();
                    if(k == KeyEvent.VK_I)  Keycode.I.SetPressed();
                    if(c == (int)'í')       Keycode.Í.SetPressed();
                    if(k == KeyEvent.VK_J)  Keycode.J.SetPressed();
                    if(k == KeyEvent.VK_K)  Keycode.K.SetPressed();
                    if(k == KeyEvent.VK_L)  Keycode.L.SetPressed();
                    if(k == KeyEvent.VK_M)  Keycode.M.SetPressed();
                    if(k == KeyEvent.VK_N)  Keycode.N.SetPressed();
                    if(k == KeyEvent.VK_O)  Keycode.O.SetPressed();
                    if(c == (int)'ó')       Keycode.Ó.SetPressed();
                    if(c == (int)'ö')       Keycode.Ö.SetPressed();
                    if(c == (int)'ő')       Keycode.Ő.SetPressed();
                    if(k == KeyEvent.VK_P)  Keycode.P.SetPressed();
                    if(k == KeyEvent.VK_Q)  Keycode.Q.SetPressed();
                    if(k == KeyEvent.VK_R)  Keycode.R.SetPressed();
                    if(k == KeyEvent.VK_S)  Keycode.S.SetPressed();
                    if(k == KeyEvent.VK_T)  Keycode.T.SetPressed();
                    if(k == KeyEvent.VK_U)  Keycode.U.SetPressed();
                    if(c == (int)'ú')       Keycode.Ú.SetPressed();
                    if(c == (int)'ü')       Keycode.Ü.SetPressed();
                    if(c == (int)'ű')       Keycode.Ű.SetPressed();
                    if(k == KeyEvent.VK_V)  Keycode.V.SetPressed();
                    if(k == KeyEvent.VK_W)  Keycode.W.SetPressed();
                    if(k == KeyEvent.VK_X)  Keycode.X.SetPressed();
                    if(k == KeyEvent.VK_Y)  Keycode.Y.SetPressed();
                    if(k == KeyEvent.VK_Z)  Keycode.Z.SetPressed();
                    
                    if(k == KeyEvent.VK_0)  Keycode.ZERO.SetPressed();
                    if(k == KeyEvent.VK_1)  Keycode.ONE.SetPressed();
                    if(k == KeyEvent.VK_2)  Keycode.TWO.SetPressed();
                    if(k == KeyEvent.VK_3)  Keycode.THREE.SetPressed();
                    if(k == KeyEvent.VK_4)  Keycode.FOUR.SetPressed();
                    if(k == KeyEvent.VK_5)  Keycode.FIVE.SetPressed();
                    if(k == KeyEvent.VK_6)  Keycode.SIX.SetPressed();
                    if(k == KeyEvent.VK_7)  Keycode.SEVEN.SetPressed();
                    if(k == KeyEvent.VK_8)  Keycode.EIGHT.SetPressed();
                    if(k == KeyEvent.VK_9)  Keycode.NINE.SetPressed();
                    
                    if(k == KeyEvent.VK_F1)  Keycode.F1.SetPressed();
                    if(k == KeyEvent.VK_F2)  Keycode.F2.SetPressed();
                    if(k == KeyEvent.VK_F3)  Keycode.F3.SetPressed();
                    if(k == KeyEvent.VK_F4)  Keycode.F4.SetPressed();
                    if(k == KeyEvent.VK_F5)  Keycode.F5.SetPressed();
                    if(k == KeyEvent.VK_F6)  Keycode.F6.SetPressed();
                    if(k == KeyEvent.VK_F7)  Keycode.F7.SetPressed();
                    if(k == KeyEvent.VK_F8)  Keycode.F8.SetPressed();
                    if(k == KeyEvent.VK_F9)  Keycode.F9.SetPressed();
                    if(k == KeyEvent.VK_F10) Keycode.F10.SetPressed();
                    if(k == KeyEvent.VK_F11) Keycode.F11.SetPressed();
                    if(k == KeyEvent.VK_F12) Keycode.F12.SetPressed();
                    
                    if(k == KeyEvent.VK_ESCAPE)  Keycode.ESCAPE.SetPressed();
                    if(k == KeyEvent.VK_TAB)    Keycode.TAB.SetPressed();
                    if(k == KeyEvent.VK_CAPS_LOCK)     Keycode.CAPS_LOCK.SetPressed();
                    if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 2)  Keycode.LEFT_SHIFT.SetPressed();
                    if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 2)  Keycode.LEFT_CTRL.SetPressed();
                    if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 3)  Keycode.RIGHT_SHIFT.SetPressed();
                    if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 3)  Keycode.RIGHT_CTRL.SetPressed();
                    if(k == KeyEvent.VK_ALT)  Keycode.ALT.SetPressed();
                    if(k == KeyEvent.VK_ALT_GRAPH)  Keycode.ALT_GRAPH.SetPressed();
                    if(k == KeyEvent.VK_SPACE)  Keycode.SPACE.SetPressed();
                    if(k == KeyEvent.VK_ENTER && e.getKeyLocation() == 1)  Keycode.ENTER.SetPressed();
                    if(k == KeyEvent.VK_BACK_SPACE)  Keycode.BACKSPACE.SetPressed();
                    
                    if(k == KeyEvent.VK_SCROLL_LOCK)  Keycode.SCROLL_LOCK.SetPressed();
                    if(k == KeyEvent.VK_INSERT)  Keycode.INSERT.SetPressed();
                    if(k == KeyEvent.VK_HOME)  Keycode.HOME.SetPressed();
                    if(k == KeyEvent.VK_PAGE_UP)  Keycode.PAGE_UP.SetPressed();
                    if(k == KeyEvent.VK_PAGE_DOWN)  Keycode.PAGE_DOWN.SetPressed();
                    if(k == KeyEvent.VK_DELETE)  Keycode.DELETE.SetPressed();
                    if(k == KeyEvent.VK_END)  Keycode.END.SetPressed();
                    
                    if(k == KeyEvent.VK_UP)  Keycode.ARROW_UP.SetPressed();
                    if(k == KeyEvent.VK_DOWN)  Keycode.ARROW_DOWN.SetPressed();
                    if(k == KeyEvent.VK_RIGHT)  Keycode.ARROW_RIGHT.SetPressed();
                    if(k == KeyEvent.VK_LEFT)  Keycode.ARROW_LEFT.SetPressed();
                    
                    if(k == KeyEvent.VK_NUM_LOCK)  Keycode.NUM_LOCK.SetPressed();
                    if(k == 111)  Keycode.NUM_DEVISION.SetPressed();
                    if(k == 106)  Keycode.NUM_MULTIPLICATION.SetPressed();
                    if(k == 109)  Keycode.NUM_MINUS.SetPressed();
                    if(k == 107)  Keycode.NUM_PLUS.SetPressed();
                    if(k == 10 && e.getKeyLocation() == 4)  Keycode.NUM_ENTER.SetPressed();
                    if(k == 110)  Keycode.NUM_COMMA.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD0)  Keycode.NUM_ZERO.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD1)  Keycode.NUM_ONE.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD2)  Keycode.NUM_TWO.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD3)  Keycode.NUM_THREE.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD4)  Keycode.NUM_FOUR.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD5)  Keycode.NUM_FIVE.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD6)  Keycode.NUM_SIX.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD7)  Keycode.NUM_SEVEN.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD8)  Keycode.NUM_EIGHT.SetPressed();
                    if(k == KeyEvent.VK_NUMPAD9)  Keycode.NUM_NINE.SetPressed();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int k = e.getKeyCode();
                int c = (int)e.getKeyChar();
                lastKey = 0;
                lastChar = 0;

                pressedKey = k;
                pressedChar = e.getKeyChar();

                Keycode.ANY.SetUp();
                if(k == KeyEvent.VK_A)  Keycode.A.SetUp();
                if(c == (int)'á')       Keycode.Á.SetUp();
                if(k == KeyEvent.VK_B)  Keycode.B.SetUp();
                if(k == KeyEvent.VK_C)  Keycode.C.SetUp();
                if(k == KeyEvent.VK_D)  Keycode.D.SetUp();
                if(k == KeyEvent.VK_E)  Keycode.E.SetUp();
                if(c == (int)'é')       Keycode.É.SetUp();
                if(k == KeyEvent.VK_F)  Keycode.F.SetUp();
                if(k == KeyEvent.VK_G)  Keycode.G.SetUp();
                if(k == KeyEvent.VK_H)  Keycode.H.SetUp();
                if(k == KeyEvent.VK_I)  Keycode.I.SetUp();
                if(c == (int)'í')       Keycode.Í.SetUp();
                if(k == KeyEvent.VK_J)  Keycode.J.SetUp();
                if(k == KeyEvent.VK_K)  Keycode.K.SetUp();
                if(k == KeyEvent.VK_L)  Keycode.L.SetUp();
                if(k == KeyEvent.VK_M)  Keycode.M.SetUp();
                if(k == KeyEvent.VK_N)  Keycode.N.SetUp();
                if(k == KeyEvent.VK_O)  Keycode.O.SetUp();
                if(c == (int)'ó')       Keycode.Ó.SetUp();
                if(c == (int)'ö')       Keycode.Ö.SetUp();
                if(c == (int)'ő')       Keycode.Ő.SetUp();
                if(k == KeyEvent.VK_P)  Keycode.P.SetUp();
                if(k == KeyEvent.VK_Q)  Keycode.Q.SetUp();
                if(k == KeyEvent.VK_R)  Keycode.R.SetUp();
                if(k == KeyEvent.VK_S)  Keycode.S.SetUp();
                if(k == KeyEvent.VK_T)  Keycode.T.SetUp();
                if(k == KeyEvent.VK_U)  Keycode.U.SetUp();
                if(c == (int)'ú')       Keycode.Ú.SetUp();
                if(c == (int)'ü')       Keycode.Ü.SetUp();
                if(c == (int)'ű')       Keycode.Ű.SetUp();
                if(k == KeyEvent.VK_V)  Keycode.V.SetUp();
                if(k == KeyEvent.VK_W)  Keycode.W.SetUp();
                if(k == KeyEvent.VK_X)  Keycode.X.SetUp();
                if(k == KeyEvent.VK_Y)  Keycode.Y.SetUp();
                if(k == KeyEvent.VK_Z)  Keycode.Z.SetUp();

                if(k == KeyEvent.VK_0)  Keycode.ZERO.SetUp();
                if(k == KeyEvent.VK_1)  Keycode.ONE.SetUp();
                if(k == KeyEvent.VK_2)  Keycode.TWO.SetUp();
                if(k == KeyEvent.VK_3)  Keycode.THREE.SetUp();
                if(k == KeyEvent.VK_4)  Keycode.FOUR.SetUp();
                if(k == KeyEvent.VK_5)  Keycode.FIVE.SetUp();
                if(k == KeyEvent.VK_6)  Keycode.SIX.SetUp();
                if(k == KeyEvent.VK_7)  Keycode.SEVEN.SetUp();
                if(k == KeyEvent.VK_8)  Keycode.EIGHT.SetUp();
                if(k == KeyEvent.VK_9)  Keycode.NINE.SetUp();

                if(k == KeyEvent.VK_F1)  Keycode.F1.SetUp();
                if(k == KeyEvent.VK_F2)  Keycode.F2.SetUp();
                if(k == KeyEvent.VK_F3)  Keycode.F3.SetUp();
                if(k == KeyEvent.VK_F4)  Keycode.F4.SetUp();
                if(k == KeyEvent.VK_F5)  Keycode.F5.SetUp();
                if(k == KeyEvent.VK_F6)  Keycode.F6.SetUp();
                if(k == KeyEvent.VK_F7)  Keycode.F7.SetUp();
                if(k == KeyEvent.VK_F8)  Keycode.F8.SetUp();
                if(k == KeyEvent.VK_F9)  Keycode.F9.SetUp();
                if(k == KeyEvent.VK_F10) Keycode.F10.SetUp();
                if(k == KeyEvent.VK_F11) Keycode.F11.SetUp();
                if(k == KeyEvent.VK_F12) Keycode.F12.SetUp();

                if(k == KeyEvent.VK_ESCAPE)  Keycode.ESCAPE.SetUp();
                if(k == KeyEvent.VK_TAB)    Keycode.TAB.SetUp();
                if(k == KeyEvent.VK_CAPS_LOCK)     Keycode.CAPS_LOCK.SetUp();
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 2)  Keycode.LEFT_SHIFT.SetUp();
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 2)  Keycode.LEFT_CTRL.SetUp();
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 3)  Keycode.RIGHT_SHIFT.SetUp();
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 3)  Keycode.RIGHT_CTRL.SetUp();
                if(k == KeyEvent.VK_ALT)  Keycode.ALT.SetUp();
                if(k == KeyEvent.VK_ALT_GRAPH)  Keycode.ALT_GRAPH.SetUp();
                if(k == KeyEvent.VK_SPACE)  Keycode.SPACE.SetUp();
                if(k == KeyEvent.VK_ENTER && e.getKeyLocation() == 1)  Keycode.ENTER.SetUp();
                if(k == KeyEvent.VK_BACK_SPACE)  Keycode.BACKSPACE.SetUp();

                if(k == KeyEvent.VK_SCROLL_LOCK)  Keycode.SCROLL_LOCK.SetUp();
                if(k == KeyEvent.VK_INSERT)  Keycode.INSERT.SetUp();
                if(k == KeyEvent.VK_HOME)  Keycode.HOME.SetUp();
                if(k == KeyEvent.VK_PAGE_UP)  Keycode.PAGE_UP.SetUp();
                if(k == KeyEvent.VK_PAGE_DOWN)  Keycode.PAGE_DOWN.SetUp();
                if(k == KeyEvent.VK_DELETE)  Keycode.DELETE.SetUp();
                if(k == KeyEvent.VK_END)  Keycode.END.SetUp();

                if(k == KeyEvent.VK_UP)  Keycode.ARROW_UP.SetUp();
                if(k == KeyEvent.VK_DOWN)  Keycode.ARROW_DOWN.SetUp();
                if(k == KeyEvent.VK_RIGHT)  Keycode.ARROW_RIGHT.SetUp();
                if(k == KeyEvent.VK_LEFT)  Keycode.ARROW_LEFT.SetUp();

                if(k == KeyEvent.VK_NUM_LOCK)  Keycode.NUM_LOCK.SetUp();
                if(k == 111)  Keycode.NUM_DEVISION.SetUp();
                if(k == 106)  Keycode.NUM_MULTIPLICATION.SetUp();
                if(k == 109)  Keycode.NUM_MINUS.SetUp();
                if(k == 107)  Keycode.NUM_PLUS.SetUp();
                if(k == 10 && e.getKeyLocation() == 4)  Keycode.NUM_ENTER.SetUp();
                if(k == 110)  Keycode.NUM_COMMA.SetUp();
                if(k == KeyEvent.VK_NUMPAD0)  Keycode.NUM_ZERO.SetUp();
                if(k == KeyEvent.VK_NUMPAD1)  Keycode.NUM_ONE.SetUp();
                if(k == KeyEvent.VK_NUMPAD2)  Keycode.NUM_TWO.SetUp();
                if(k == KeyEvent.VK_NUMPAD3)  Keycode.NUM_THREE.SetUp();
                if(k == KeyEvent.VK_NUMPAD4)  Keycode.NUM_FOUR.SetUp();
                if(k == KeyEvent.VK_NUMPAD5)  Keycode.NUM_FIVE.SetUp();
                if(k == KeyEvent.VK_NUMPAD6)  Keycode.NUM_SIX.SetUp();
                if(k == KeyEvent.VK_NUMPAD7)  Keycode.NUM_SEVEN.SetUp();
                if(k == KeyEvent.VK_NUMPAD8)  Keycode.NUM_EIGHT.SetUp();
                if(k == KeyEvent.VK_NUMPAD9)  Keycode.NUM_NINE.SetUp();
            }
        });
        window.addMouseListener(new MouseInputListener()
        {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int m = e.getButton();
                
                pressedButton = m;
                if(lastButton == m) return;
                lastButton = m;
                Mouse.ANY.SetDown();
                if(m == MouseEvent.BUTTON1) Mouse.LEFT.SetDown();
                if(m == MouseEvent.BUTTON2) Mouse.MIDDLE.SetDown();
                if(m == MouseEvent.BUTTON3) Mouse.RIGHT.SetDown();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int m = e.getButton();
                pressedButton = m;
                lastButton = 0;
                
                Mouse.ANY.SetUp();
                if(m == MouseEvent.BUTTON1) Mouse.LEFT.SetUp();
                if(m == MouseEvent.BUTTON2) Mouse.MIDDLE.SetUp();
                if(m == MouseEvent.BUTTON3) Mouse.RIGHT.SetUp();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                try {
                    Frame.innerMethods[15].invoke(null);
                } catch (Exception ex) {}
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                try {
                    Frame.innerMethods[16].invoke(null);
                } catch (Exception ex) {}
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                //
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //
                
            }
            
        });
        window.addMouseMotionListener(new MouseMotionListener()
        {

            @Override
            public void mouseDragged(MouseEvent e) {
                //
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                Mouse.WindowLocation = new Point(e.getX(), e.getY());
                Mouse.ScreenLocation = new Point(e.getXOnScreen(), e.getYOnScreen());
            }
            
        });
        window.addMouseWheelListener(new MouseWheelListener()
        {

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                Mouse.SetDirection(e.getScrollAmount() * e.getWheelRotation());

            }
            
        });
    }

    public static boolean GetKeyDown(Key keycode)
    {
        return keycode.GetDown();
    }

    public static boolean GetKeyPressed(Key keycode) {
        return keycode.GetPressed();
    }
    public static boolean GetKeyUp(Key keycode)
    {
        return keycode.GetUp();
    }
    public static boolean GetKey(Key keycode)
    {
        return keycode.GetDown() || keycode.GetPressed() || keycode.GetUp();
    }
    public static char GetKeyChar()
    {
        return pressedChar;
    }

    public static int GetKeyCode()
    {
        return pressedKey;
    }

    public static boolean GetButtonDown(MouseButton mouse)
    {
        return mouse.GetDown();
    }

    public static boolean GetButtonPressed(MouseButton mouse)
    {
        return mouse.GetPressed();
    }

    public static boolean GetButtonUp(MouseButton mouse)
    {
        return mouse.GetUp();
    }

    public static boolean GetButton(MouseButton mouse)
    {
        return mouse.GetDown() || mouse.GetUp();
    }

    public static int GetMouseButtonCode()
    {
        return pressedButton;
    }
}
