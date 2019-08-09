import java.util.*;
import java.lang.Math;
public class quadratic 
{
	public static void main(String args[])
	{
		double a,b,c,d;
		double r1,r2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values for a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=(b*b-4*a*c);
		if(d<0)
			System.out.println("There are no real solution");
		if(d==0)
		{	r1=-b/(2*a);
			System.out.println("The roots are equal"+r1);
		}
		if(d>0)
		{
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The roots are "+r1+"and"+r2);
		}
		
	}

}
