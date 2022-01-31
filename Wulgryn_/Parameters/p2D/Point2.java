package Wulgryn.Parameters.p2D;

import java.util.Arrays;

public class Point2 {
    private final double[] point_ = new double[2];
    public Point2(double x, double y)
    {
        point_[0] = x;
        point_[1] = y;
    }

    public double X(){return point_[0];}

    public double Y(){return point_[1];}

    public int IntX(){return (int)point_[0];}

    public int IntY(){return (int)point_[1];}

    public Point2 AddX(double x)
    {
        point_[0] += x;
        return this;
    }

    public Point2 AddY(double y)
    {
        point_[1] += y;
        return this;
    }

    public Point2 SetX(double x){
        point_[0] = x;
        return this;
    }

    public Point2 SetY(double y)
    {
        point_[1] = y;
        return this;
    }

    public Point2 AddPoint(Point2 pointf) {
        point_[0] += pointf.X();
        point_[1] += pointf.Y();
        return this;
    }

    public Point2 SetPoint(Point2 point){SetX(point.X());SetY(point.Y());return this;}

    public Point2 AddVector2(Vector2 vector) {return AddX(vector.X()).AddY(vector.Y());}

    public Point2Int ToInt(){return new Point2Int(IntX(), IntY());}

    public void Out(){System.out.println(Arrays.toString(point_));}

    public String AsString(){return Arrays.toString(point_);}
}
