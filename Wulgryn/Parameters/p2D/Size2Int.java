package Wulgryn.Parameters.p2D;

import java.util.Arrays;

public class Size2Int {
    private final int[] size = new int[2];
    public Size2Int(int width,int height)
    {
        size[0] = width;
        size[1] = height;
    }

    public int Width(){return size[0];}

    public int Height(){return size[1];}

    public Size2Int AddWidth(int width)
    {
        size[0] += width;
        return this;
    }

    public Size2Int AddHeight(int height)
    {
        size[1] += height;
        return this;
    }

    public Size2Int SetWidth(int width)
    {
        size[0] = width;
        return this;
    }

    public Size2Int SetHeight(int height)
    {
        size[1] = height;
        return this;
    }

    public Size2Int AddSize(Size2Int size) {
        this.size[0] += size.Width();
        this.size[1] += size.Height();
        return this;
    }

    public void Out(){System.out.println(Arrays.toString(size));}

    public String AsString(){return Arrays.toString(size);}
}
