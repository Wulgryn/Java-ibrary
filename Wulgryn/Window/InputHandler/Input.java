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

    private static int pressedButton;

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

                Keycode.ANY.SetPressed(true);
                if(k == KeyEvent.VK_A)  Keycode.A.SetPressed(true);
                if(c == (int)'á')       Keycode.Á.SetPressed(true);
                if(k == KeyEvent.VK_B)  Keycode.B.SetPressed(true);
                if(k == KeyEvent.VK_C)  Keycode.C.SetPressed(true);
                if(k == KeyEvent.VK_D)  Keycode.D.SetPressed(true);
                if(k == KeyEvent.VK_E)  Keycode.E.SetPressed(true);
                if(c == (int)'é')       Keycode.É.SetPressed(true);
                if(k == KeyEvent.VK_F)  Keycode.F.SetPressed(true);
                if(k == KeyEvent.VK_G)  Keycode.G.SetPressed(true);
                if(k == KeyEvent.VK_H)  Keycode.H.SetPressed(true);
                if(k == KeyEvent.VK_I)  Keycode.I.SetPressed(true);
                if(c == (int)'í')       Keycode.Í.SetPressed(true);
                if(k == KeyEvent.VK_J)  Keycode.J.SetPressed(true);
                if(k == KeyEvent.VK_K)  Keycode.K.SetPressed(true);
                if(k == KeyEvent.VK_L)  Keycode.L.SetPressed(true);
                if(k == KeyEvent.VK_M)  Keycode.M.SetPressed(true);
                if(k == KeyEvent.VK_N)  Keycode.N.SetPressed(true);
                if(k == KeyEvent.VK_O)  Keycode.O.SetPressed(true);
                if(c == (int)'ó')       Keycode.Ó.SetPressed(true);
                if(c == (int)'ö')       Keycode.Ö.SetPressed(true);
                if(c == (int)'ő')       Keycode.Ő.SetPressed(true);
                if(k == KeyEvent.VK_P)  Keycode.P.SetPressed(true);
                if(k == KeyEvent.VK_Q)  Keycode.Q.SetPressed(true);
                if(k == KeyEvent.VK_R)  Keycode.R.SetPressed(true);
                if(k == KeyEvent.VK_S)  Keycode.S.SetPressed(true);
                if(k == KeyEvent.VK_T)  Keycode.T.SetPressed(true);
                if(k == KeyEvent.VK_U)  Keycode.U.SetPressed(true);
                if(c == (int)'ú')       Keycode.Ú.SetPressed(true);
                if(c == (int)'ü')       Keycode.Ü.SetPressed(true);
                if(c == (int)'ű')       Keycode.Ű.SetPressed(true);
                if(k == KeyEvent.VK_V)  Keycode.V.SetPressed(true);
                if(k == KeyEvent.VK_W)  Keycode.W.SetPressed(true);
                if(k == KeyEvent.VK_X)  Keycode.X.SetPressed(true);
                if(k == KeyEvent.VK_Y)  Keycode.Y.SetPressed(true);
                if(k == KeyEvent.VK_Z)  Keycode.Z.SetPressed(true);

                if(k == KeyEvent.VK_0)  Keycode.ZERO.SetPressed(true);
                if(k == KeyEvent.VK_1)  Keycode.ONE.SetPressed(true);
                if(k == KeyEvent.VK_2)  Keycode.TWO.SetPressed(true);
                if(k == KeyEvent.VK_3)  Keycode.THREE.SetPressed(true);
                if(k == KeyEvent.VK_4)  Keycode.FOUR.SetPressed(true);
                if(k == KeyEvent.VK_5)  Keycode.FIVE.SetPressed(true);
                if(k == KeyEvent.VK_6)  Keycode.SIX.SetPressed(true);
                if(k == KeyEvent.VK_7)  Keycode.SEVEN.SetPressed(true);
                if(k == KeyEvent.VK_8)  Keycode.EIGHT.SetPressed(true);
                if(k == KeyEvent.VK_9)  Keycode.NINE.SetPressed(true);

                if(k == KeyEvent.VK_F1)  Keycode.F1.SetPressed(true);
                if(k == KeyEvent.VK_F2)  Keycode.F2.SetPressed(true);
                if(k == KeyEvent.VK_F3)  Keycode.F3.SetPressed(true);
                if(k == KeyEvent.VK_F4)  Keycode.F4.SetPressed(true);
                if(k == KeyEvent.VK_F5)  Keycode.F5.SetPressed(true);
                if(k == KeyEvent.VK_F6)  Keycode.F6.SetPressed(true);
                if(k == KeyEvent.VK_F7)  Keycode.F7.SetPressed(true);
                if(k == KeyEvent.VK_F8)  Keycode.F8.SetPressed(true);
                if(k == KeyEvent.VK_F9)  Keycode.F9.SetPressed(true);
                if(k == KeyEvent.VK_F10) Keycode.F10.SetPressed(true);
                if(k == KeyEvent.VK_F11) Keycode.F11.SetPressed(true);
                if(k == KeyEvent.VK_F12) Keycode.F12.SetPressed(true);

                if(k == KeyEvent.VK_ESCAPE)  Keycode.ESCAPE.SetPressed(true);
                if(k == KeyEvent.VK_TAB)    Keycode.TAB.SetPressed(true);
                if(k == KeyEvent.VK_CAPS_LOCK)     Keycode.CAPS_LOCK.SetPressed(true);
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 2)  Keycode.LEFT_SHIFT.SetPressed(true);
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 2)  Keycode.LEFT_CTRL.SetPressed(true);
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 3)  Keycode.RIGHT_SHIFT.SetPressed(true);
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 3)  Keycode.RIGHT_CTRL.SetPressed(true);
                if(k == KeyEvent.VK_ALT)  Keycode.ALT.SetPressed(true);
                if(k == KeyEvent.VK_ALT_GRAPH)  Keycode.ALT_GRAPH.SetPressed(true);
                if(k == KeyEvent.VK_SPACE)  Keycode.SPACE.SetPressed(true);
                if(k == KeyEvent.VK_ENTER && e.getKeyLocation() == 1)  Keycode.ENTER.SetPressed(true);
                if(k == KeyEvent.VK_BACK_SPACE)  Keycode.BACKSPACE.SetPressed(true);

                if(k == KeyEvent.VK_SCROLL_LOCK)  Keycode.SCROLL_LOCK.SetPressed(true);
                if(k == KeyEvent.VK_INSERT)  Keycode.INSERT.SetPressed(true);
                if(k == KeyEvent.VK_HOME)  Keycode.HOME.SetPressed(true);
                if(k == KeyEvent.VK_PAGE_UP)  Keycode.PAGE_UP.SetPressed(true);
                if(k == KeyEvent.VK_PAGE_DOWN)  Keycode.PAGE_DOWN.SetPressed(true);
                if(k == KeyEvent.VK_DELETE)  Keycode.DELETE.SetPressed(true);
                if(k == KeyEvent.VK_END)  Keycode.END.SetPressed(true);

                if(k == KeyEvent.VK_UP)  Keycode.ARROW_UP.SetPressed(true);
                if(k == KeyEvent.VK_DOWN)  Keycode.ARROW_DOWN.SetPressed(true);
                if(k == KeyEvent.VK_RIGHT)  Keycode.ARROW_RIGHT.SetPressed(true);
                if(k == KeyEvent.VK_LEFT)  Keycode.ARROW_LEFT.SetPressed(true);

                if(k == KeyEvent.VK_NUM_LOCK)  Keycode.NUM_LOCK.SetPressed(true);
                if(k == 111)  Keycode.NUM_DEVISION.SetPressed(true);
                if(k == 106)  Keycode.NUM_MULTIPLICATION.SetPressed(true);
                if(k == 109)  Keycode.NUM_MINUS.SetPressed(true);
                if(k == 107)  Keycode.NUM_PLUS.SetPressed(true);
                if(k == 10 && e.getKeyLocation() == 4)  Keycode.NUM_ENTER.SetPressed(true);
                if(k == 110)  Keycode.NUM_COMMA.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD0)  Keycode.NUM_ZERO.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD1)  Keycode.NUM_ONE.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD2)  Keycode.NUM_TWO.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD3)  Keycode.NUM_THREE.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD4)  Keycode.NUM_FOUR.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD5)  Keycode.NUM_FIVE.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD6)  Keycode.NUM_SIX.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD7)  Keycode.NUM_SEVEN.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD8)  Keycode.NUM_EIGHT.SetPressed(true);
                if(k == KeyEvent.VK_NUMPAD9)  Keycode.NUM_NINE.SetPressed(true);

                if(k == lastKey && c == lastChar)return;
                lastKey = k;
                lastChar = c;
                
                Keycode.ANY.SetDown(true);
                if(k == KeyEvent.VK_A)  Keycode.A.SetDown(true);
                if(c == (int)'á')       Keycode.Á.SetDown(true);
                if(k == KeyEvent.VK_B)  Keycode.B.SetDown(true);
                if(k == KeyEvent.VK_C)  Keycode.C.SetDown(true);
                if(k == KeyEvent.VK_D)  Keycode.D.SetDown(true);
                if(k == KeyEvent.VK_E)  Keycode.E.SetDown(true);
                if(c == (int)'é')       Keycode.É.SetDown(true);
                if(k == KeyEvent.VK_F)  Keycode.F.SetDown(true);
                if(k == KeyEvent.VK_G)  Keycode.G.SetDown(true);
                if(k == KeyEvent.VK_H)  Keycode.H.SetDown(true);
                if(k == KeyEvent.VK_I)  Keycode.I.SetDown(true);
                if(c == (int)'í')       Keycode.Í.SetDown(true);
                if(k == KeyEvent.VK_J)  Keycode.J.SetDown(true);
                if(k == KeyEvent.VK_K)  Keycode.K.SetDown(true);
                if(k == KeyEvent.VK_L)  Keycode.L.SetDown(true);
                if(k == KeyEvent.VK_M)  Keycode.M.SetDown(true);
                if(k == KeyEvent.VK_N)  Keycode.N.SetDown(true);
                if(k == KeyEvent.VK_O)  Keycode.O.SetDown(true);
                if(c == (int)'ó')       Keycode.Ó.SetDown(true);
                if(c == (int)'ö')       Keycode.Ö.SetDown(true);
                if(c == (int)'ő')       Keycode.Ő.SetDown(true);
                if(k == KeyEvent.VK_P)  Keycode.P.SetDown(true);
                if(k == KeyEvent.VK_Q)  Keycode.Q.SetDown(true);
                if(k == KeyEvent.VK_R)  Keycode.R.SetDown(true);
                if(k == KeyEvent.VK_S)  Keycode.S.SetDown(true);
                if(k == KeyEvent.VK_T)  Keycode.T.SetDown(true);
                if(k == KeyEvent.VK_U)  Keycode.U.SetDown(true);
                if(c == (int)'ú')       Keycode.Ú.SetDown(true);
                if(c == (int)'ü')       Keycode.Ü.SetDown(true);
                if(c == (int)'ű')       Keycode.Ű.SetDown(true);
                if(k == KeyEvent.VK_V)  Keycode.V.SetDown(true);
                if(k == KeyEvent.VK_W)  Keycode.W.SetDown(true);
                if(k == KeyEvent.VK_X)  Keycode.X.SetDown(true);
                if(k == KeyEvent.VK_Y)  Keycode.Y.SetDown(true);
                if(k == KeyEvent.VK_Z)  Keycode.Z.SetDown(true);

                if(k == KeyEvent.VK_0)  Keycode.ZERO.SetDown(true);
                if(k == KeyEvent.VK_1)  Keycode.ONE.SetDown(true);
                if(k == KeyEvent.VK_2)  Keycode.TWO.SetDown(true);
                if(k == KeyEvent.VK_3)  Keycode.THREE.SetDown(true);
                if(k == KeyEvent.VK_4)  Keycode.FOUR.SetDown(true);
                if(k == KeyEvent.VK_5)  Keycode.FIVE.SetDown(true);
                if(k == KeyEvent.VK_6)  Keycode.SIX.SetDown(true);
                if(k == KeyEvent.VK_7)  Keycode.SEVEN.SetDown(true);
                if(k == KeyEvent.VK_8)  Keycode.EIGHT.SetDown(true);
                if(k == KeyEvent.VK_9)  Keycode.NINE.SetDown(true);

                if(k == KeyEvent.VK_F1)  Keycode.F1.SetDown(true);
                if(k == KeyEvent.VK_F2)  Keycode.F2.SetDown(true);
                if(k == KeyEvent.VK_F3)  Keycode.F3.SetDown(true);
                if(k == KeyEvent.VK_F4)  Keycode.F4.SetDown(true);
                if(k == KeyEvent.VK_F5)  Keycode.F5.SetDown(true);
                if(k == KeyEvent.VK_F6)  Keycode.F6.SetDown(true);
                if(k == KeyEvent.VK_F7)  Keycode.F7.SetDown(true);
                if(k == KeyEvent.VK_F8)  Keycode.F8.SetDown(true);
                if(k == KeyEvent.VK_F9)  Keycode.F9.SetDown(true);
                if(k == KeyEvent.VK_F10) Keycode.F10.SetDown(true);
                if(k == KeyEvent.VK_F11) Keycode.F11.SetDown(true);
                if(k == KeyEvent.VK_F12) Keycode.F12.SetDown(true);

                if(k == KeyEvent.VK_ESCAPE)  Keycode.ESCAPE.SetDown(true);
                if(k == KeyEvent.VK_TAB)    Keycode.TAB.SetDown(true);
                if(k == KeyEvent.VK_CAPS_LOCK)     Keycode.CAPS_LOCK.SetDown(true);
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 2)  Keycode.LEFT_SHIFT.SetDown(true);
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 2)  Keycode.LEFT_CTRL.SetDown(true);
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 3)  Keycode.RIGHT_SHIFT.SetDown(true);
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 3)  Keycode.RIGHT_CTRL.SetDown(true);
                if(k == KeyEvent.VK_ALT)  Keycode.ALT.SetDown(true);
                if(k == KeyEvent.VK_ALT_GRAPH)  Keycode.ALT_GRAPH.SetDown(true);
                if(k == KeyEvent.VK_SPACE)  Keycode.SPACE.SetDown(true);
                if(k == KeyEvent.VK_ENTER && e.getKeyLocation() == 1)  Keycode.ENTER.SetDown(true);
                if(k == KeyEvent.VK_BACK_SPACE)  Keycode.BACKSPACE.SetDown(true);

                if(k == KeyEvent.VK_SCROLL_LOCK)  Keycode.SCROLL_LOCK.SetDown(true);
                if(k == KeyEvent.VK_INSERT)  Keycode.INSERT.SetDown(true);
                if(k == KeyEvent.VK_HOME)  Keycode.HOME.SetDown(true);
                if(k == KeyEvent.VK_PAGE_UP)  Keycode.PAGE_UP.SetDown(true);
                if(k == KeyEvent.VK_PAGE_DOWN)  Keycode.PAGE_DOWN.SetDown(true);
                if(k == KeyEvent.VK_DELETE)  Keycode.DELETE.SetDown(true);
                if(k == KeyEvent.VK_END)  Keycode.END.SetDown(true);

                if(k == KeyEvent.VK_UP)  Keycode.ARROW_UP.SetDown(true);
                if(k == KeyEvent.VK_DOWN)  Keycode.ARROW_DOWN.SetDown(true);
                if(k == KeyEvent.VK_RIGHT)  Keycode.ARROW_RIGHT.SetDown(true);
                if(k == KeyEvent.VK_LEFT)  Keycode.ARROW_LEFT.SetDown(true);

                if(k == KeyEvent.VK_NUM_LOCK)  Keycode.NUM_LOCK.SetDown(true);
                if(k == 111)  Keycode.NUM_DEVISION.SetDown(true);
                if(k == 106)  Keycode.NUM_MULTIPLICATION.SetDown(true);
                if(k == 109)  Keycode.NUM_MINUS.SetDown(true);
                if(k == 107)  Keycode.NUM_PLUS.SetDown(true);
                if(k == 10 && e.getKeyLocation() == 4)  Keycode.NUM_ENTER.SetDown(true);
                if(k == 110)  Keycode.NUM_COMMA.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD0)  Keycode.NUM_ZERO.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD1)  Keycode.NUM_ONE.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD2)  Keycode.NUM_TWO.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD3)  Keycode.NUM_THREE.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD4)  Keycode.NUM_FOUR.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD5)  Keycode.NUM_FIVE.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD6)  Keycode.NUM_SIX.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD7)  Keycode.NUM_SEVEN.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD8)  Keycode.NUM_EIGHT.SetDown(true);
                if(k == KeyEvent.VK_NUMPAD9)  Keycode.NUM_NINE.SetDown(true);

                if(!Key.delay)
                {
                    Keycode.ANY.SetPressed(true);
                    if(k == KeyEvent.VK_A)  Keycode.A.SetPressed(true);
                    if(c == (int)'á')       Keycode.Á.SetPressed(true);
                    if(k == KeyEvent.VK_B)  Keycode.B.SetPressed(true);
                    if(k == KeyEvent.VK_C)  Keycode.C.SetPressed(true);
                    if(k == KeyEvent.VK_D)  Keycode.D.SetPressed(true);
                    if(k == KeyEvent.VK_E)  Keycode.E.SetPressed(true);
                    if(c == (int)'é')       Keycode.É.SetPressed(true);
                    if(k == KeyEvent.VK_F)  Keycode.F.SetPressed(true);
                    if(k == KeyEvent.VK_G)  Keycode.G.SetPressed(true);
                    if(k == KeyEvent.VK_H)  Keycode.H.SetPressed(true);
                    if(k == KeyEvent.VK_I)  Keycode.I.SetPressed(true);
                    if(c == (int)'í')       Keycode.Í.SetPressed(true);
                    if(k == KeyEvent.VK_J)  Keycode.J.SetPressed(true);
                    if(k == KeyEvent.VK_K)  Keycode.K.SetPressed(true);
                    if(k == KeyEvent.VK_L)  Keycode.L.SetPressed(true);
                    if(k == KeyEvent.VK_M)  Keycode.M.SetPressed(true);
                    if(k == KeyEvent.VK_N)  Keycode.N.SetPressed(true);
                    if(k == KeyEvent.VK_O)  Keycode.O.SetPressed(true);
                    if(c == (int)'ó')       Keycode.Ó.SetPressed(true);
                    if(c == (int)'ö')       Keycode.Ö.SetPressed(true);
                    if(c == (int)'ő')       Keycode.Ő.SetPressed(true);
                    if(k == KeyEvent.VK_P)  Keycode.P.SetPressed(true);
                    if(k == KeyEvent.VK_Q)  Keycode.Q.SetPressed(true);
                    if(k == KeyEvent.VK_R)  Keycode.R.SetPressed(true);
                    if(k == KeyEvent.VK_S)  Keycode.S.SetPressed(true);
                    if(k == KeyEvent.VK_T)  Keycode.T.SetPressed(true);
                    if(k == KeyEvent.VK_U)  Keycode.U.SetPressed(true);
                    if(c == (int)'ú')       Keycode.Ú.SetPressed(true);
                    if(c == (int)'ü')       Keycode.Ü.SetPressed(true);
                    if(c == (int)'ű')       Keycode.Ű.SetPressed(true);
                    if(k == KeyEvent.VK_V)  Keycode.V.SetPressed(true);
                    if(k == KeyEvent.VK_W)  Keycode.W.SetPressed(true);
                    if(k == KeyEvent.VK_X)  Keycode.X.SetPressed(true);
                    if(k == KeyEvent.VK_Y)  Keycode.Y.SetPressed(true);
                    if(k == KeyEvent.VK_Z)  Keycode.Z.SetPressed(true);
                    
                    if(k == KeyEvent.VK_0)  Keycode.ZERO.SetPressed(true);
                    if(k == KeyEvent.VK_1)  Keycode.ONE.SetPressed(true);
                    if(k == KeyEvent.VK_2)  Keycode.TWO.SetPressed(true);
                    if(k == KeyEvent.VK_3)  Keycode.THREE.SetPressed(true);
                    if(k == KeyEvent.VK_4)  Keycode.FOUR.SetPressed(true);
                    if(k == KeyEvent.VK_5)  Keycode.FIVE.SetPressed(true);
                    if(k == KeyEvent.VK_6)  Keycode.SIX.SetPressed(true);
                    if(k == KeyEvent.VK_7)  Keycode.SEVEN.SetPressed(true);
                    if(k == KeyEvent.VK_8)  Keycode.EIGHT.SetPressed(true);
                    if(k == KeyEvent.VK_9)  Keycode.NINE.SetPressed(true);
                    
                    if(k == KeyEvent.VK_F1)  Keycode.F1.SetPressed(true);
                    if(k == KeyEvent.VK_F2)  Keycode.F2.SetPressed(true);
                    if(k == KeyEvent.VK_F3)  Keycode.F3.SetPressed(true);
                    if(k == KeyEvent.VK_F4)  Keycode.F4.SetPressed(true);
                    if(k == KeyEvent.VK_F5)  Keycode.F5.SetPressed(true);
                    if(k == KeyEvent.VK_F6)  Keycode.F6.SetPressed(true);
                    if(k == KeyEvent.VK_F7)  Keycode.F7.SetPressed(true);
                    if(k == KeyEvent.VK_F8)  Keycode.F8.SetPressed(true);
                    if(k == KeyEvent.VK_F9)  Keycode.F9.SetPressed(true);
                    if(k == KeyEvent.VK_F10) Keycode.F10.SetPressed(true);
                    if(k == KeyEvent.VK_F11) Keycode.F11.SetPressed(true);
                    if(k == KeyEvent.VK_F12) Keycode.F12.SetPressed(true);
                    
                    if(k == KeyEvent.VK_ESCAPE)  Keycode.ESCAPE.SetPressed(true);
                    if(k == KeyEvent.VK_TAB)    Keycode.TAB.SetPressed(true);
                    if(k == KeyEvent.VK_CAPS_LOCK)     Keycode.CAPS_LOCK.SetPressed(true);
                    if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 2)  Keycode.LEFT_SHIFT.SetPressed(true);
                    if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 2)  Keycode.LEFT_CTRL.SetPressed(true);
                    if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 3)  Keycode.RIGHT_SHIFT.SetPressed(true);
                    if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 3)  Keycode.RIGHT_CTRL.SetPressed(true);
                    if(k == KeyEvent.VK_ALT)  Keycode.ALT.SetPressed(true);
                    if(k == KeyEvent.VK_ALT_GRAPH)  Keycode.ALT_GRAPH.SetPressed(true);
                    if(k == KeyEvent.VK_SPACE)  Keycode.SPACE.SetPressed(true);
                    if(k == KeyEvent.VK_ENTER && e.getKeyLocation() == 1)  Keycode.ENTER.SetPressed(true);
                    if(k == KeyEvent.VK_BACK_SPACE)  Keycode.BACKSPACE.SetPressed(true);
                    
                    if(k == KeyEvent.VK_SCROLL_LOCK)  Keycode.SCROLL_LOCK.SetPressed(true);
                    if(k == KeyEvent.VK_INSERT)  Keycode.INSERT.SetPressed(true);
                    if(k == KeyEvent.VK_HOME)  Keycode.HOME.SetPressed(true);
                    if(k == KeyEvent.VK_PAGE_UP)  Keycode.PAGE_UP.SetPressed(true);
                    if(k == KeyEvent.VK_PAGE_DOWN)  Keycode.PAGE_DOWN.SetPressed(true);
                    if(k == KeyEvent.VK_DELETE)  Keycode.DELETE.SetPressed(true);
                    if(k == KeyEvent.VK_END)  Keycode.END.SetPressed(true);
                    
                    if(k == KeyEvent.VK_UP)  Keycode.ARROW_UP.SetPressed(true);
                    if(k == KeyEvent.VK_DOWN)  Keycode.ARROW_DOWN.SetPressed(true);
                    if(k == KeyEvent.VK_RIGHT)  Keycode.ARROW_RIGHT.SetPressed(true);
                    if(k == KeyEvent.VK_LEFT)  Keycode.ARROW_LEFT.SetPressed(true);
                    
                    if(k == KeyEvent.VK_NUM_LOCK)  Keycode.NUM_LOCK.SetPressed(true);
                    if(k == 111)  Keycode.NUM_DEVISION.SetPressed(true);
                    if(k == 106)  Keycode.NUM_MULTIPLICATION.SetPressed(true);
                    if(k == 109)  Keycode.NUM_MINUS.SetPressed(true);
                    if(k == 107)  Keycode.NUM_PLUS.SetPressed(true);
                    if(k == 10 && e.getKeyLocation() == 4)  Keycode.NUM_ENTER.SetPressed(true);
                    if(k == 110)  Keycode.NUM_COMMA.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD0)  Keycode.NUM_ZERO.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD1)  Keycode.NUM_ONE.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD2)  Keycode.NUM_TWO.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD3)  Keycode.NUM_THREE.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD4)  Keycode.NUM_FOUR.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD5)  Keycode.NUM_FIVE.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD6)  Keycode.NUM_SIX.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD7)  Keycode.NUM_SEVEN.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD8)  Keycode.NUM_EIGHT.SetPressed(true);
                    if(k == KeyEvent.VK_NUMPAD9)  Keycode.NUM_NINE.SetPressed(true);
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

                Keycode.ANY.SetUp(true);
                if(k == KeyEvent.VK_A)  Keycode.A.SetUp(true);
                if(c == (int)'á')       Keycode.Á.SetUp(true);
                if(k == KeyEvent.VK_B)  Keycode.B.SetUp(true);
                if(k == KeyEvent.VK_C)  Keycode.C.SetUp(true);
                if(k == KeyEvent.VK_D)  Keycode.D.SetUp(true);
                if(k == KeyEvent.VK_E)  Keycode.E.SetUp(true);
                if(c == (int)'é')       Keycode.É.SetUp(true);
                if(k == KeyEvent.VK_F)  Keycode.F.SetUp(true);
                if(k == KeyEvent.VK_G)  Keycode.G.SetUp(true);
                if(k == KeyEvent.VK_H)  Keycode.H.SetUp(true);
                if(k == KeyEvent.VK_I)  Keycode.I.SetUp(true);
                if(c == (int)'í')       Keycode.Í.SetUp(true);
                if(k == KeyEvent.VK_J)  Keycode.J.SetUp(true);
                if(k == KeyEvent.VK_K)  Keycode.K.SetUp(true);
                if(k == KeyEvent.VK_L)  Keycode.L.SetUp(true);
                if(k == KeyEvent.VK_M)  Keycode.M.SetUp(true);
                if(k == KeyEvent.VK_N)  Keycode.N.SetUp(true);
                if(k == KeyEvent.VK_O)  Keycode.O.SetUp(true);
                if(c == (int)'ó')       Keycode.Ó.SetUp(true);
                if(c == (int)'ö')       Keycode.Ö.SetUp(true);
                if(c == (int)'ő')       Keycode.Ő.SetUp(true);
                if(k == KeyEvent.VK_P)  Keycode.P.SetUp(true);
                if(k == KeyEvent.VK_Q)  Keycode.Q.SetUp(true);
                if(k == KeyEvent.VK_R)  Keycode.R.SetUp(true);
                if(k == KeyEvent.VK_S)  Keycode.S.SetUp(true);
                if(k == KeyEvent.VK_T)  Keycode.T.SetUp(true);
                if(k == KeyEvent.VK_U)  Keycode.U.SetUp(true);
                if(c == (int)'ú')       Keycode.Ú.SetUp(true);
                if(c == (int)'ü')       Keycode.Ü.SetUp(true);
                if(c == (int)'ű')       Keycode.Ű.SetUp(true);
                if(k == KeyEvent.VK_V)  Keycode.V.SetUp(true);
                if(k == KeyEvent.VK_W)  Keycode.W.SetUp(true);
                if(k == KeyEvent.VK_X)  Keycode.X.SetUp(true);
                if(k == KeyEvent.VK_Y)  Keycode.Y.SetUp(true);
                if(k == KeyEvent.VK_Z)  Keycode.Z.SetUp(true);

                if(k == KeyEvent.VK_0)  Keycode.ZERO.SetUp(true);
                if(k == KeyEvent.VK_1)  Keycode.ONE.SetUp(true);
                if(k == KeyEvent.VK_2)  Keycode.TWO.SetUp(true);
                if(k == KeyEvent.VK_3)  Keycode.THREE.SetUp(true);
                if(k == KeyEvent.VK_4)  Keycode.FOUR.SetUp(true);
                if(k == KeyEvent.VK_5)  Keycode.FIVE.SetUp(true);
                if(k == KeyEvent.VK_6)  Keycode.SIX.SetUp(true);
                if(k == KeyEvent.VK_7)  Keycode.SEVEN.SetUp(true);
                if(k == KeyEvent.VK_8)  Keycode.EIGHT.SetUp(true);
                if(k == KeyEvent.VK_9)  Keycode.NINE.SetUp(true);

                if(k == KeyEvent.VK_F1)  Keycode.F1.SetUp(true);
                if(k == KeyEvent.VK_F2)  Keycode.F2.SetUp(true);
                if(k == KeyEvent.VK_F3)  Keycode.F3.SetUp(true);
                if(k == KeyEvent.VK_F4)  Keycode.F4.SetUp(true);
                if(k == KeyEvent.VK_F5)  Keycode.F5.SetUp(true);
                if(k == KeyEvent.VK_F6)  Keycode.F6.SetUp(true);
                if(k == KeyEvent.VK_F7)  Keycode.F7.SetUp(true);
                if(k == KeyEvent.VK_F8)  Keycode.F8.SetUp(true);
                if(k == KeyEvent.VK_F9)  Keycode.F9.SetUp(true);
                if(k == KeyEvent.VK_F10) Keycode.F10.SetUp(true);
                if(k == KeyEvent.VK_F11) Keycode.F11.SetUp(true);
                if(k == KeyEvent.VK_F12) Keycode.F12.SetUp(true);

                if(k == KeyEvent.VK_ESCAPE)  Keycode.ESCAPE.SetUp(true);
                if(k == KeyEvent.VK_TAB)    Keycode.TAB.SetUp(true);
                if(k == KeyEvent.VK_CAPS_LOCK)     Keycode.CAPS_LOCK.SetUp(true);
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 2)  Keycode.LEFT_SHIFT.SetUp(true);
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 2)  Keycode.LEFT_CTRL.SetUp(true);
                if(k == KeyEvent.VK_SHIFT && e.getKeyLocation() == 3)  Keycode.RIGHT_SHIFT.SetUp(true);
                if(k == KeyEvent.VK_CONTROL && e.getKeyLocation() == 3)  Keycode.RIGHT_CTRL.SetUp(true);
                if(k == KeyEvent.VK_ALT)  Keycode.ALT.SetUp(true);
                if(k == KeyEvent.VK_ALT_GRAPH)  Keycode.ALT_GRAPH.SetUp(true);
                if(k == KeyEvent.VK_SPACE)  Keycode.SPACE.SetUp(true);
                if(k == KeyEvent.VK_ENTER && e.getKeyLocation() == 1)  Keycode.ENTER.SetUp(true);
                if(k == KeyEvent.VK_BACK_SPACE)  Keycode.BACKSPACE.SetUp(true);

                if(k == KeyEvent.VK_SCROLL_LOCK)  Keycode.SCROLL_LOCK.SetUp(true);
                if(k == KeyEvent.VK_INSERT)  Keycode.INSERT.SetUp(true);
                if(k == KeyEvent.VK_HOME)  Keycode.HOME.SetUp(true);
                if(k == KeyEvent.VK_PAGE_UP)  Keycode.PAGE_UP.SetUp(true);
                if(k == KeyEvent.VK_PAGE_DOWN)  Keycode.PAGE_DOWN.SetUp(true);
                if(k == KeyEvent.VK_DELETE)  Keycode.DELETE.SetUp(true);
                if(k == KeyEvent.VK_END)  Keycode.END.SetUp(true);

                if(k == KeyEvent.VK_UP)  Keycode.ARROW_UP.SetUp(true);
                if(k == KeyEvent.VK_DOWN)  Keycode.ARROW_DOWN.SetUp(true);
                if(k == KeyEvent.VK_RIGHT)  Keycode.ARROW_RIGHT.SetUp(true);
                if(k == KeyEvent.VK_LEFT)  Keycode.ARROW_LEFT.SetUp(true);

                if(k == KeyEvent.VK_NUM_LOCK)  Keycode.NUM_LOCK.SetUp(true);
                if(k == 111)  Keycode.NUM_DEVISION.SetUp(true);
                if(k == 106)  Keycode.NUM_MULTIPLICATION.SetUp(true);
                if(k == 109)  Keycode.NUM_MINUS.SetUp(true);
                if(k == 107)  Keycode.NUM_PLUS.SetUp(true);
                if(k == 10 && e.getKeyLocation() == 4)  Keycode.NUM_ENTER.SetUp(true);
                if(k == 110)  Keycode.NUM_COMMA.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD0)  Keycode.NUM_ZERO.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD1)  Keycode.NUM_ONE.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD2)  Keycode.NUM_TWO.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD3)  Keycode.NUM_THREE.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD4)  Keycode.NUM_FOUR.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD5)  Keycode.NUM_FIVE.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD6)  Keycode.NUM_SIX.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD7)  Keycode.NUM_SEVEN.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD8)  Keycode.NUM_EIGHT.SetUp(true);
                if(k == KeyEvent.VK_NUMPAD9)  Keycode.NUM_NINE.SetUp(true);
            }
        });
        window.addMouseListener(new MouseInputListener()
        {

            @Override
            public void mouseClicked(MouseEvent e) {
                int m = e.getButton();
                
                pressedButton = m;
                Mouse.ANY.SetDown(true);
                if(e.getButton() == MouseEvent.BUTTON1) Mouse.LEFT.SetDown(true);
                if(e.getButton() == MouseEvent.BUTTON2) Mouse.MIDDLE.SetDown(true);
                if(e.getButton() == MouseEvent.BUTTON3) Mouse.RIGHT.SetDown(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int m = e.getButton();
                
                pressedButton = m;
                Mouse.ANY.SetPressed(true);
                if(e.getButton() == MouseEvent.BUTTON1) Mouse.LEFT.SetPressed(true);
                if(e.getButton() == MouseEvent.BUTTON2) Mouse.MIDDLE.SetPressed(true);
                if(e.getButton() == MouseEvent.BUTTON3) Mouse.RIGHT.SetPressed(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int m = e.getButton();
                
                pressedButton = m;
                Mouse.ANY.SetUp(true);
                if(e.getButton() == MouseEvent.BUTTON1) Mouse.LEFT.SetUp(true);
                if(e.getButton() == MouseEvent.BUTTON2) Mouse.MIDDLE.SetUp(true);
                if(e.getButton() == MouseEvent.BUTTON3) Mouse.RIGHT.SetUp(true);                
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
                MouseButton.SetDirection(e.getScrollAmount() * e.getWheelRotation());

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
        return mouse.GetDown() || mouse.GetPressed() || mouse.GetUp();
    }

    public static int GetMouseButtonCode()
    {
        return pressedButton;
    }
}
