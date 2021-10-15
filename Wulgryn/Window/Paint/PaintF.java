package Wulgryn.Window.Paint;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.image.BufferedImage;

import Wulgryn.Window.Frame;

public class PaintF {
    public static Graphics2D g = (Graphics2D)Frame.frame;
    public static int Transparency = 255;

    public static Font Font;

    static
    {
        Font = g.getFont();
    }

    public static class Draw
    {
        public static void Dot(int x,int y,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawLine(x, y, x, y);
        }
        public static void Dot(double x,double y,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawLine((int)x, (int)y, (int)x, (int)y);
        }

        public static void Line(int x1,int y1,int x2,int y2,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawLine(x1, y1, x2, y2);
        }
        public static void Line(double x1,double y1,double x2,double y2,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
        }

        public static void Square(int x,int y,int width,int height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawRect(x, y, width, height);
        }
        public static void Square(double x,double y,double width,double height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawRect((int)x, (int)y, (int)width, (int)height);
        }

        public static void Circle(int x,int y,int width,int height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawOval(x, y, width, height);
        }
        public static void Circle(double x,double y,double width,double height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawOval((int)x, (int)y, (int)width, (int)height);
        }

        public static void Poly(int[] xPoints,int[] yPoints,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawPolygon(xPoints,yPoints,xPoints.length);
        }

        public static void PolyLine(int[] xPoints,int[] yPoints,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawPolyline(xPoints,yPoints,xPoints.length);
        }
        public static void String(int x,int y, String str, Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.setFont(Font);
            g.drawString(str ,x, y);
        }
        public static void String(double x,double y, String str, Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.setFont(Font);
            g.drawString(str ,(int)x, (int)y);
        }
        public static void String(int x,int y, String str, Color c, Font font)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.setFont(font);
            g.drawString(str ,x, y);
        }
        public static void String(double x,double y, String str, Color c, Font font)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.setFont(font);
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
        public static void RoundedSquare(int x, int y, int width, int height,int xRound, int yRound,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawRoundRect(x, y, width, height, xRound, yRound);
        }
        public static void RoundedSquare(double x, double y, double width, double height, double xRound, double yRound,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.drawRoundRect((int)x, (int)y, (int)width, (int)height, (int)xRound, (int)yRound);
        }
    }
    public static class Fill
    {
        public static void Square(int x,int y,int width,int height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.fillRect(x, y, width, height);
        }
        public static void Square(double x,double y,double width,double height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.fillRect((int)x, (int)y, (int)width, (int)height);
        }

        public static void Circle(int x,int y,int width,int height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.fillOval(x, y, width, height);
        }
        public static void Circle(double x,double y,double width,double height,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.fillOval((int)x, (int)y, (int)width, (int)height);
        }

        public static void Poly(int[] xPoints,int[] yPoints,Color c) {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.fillPolygon(xPoints,yPoints,xPoints.length);
        }
        public static void RoundedSquare(int x, int y, int width, int height,int xRound, int yRound,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.fillRoundRect(x, y, width, height, xRound, yRound);
        }
        public static void RoundedSquare(double x, double y, double width, double height, double xRound, double yRound,Color c)
        {
            g.setColor(new Color(c.getRed(),c.getGreen(),c.getBlue(),Transparency));
            g.fillRoundRect((int)x, (int)y, (int)width, (int)height, (int)xRound, (int)yRound);
        }
    }
}
