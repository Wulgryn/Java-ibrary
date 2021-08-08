package Wulgryn.Parameters;

import java.util.Arrays;

public class PointF {
    private final double[] point_ = new double[2];
    public PointF(double x, double y)
    {
        point_[0] = x;
        point_[1] = y;
    }

    public double X()
    {
        return point_[0];
    }

    public double Y()
    {
        return point_[1];
    }

    public int IntX()
    {
        return (int)point_[0];
    }

    public int IntY()
    {
        return (int)point_[1];
    }

    public PointF AddX(double x)
    {
        point_[0] += x;
        return this;
    }

    public PointF AddY(double y)
    {
        point_[1] += y;
        return this;
    }

    public PointF AddPointF(PointF pointf) {
        point_[0] += pointf.X();
        point_[1] += pointf.Y();
        return this;
    }

    public Point ToIntPoint()
    {
        return new Point(IntX(), IntY());
    }

    public void Out()
    {
        System.out.println(Arrays.toString(point_));
    }

    public String AsString()
    {
        return Arrays.toString(point_);
    }
}
