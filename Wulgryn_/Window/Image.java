package Wulgryn.Window;

import java.awt.image.BufferedImage;

import Wulgryn.Parameters.p2D.Size2Int;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Image {
    private Size2Int size = new Size2Int(100, 100);
    private BufferedImage image;
    private Graphics graph;
    private Graphics2D graph2D;

    public Image()
    {
        try {
            image = new BufferedImage(size.Width(),size.Height(),BufferedImage.TYPE_INT_RGB);
            graph = image.getGraphics();
            graph2D = image.createGraphics();
        } catch (Exception e) {e.printStackTrace();}
    }

    public Image(Size2Int size)
    {
        this.size = size;
        try {
            image = new BufferedImage(size.Width(),size.Height(),BufferedImage.TYPE_INT_RGB);
            graph = image.getGraphics();
            graph2D = image.createGraphics();
        } catch (Exception e) {e.printStackTrace();}
        
    }

    public Image(BufferedImage image)
    {
        this.image = image;
        try {
            graph = image.getGraphics();
            graph2D = image.createGraphics();
            size = new Size2Int(image.getWidth(), image.getHeight());
        } catch (Exception e) {e.printStackTrace();}
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

    public Size2Int GetSize()
    {
        return size;
    }
}
