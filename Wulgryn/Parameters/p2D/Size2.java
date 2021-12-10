package Wulgryn.Parameters.p2D;

import java.util.Arrays;

public class Size2 {
    private final double[] size = new double[2];
    public Size2(double width,double height)
    {
        size[0] = width;
        size[1] = height;
    }

    public double Width(){return size[0];}

    public double Height(){return size[1];}

    public int IntWidth(){return (int)size[0];}

    public int IntHeight(){return (int)size[1];}

    public Size2 AddWidth(double width)
    {
        size[0] += width;
        return this;
    }

    public Size2 AddHeight(double height)
    {
        size[1] += height;
        return this;
    }

    public Size2 AddSizeD(Size2 sizef)
    {
        size[0] += sizef.Width();
        size[1] += sizef.Height();
        return this;
    }

    public Size2 SetWidth(double width)
    {
        size[0] = width;
        return this;
    }

    public Size2 SetHeight(double height)
    {
        size[1] = height;
        return this;
    }

    public Size2Int ToInt(){return new Size2Int(IntWidth(), IntHeight());}

    public void Out(){System.out.println(Arrays.toString(size));}

    public String AsString(){return Arrays.toString(size);}
}
