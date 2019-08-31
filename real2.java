import java.util.*;
public class real2
{
    public static void main(String args[])
    {
        double x,y,dist;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of x,y");
        x=in.nextInt();
        y=in.nextInt();
        point ob=new point();
        point ob1=new point(x,y);
        dist=ob1.dist();
        
        System.out.println("the distance between the point is:"+dist);
        
    }
}