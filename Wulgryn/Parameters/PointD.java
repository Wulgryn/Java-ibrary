package Wulgryn.Parameters;

import java.util.Arrays;

public class PointD {
    private final double[] point_ = new double[2];
    public PointD(double x, double y)
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

    public PointD AddX(double x)
    {
        point_[0] += x;
        return this;
    }

    public PointD AddY(double y)
    {
        point_[1] += y;
        return this;
    }

    public void SetX(double x){
        point_[0] = x;
    }

    public void SetY(double y)
    {
        point_[1] = y;
    }

    public PointD AddPointD(PointD pointf) {
        point_[0] += pointf.X();
        point_[1] += pointf.Y();
        return this;
    }

    public Point ToInt()
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
