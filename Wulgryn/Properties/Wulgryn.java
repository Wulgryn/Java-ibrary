package Wulgryn.Properties;

import java.lang.reflect.Method;

import Wulgryn.Window.Frame;

public class Wulgryn {
    public static void InitializeComponent(Class<?> thisClass)
    {
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

        Method windowStateChanged = null;

        Method onMouseEntered = null;
        Method onMouseLeaaved = null;

        for (Method method : thisClass.getMethods()) {
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
                case "WindowStateChanged":
                    windowStateChanged = method;
                    break;
                case "OnMouseEnter":
                    onMouseEntered = method;
                    break;
                case "OnMouseLeave":
                    onMouseLeaaved = method;
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
        Frame.innerMethods[14] = windowStateChanged;
        Frame.innerMethods[15] = onMouseEntered;
        Frame.innerMethods[16] = onMouseLeaaved;
        Frame.Render(setup,start,update,lateUpdate);
    }
}
