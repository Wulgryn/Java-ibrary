package Wulgryn.Window;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.image.BufferedImage;

public class Paint {
    protected static Graphics g = Frame.frame;

    public static int Tarnsparency = 255;
    public static Font Font;

    static
    {
        Font = g.getFont();
    }

    public static class Draw
    {
        
        public static void Dot(int x,int y,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawLine(x, y, x, y);
        }
        public static void Dot(double x,double y,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawLine((int)x, (int)y, (int)x, (int)y);
        }

        public static void Line(int x1,int y1,int x2,int y2,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawLine(x1, y1, x2, y2);
        }
        public static void Line(double x1,double y1,double x2,double y2,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
        }

        public static void Square(int x,int y,int width,int height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawRect(x, y, width, height);
        }
        public static void Square(double x,double y,double width,double height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawRect((int)x, (int)y, (int)width, (int)height);
        }

        public static void Circle(int x,int y,int width,int height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawOval(x, y, width, height);
        }
        public static void Circle(double x,double y,double width,double height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawOval((int)x, (int)y, (int)width, (int)height);
        }

        public static void Poly(int[] xPoints,int[] yPoints,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawPolygon(xPoints,yPoints,xPoints.length);
        }

        public static void PolyLine(int[] xPoints,int[] yPoints,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.drawPolyline(xPoints,yPoints,xPoints.length);
        }
        public static void String(int x,int y, String str, Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.setFont(Font);
            g.drawString(str ,x, y);
        }
        public static void String(double x,double y, String str, Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.setFont(Font);
            g.drawString(str ,(int)x, (int)y);
        }
        public static void Image(int x,int y,BufferedImage image)
        {
            g.drawImage(image, x, y, null);
        }
        public static void Image(double x,double y,BufferedImage image)
        {
            g.drawImage(image, (int)x, (int)y, null);
        }
    }
    public static class Fill
    {
        public static void Square(int x,int y,int width,int height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.fillRect(x, y, width, height);
        }
        public static void Square(double x,double y,double width,double height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.fillRect((int)x, (int)y, (int)width, (int)height);
        }

        public static void Circle(int x,int y,int width,int height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.fillOval(x, y, width, height);
        }
        public static void Circle(double x,double y,double width,double height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.fillOval((int)x, (int)y, (int)width, (int)height);
        }

        public static void Poly(int[] xPoints,int[] yPoints,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Tarnsparency));
            g.fillPolygon(xPoints,yPoints,xPoints.length);
        }
    }
}
