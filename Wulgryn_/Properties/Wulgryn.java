package Wulgryn.Properties;

import java.lang.reflect.Method;

import Wulgryn.Window.Frame;

public class Wulgryn {
    public static void InitializeComponent(Class<?> main_class)
    {
        Frame.SetMainClass(main_class);
        Method setup = null;
        Method start = null;
        Method update = null;
        Method lateUpdate = null;

        Method onResize = null;
        Method onMove = null;
        Method onShow = null;
        Method onHide = null;

        Method focusEnter = null;
        Method focusLeave = null;

        Method open = null;
        Method onClosing = null;
        Method onClosed = null;
        Method onMinimized = null;
        Method onNormalized = null;
        Method onMaximalized = null;
        Method activated = null;
        Method deactivated = null;

        Method windowStateChang = null;

        Method onMouseEnter = null;
        Method onMouseLeave = null;

        for (Method method : main_class.getMethods()) {
            switch(method.getName())
            {
                case "Setup":
                    setup = method;
                    break;
                case "Start":
                    start = method;
                    break;
                case "Update":
                    update = method;
                    break;
                case "LateUpdate":
                    lateUpdate = method;
                    break;
                case "OnResize":
                    onResize = method;
                    break;
                case "OnMove":
                    onMove = method;
                    break;
                case "OnShow":
                    onShow = method;
                    break;
                case "OnHide":
                    onHide = method;
                    break;
                case "FocusEnter":
                    focusEnter = method;
                    break;
                case "FocusLeave":
                    focusLeave = method;
                    break;
                case "Open":
                    open = method;
                    break;
                case "OnClosing":
                    onClosing = method;
                    break;
                case "OnClosed":
                    onClosed = method;
                    break;
                case "OnMinimized":
                    onMinimized = method;
                    break;
                case "OnNormalized":
                    onNormalized = method;
                    break;
                case "OnMaximalized":
                    onMaximalized = method;
                    break;
                case "Activated":
                    activated = method;
                    break;
                case "Deactivated":
                    deactivated = method;
                    break;
                case "WindowStateChang":
                    windowStateChang = method;
                    break;
                case "OnMouseEnter":
                    onMouseEnter = method;
                    break;
                case "OnMouseLeave":
                    onMouseLeave = method;
                    break;
            }
        }
        Frame.innerMethods[0] = onResize;
        Frame.innerMethods[1] = onMove;
        Frame.innerMethods[2] = onShow;
        Frame.innerMethods[3] = onHide;
        Frame.innerMethods[4] = focusEnter;
        Frame.innerMethods[5] = focusLeave;
        Frame.innerMethods[6] = open;
        Frame.innerMethods[7] = onClosing;
        Frame.innerMethods[8] = onClosed;
        Frame.innerMethods[9] = onMinimized;
        Frame.innerMethods[10] = onNormalized;
        Frame.innerMethods[11] = onMaximalized;
        Frame.innerMethods[12] = activated;
        Frame.innerMethods[13] = deactivated;
        Frame.innerMethods[14] = windowStateChang;
        Frame.innerMethods[15] = onMouseEnter;
        Frame.innerMethods[16] = onMouseLeave;
        Frame.Render(setup,start,update,lateUpdate);
    }
}
