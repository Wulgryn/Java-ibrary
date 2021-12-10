package Wulgryn.Window.Paint.Paint2D;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.geom.*;

import Wulgryn.Properties.Common;
import Wulgryn.Window.Frame;
import Wulgryn.Window.Image;

public class Paint {
    private static Graphics2D g2;
    private static Graphics g;
    private static Font def_font;

    public static void SetGraphics2D(Graphics2D graphics2d){g2 = graphics2d;def_font = graphics2d.getFont();}
    public static void SetGraphics(Graphics graphics){g = graphics;}

    public static class Draw
    {
        public static class Dot
        {
            public static void Draw(int x, int y, Color c)
            {
                g2.setColor(c);
                g2.drawLine(x, y, x, y);
            }
        }
        public static class Line
        {
            public static void Draw(int x1,int y1, int x2, int y2,Color c)
            {
                g2.setColor(c);
                g2.drawLine(x1, y1, x2, y2);
            }
            public static void Draw(double x1,double y1,double x2,double y2,Color c)
            {
                g2.setColor(c);
                g2.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
            }
            public static void Draw(int x,int y, int length,Color c, double rot_z)
            {
                g2.setColor(c);
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.drawLine(-length / 2, 0, length / 2, 0);
                g2.setTransform(transform);
            }
        }
        public static class Square
        {
            public static void Draw(int x,int y,int width,int height,Color c)
            {
                g2.setColor(c);
                g2.drawRect(x, y, width, height);
            }
            public static void Draw(int x,int y,int width,int height,Color c,double rot_z)
            {
                g2.setColor(c);
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.drawRect(-width / 2, -height / 2, width, height);
                g2.setTransform(transform);
            }
        }
        public static class Circle
        {
            public static void Draw(int x,int y,int width,int height,Color c)
            {
                g2.setColor(c);
                g2.drawOval(x, y, width, height);
            }
            public static void Draw(int x,int y,int width,int height,Color c,double rot_z)
            {
                g2.setColor(c);
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.drawOval(- width / 2, - height / 2, width, height);
                g2.setTransform(transform);
            }
        }
        public static class RoundedSquare
        {
            public static void Draw(int x,int y,int width,int height, int corner_X, int corner_Y,Color c)
            {
                g2.setColor(c);
                g2.drawRoundRect(x, y, width, height, corner_X, corner_Y);
            }
            public static void Draw(int x,int y,int width,int height, int corner_X, int corner_Y,Color c,double rot_z)
            {
                g2.setColor(c);
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.drawRoundRect(- width / 2, - height / 2, width, height, corner_X, corner_Y);
                g2.setTransform(transform);
            }

        }
        public static class Image
        {
            public static void Draw(int x, int y, Wulgryn.Window.Image image)
            {
                g2.drawImage(image.Get(),x,y,null);
            }
            public static void Draw(int x, int y, Wulgryn.Window.Image image,double rot_z)
            {
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.drawImage(image.Get(), -image.GetSize().Width() / 2,-image.GetSize().Height() / 2,null);
                g2.setTransform(transform);
            }
        }
        public static class String
        {
            public static void Draw(int x,int y,java.lang.String string,Color c)
            {
                g2.setColor(c);
                g2.drawString(string, x, y);
            }
            public static void Draw(int x,int y,java.lang.String string,Color c, Font font)
            {
                g2.setColor(c);
                g2.setFont(font);
                g2.drawString(string, x, y);
                g2.setFont(def_font);
            }
            public static void Draw(int x,int y,java.lang.String string,Color c,double rot_z)
            {
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.setColor(c);
                g2.drawString(string, 0, 0);
                g2.setTransform(transform);
            }
            public static void Draw(int x,int y,java.lang.String string,Color c, double rot_z,Font font)
            {
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.setColor(c);
                g2.setFont(font);
                g2.drawString(string, 0, 0);
                g2.setFont(def_font);
                g2.setTransform(transform);
            }
        }
        public static class Polygon
        {
            public static void Draw(int[] xPoints,int[] yPoints,Color c)
            {
                g2.setColor(c);
                g2.drawPolygon(xPoints, yPoints, xPoints.length);
            }
            public static void Draw(int[] xPoints,int[] yPoints,Color c, double rot_z)
            {
                g2.setColor(c);
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(xPoints[0], yPoints[0]);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.drawPolygon(xPoints, yPoints, xPoints.length);
                g2.setTransform(transform);
            }
        }
    }
    public static class Fill
    {
        public static class Square
        {
            public static void Fill(int x,int y,int width,int height,Color c)
            {
                g2.setColor(c);
                g2.fillRect(x, y, width, height);
            }
            public static void Fill(int x,int y,int width,int height,Color c,double rot_z)
            {
                g2.setColor(c);
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.fillRect(-width / 2, -height / 2, width, height);
                g2.setTransform(transform);
            }
        }
        public static class Circle
        {
            public static void Fill(int x,int y,int width,int height,Color c)
            {
                g2.setColor(c);
                g2.fillOval(x, y, width, height);
            }
            public static void Fill(int x,int y,int width,int height,Color c,double rot_z)
            {
                g2.setColor(c);
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.fillOval(- width / 2, - height / 2, width, height);
                g2.setTransform(transform);
            }
        }
        public static class RoundedSquare
        {
            public static void Fill(int x,int y,int width,int height, int corner_X, int corner_Y,Color c)
            {
                g2.setColor(c);
                g2.fillRoundRect(x, y, width, height, corner_X, corner_Y);
            }
            public static void Fill(int x,int y,int width,int height, int corner_X, int corner_Y,Color c,double rot_z)
            {
                g2.setColor(c);
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(x, y);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.fillRoundRect(- width / 2, - height / 2, width, height, corner_X, corner_Y);
                g2.setTransform(transform);
            }
        }
        public static class Polygon
        {
            public static void Fill(int[] xPoints,int[] yPoints,Color c)
            {
                g2.setColor(c);
                g2.fillPolygon(xPoints, yPoints, xPoints.length);
            }
            public static void Fill(int[] xPoints,int[] yPoints,Color c, double rot_z)
            {
                g2.setColor(c);
                AffineTransform transform = g2.getTransform();
                AffineTransform t = g2.getTransform();
                t.setToTranslation(xPoints[0], yPoints[0]);
                t.rotate(Math.toRadians(rot_z));
                g2.setTransform(t);
                g2.fillPolygon(xPoints, yPoints, xPoints.length);
                g2.setTransform(transform);
            }
        }
    }
}
