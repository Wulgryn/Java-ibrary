package Wulgryn.Properties.Interfaces;

public interface WulgrynFrameExtension {
    public default void OnResize(){};
    public default void OnMove(){};
    public default void OnShow(){};
    public default void OnHide(){};
    public default void FocusEnter(){};
    public default void FocusLeave(){};
    public default void Open(){};
    public default void OnClosing(){};
    public default void OnClosed(){};
    public default void OnMinimized(){};
    public default void OnNormalized(){};
    public default void OnMaximalized(){};
    public default void Activated(){};
    public default void Deactivated(){};
    public default void WindowStateChang(){};
    public default void OnMouseEnter(){};
    public default void OnMouseLeave(){};
}
