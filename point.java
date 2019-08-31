import java.util.*;
import java.math.*;
public class point
{
    private double x1,x2,y1,y2;
    point()
    {
        x1=0;
        y1=0;
    }
    point(double a,double b)
    {
        x2=a;y2=b;
    }
    double dist(int a,int b)
    {
        double s=Math.sqrt(Math.pow(x2-a,2)+Math.pow(y2-b,2));
        return s;
    }
}
