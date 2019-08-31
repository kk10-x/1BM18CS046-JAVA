import java.util.*;
public class real2
{
    public static void main(String args[])
    {
        double x,y,dist,a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of x,y");
        x=in.nextInt();
        y=in.nextInt();
        point ob=new point();
        point ob1=new point(x,y);
        SYstem.out.println("Enter the value of the other point")
        a=in.nextInt();   
        b=in.nextInt();
        dist=ob1.dist(a,b);
        System.out.println("the distance between the point is:"+dist);
        
    }
}
