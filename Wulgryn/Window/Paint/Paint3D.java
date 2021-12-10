package Wulgryn.Window.Paint;

import java.awt.Color;

import Wulgryn.Properties.Common;
import Wulgryn.Properties.Mathf;
import Wulgryn.Window.Paint.Paint2D.Paint;

public class Paint3D {
    //coming soon https://www.youtube.com/watch?v=nBjwBmH8OhQ
    //https://processing.org/tutorials/p3d

    

    public static double[] CalcLine(double x, double y, double length, double rot_x,double rot_y, double rot_z)
    {
        y -= length * Math.cos(Math.toRadians(rot_z)) * Math.cos(Math.toRadians(rot_x));
        x += length * Math.sin(Math.toRadians(rot_z)) * Math.cos(Math.toRadians(rot_y));
        return new double[] { x,y };
    }



    

    public static class Draw
    {
        public static class Line
        {
            public static double[] Draw(double x, double y, double length, double rot_x,double rot_y, double rot_z, Color c)
            {
                double delta_length_sin = length * Math.cos(Math.toRadians(rot_z)) * Math.cos(Math.toRadians(rot_x));
                double delta_length_cos = length * Math.sin(Math.toRadians(rot_z)) * Math.cos(Math.toRadians(rot_y));

                Paint.Draw.Line.Draw(x, y, x + delta_length_cos, y - delta_length_sin, c);
                return new double[] { x + delta_length_cos,y - delta_length_sin};
            }
        }
        public static class Plane
        {
            public static double[][] Draw(double x, double y, double width, double height,double rot_x,double rot_y, double rot_z, Color c) {
                double l = Mathf.C(width / 2, height / 2);
                double mp_y = l * Math.cos(Math.toRadians(rot_z + 45)) * Math.cos(Math.toRadians(rot_x));
                double mp_x = l * Math.sin(Math.toRadians(rot_z + 45)) * Math.cos(Math.toRadians(rot_y));
                Paint.Draw.Dot.Draw((int)x, (int)y, c);
                double[] p1 = Line.Draw(x + mp_x, y - mp_y, width, rot_x, rot_y, rot_z - 90,c);
                double[] p2 = Line.Draw(x + mp_x, y - mp_y, height, rot_x, rot_y, rot_z + 180,c);
                Line.Draw(x - mp_x, y + mp_y, height, rot_x, rot_y, rot_z,c);
                Line.Draw(x - mp_x, y + mp_y, width, rot_x, rot_y, rot_z + 90,c);
                return new double[][]{p1,new double[]{x + mp_x, y - mp_y},p2,new double[]{x - mp_x, y + mp_y}};
            }
        }
    }
    public static class Fill
    {
        public static class Plane
        {
            public static double[][] Fill(double x, double y, double width, double height,double rot_x,double rot_y, double rot_z, Color c) {
                double l = Mathf.C(width / 2, height / 2);
                double mp_y = l * Math.cos(Math.toRadians(rot_z + 45)) * Math.cos(Math.toRadians(rot_x));
                double mp_x = l * Math.sin(Math.toRadians(rot_z + 45)) * Math.cos(Math.toRadians(rot_y));
                Paint.Draw.Dot.Draw((int)x, (int)y, c);
                double[] p1 = CalcLine(x + mp_x, y - mp_y, width, rot_x, rot_y, rot_z - 90);
                double[] p2 = CalcLine(x + mp_x, y - mp_y, height, rot_x, rot_y, rot_z + 180);
                double[] p3 = CalcLine(x - mp_x, y + mp_y, height, rot_x, rot_y, rot_z);
                double[] p4 = CalcLine(x - mp_x, y + mp_y, width, rot_x, rot_y, rot_z + 90);
                Paint.Fill.Polygon.Fill(
                    new int[]{(int)p1[0],(int)(x + mp_x),(int)p2[0]},
                    new int[]{(int)p1[1],(int)(y - mp_y),(int)p2[1]},c);
                Paint.Fill.Polygon.Fill(
                    new int[]{(int)p3[0],(int)(x - mp_x),(int)p4[0]},
                    new int[]{(int)p3[1],(int)(y + mp_y),(int)p4[1]},c);
                return new double[][]{p1,new double[]{x + mp_x, y - mp_y},p2,new double[]{x - mp_x, y + mp_y}};
            }
        }
    }
}
