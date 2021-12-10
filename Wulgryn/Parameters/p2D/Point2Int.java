package Wulgryn.Parameters.p2D;

import java.util.Arrays;

public class Point2Int {
    private final int[] point_ = new int[2];
    public Point2Int(int x, int y)
    {
        point_[0] = x;
        point_[1] = y;
    }

    public int X(){return point_[0];}

    public int Y(){return point_[1];}

    public Point2Int AddX(int x)
    {
        point_[0] += x;
        return this;
    }

    public Point2Int AddY(int y)
    {
        point_[1] += y;
        return this;
    }

    public Point2Int SetX(int x)
    {
        point_[0] = x;
        return this;
    }

    public Point2Int SetY(int y)
    {
        point_[1] = y;
        return this;
    }

    public Point2Int AddPoint(Point2Int point)
    {
        point_[0] += point.X();
        point_[1] += point.Y();
        return this;
    }

    public void Out(){System.out.println(Arrays.toString(point_));}

    public String AsString(){return Arrays.toString(point_);}
}
