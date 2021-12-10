package Wulgryn.Parameters.p2D;

import java.util.Arrays;

public class Vector2 {
    public static double speed = 10;
    private double[] vector = new double[]{0,0};
    public Vector2(double x,double y)
    {
        vector[0] = x;
        vector[1] = y;
    }

    public double X(){return vector[0];}
    public double Y(){return vector[1];}

    public int IntX(){return (int)vector[0];}
    public int IntY(){return (int)vector[1];}

    public Vector2 AddX(double x)
    {
        vector[0] += x;
       return this; 
    }

    public Vector2 AddY(double y)
    {
        vector[1] += y;
       return this; 
    }

    public Vector2 SetX(double x)
    {
        vector[0] = x;
       return this; 
    }

    public Vector2 SetY(double y)
    {
        vector[1] = y;
       return this; 
    }

    public Vector2 AddVector2(Vector2 vector)
    {
        this.vector[0] += vector.X();
        this.vector[1] += vector.Y();
        return this;
    }

    public Vector2Int ToInt(){return new Vector2Int(IntX(), IntY());}
    public void Out(){System.out.println(Arrays.toString(vector));}
    public String AsString(){return Arrays.toString(vector);}

    public static Vector2 Up(){return new Vector2(0, -speed);}
    public static Vector2 Down(){return new Vector2(0, speed);}
    public static Vector2 Left(){return new Vector2(-speed, 0);}
    public static Vector2 Right(){return new Vector2(speed, 0);}
    public static Vector2 Zero(){return new Vector2(0, 0);}
}
