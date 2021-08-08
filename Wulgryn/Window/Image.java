package Wulgryn.Window;

import Wulgryn.Parameters.Size;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Image {
    Size size = new Size(100, 100);
    BufferedImage image;
    Graphics graph;
    Graphics2D graph2D;

    public Image()
    {
        image = new BufferedImage(size.Width(),size.Height(),BufferedImage.TYPE_INT_RGB);
        graph = image.getGraphics();
        graph2D = image.createGraphics();
    }

    public Image(Size size)
    {
        this.size = size;
        image = new BufferedImage(size.Width(),size.Height(),BufferedImage.TYPE_INT_RGB);
        graph = image.getGraphics();
        graph2D = image.createGraphics();
    }

    public Image(BufferedImage image)
    {
        this.image = image;
        graph = image.getGraphics();
        graph2D = image.createGraphics();
    }

    public BufferedImage Get()
    {
        return image;
    }

    public Graphics GetGraphics()
    {
        return graph;
    }

    public Graphics2D GetGraphics2D()
    {
        return graph2D;
    }
}
