package Wulgryn.Properties;

import java.awt.geom.*;

import Wulgryn.Parameters.p2D.Point2;
import Wulgryn.Parameters.p2D.Size2;

import java.awt.Shape;

public class Shapes {
    public static Shape Circle(Point2 location,Size2 size)
    {
        return new Ellipse2D.Double(location.X(), location.Y(), size.Width(), size.Height());
    }

    public static Shape RoundedSquare(Point2 location, Size2 size, double xCurve, double yCurve)
    {
        return new RoundRectangle2D.Double(location.X(), location.Y(), size.Width(), size.Height(), xCurve, yCurve);
    }
}
