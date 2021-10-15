package Wulgryn.Properties;

import java.awt.geom.*;
import java.awt.Shape;

import Wulgryn.Parameters.PointF;
import Wulgryn.Parameters.SizeF;

public class Shapes {
    public static Shape Circle(PointF location,SizeF size)
    {
        return new Ellipse2D.Double(location.X(), location.Y(), size.Width(), size.Height());
    }

    public static Shape RoundedSquare(PointF location, SizeF size, double xCurve, double yCurve)
    {
        return new RoundRectangle2D.Double(location.X(), location.Y(), size.Width(), size.Height(), xCurve, yCurve);
    }
}
