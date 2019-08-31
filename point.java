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
    double dist()
    {
        double s=Math.sqrt(x2*x2+y2*y2);
        return s;
    }
}