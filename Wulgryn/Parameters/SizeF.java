package Wulgryn.Parameters;

import java.util.Arrays;

public class SizeF {
    private final double[] size = new double[2];
    public SizeF(double width,double height)
    {
        size[0] = width;
        size[1] = height;
    }

    public double Width()
    {
        return size[0];
    }

    public double Height()
    {
        return size[1];
    }

    public int IntWidth()
    {
        return (int)size[0];
    }

    public int IntHeight()
    {
        return (int)size[1];
    }

    public SizeF AddWidth(double width)
    {
        size[0] += width;
        return this;
    }

    public SizeF AddHeight(double height)
    {
        size[1] += height;
        return this;
    }

    public SizeF AddSizeF(SizeF sizef)
    {
        size[0] += sizef.Width();
        size[1] += sizef.Height();
        return this;
    }

    public Size ToIntSize()
    {
        return new Size(IntWidth(), IntHeight());
    }

    public void Out()
    {
        System.out.println(Arrays.toString(size));
    }

    public String AsString()
    {
        return Arrays.toString(size);
    }
}
