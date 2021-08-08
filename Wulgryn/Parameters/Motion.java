package Wulgryn.Parameters;

import java.util.Arrays;

public class Motion {
    private final double[] motion_ = new double[2];

    public Motion(double x,double y)
    {
        motion_[0] = x;
        motion_[1] = y;
    }

    public double X()
    {
        return motion_[0];
    }

    public double Y()
    {
        return motion_[1];
    }

    public Motion AddX(double x)
    {
        motion_[0] += x;
        return this;
    }

    public Motion AddY(double y)
    {
        motion_[1] += y;
        return this;
    }

    public Motion AddMotion(Motion motion)
    {
        motion_[0] += motion.X();
        motion_[1] += motion.Y();
        return this;
    }

    public void Out()
    {
        System.out.println(Arrays.toString(motion_));
    }

    public String AsString()
    {
        return Arrays.toString(motion_);
    }
}
