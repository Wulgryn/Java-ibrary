package Wulgryn.Parameters;

import java.util.Arrays;

public class Point {
    private final int[] point_ = new int[2];
    public Point(int x, int y)
    {
        point_[0] = x;
        point_[1] = y;
    }

    public int X()
    {
        return point_[0];
    }

    public int Y()
    {
        return point_[1];
    }

    public Point AddX(int x)
    {
        point_[0] += x;
        return this;
    }

    public Point AddY(int y)
    {
        point_[1] += y;
        return this;
    }

    public Point AddPoint(Point point)
    {
        point_[0] += point.X();
        point_[1] += point.Y();
        return this;
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
