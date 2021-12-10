package Wulgryn.Parameters.p2D;

import java.util.Arrays;

public class Vector2Int {
    public static int speed = 10;
    private int[] vector = new int[]{0,0};
    public Vector2Int(int x,int y)
    {
        vector[0] = x;
        vector[1] = y;
    }

    public int X(){return vector[0];}
    public int Y(){return vector[1];}

    public Vector2Int AddX(int x)
    {
        vector[0] += x;
       return this; 
    }

    public Vector2Int AddY(int y)
    {
        vector[1] += y;
       return this; 
    }

    public Vector2Int SetX(int x)
    {
        vector[0] = x;
       return this; 
    }

    public Vector2Int SetY(int y)
    {
        vector[1] = y;
       return this; 
    }

    public Vector2Int AddVector2(Vector2Int vector)
    {
        this.vector[0] += vector.X();
        this.vector[1] += vector.Y();
        return this;
    }
    public void Out(){System.out.println(Arrays.toString(vector));}
    public String AsString(){return Arrays.toString(vector);}

    public static Vector2Int Up(){return new Vector2Int(0, -speed);}
    public static Vector2Int Down(){return new Vector2Int(0, speed);}
    public static Vector2Int Left(){return new Vector2Int(-speed, 0);}
    public static Vector2Int Right(){return new Vector2Int(speed, 0);}
    public static Vector2Int Zero(){return new Vector2Int(0, 0);}
}
