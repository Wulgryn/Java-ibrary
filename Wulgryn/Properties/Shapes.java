package Wulgryn.Properties;

import java.awt.geom.*;
import java.awt.Shape;

import Wulgryn.Parameters.PointD;
import Wulgryn.Parameters.SizeD;

public class Shapes {
    public static Shape Circle(PointD location,SizeD size)
    {
        return new Ellipse2D.Double(location.X(), location.Y(), size.Width(), size.Height());
    }

    public static Shape RoundedSquare(PointD location, SizeD size, double xCurve, double yCurve)
    {
        return new RoundRectangle2D.Double(location.X(), location.Y(), size.Width(), size.Height(), xCurve, yCurve);
    }
}
