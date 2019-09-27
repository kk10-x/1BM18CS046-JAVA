import java.util.*;
abstract class shape
{
	int a,b;
	abstract void printarea();
}
class tri extends shape
{
	void printarea()
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the height and base");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("the area of the triangle is:"+(0.5*a*b));
	}
}
class rect extends shape
{
	void printarea()
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the length and breadth");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("the area of the rectangle is:"+(a*b));
	}
}
class circle extends shape
{
	void printarea()
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the radius");
		a=in.nextInt();
		b=0;
		System.out.println("the area of the circle is:"+(3.142*a*a));
	}
}
class rshape
{
	public static void main(String args[])
	{
		shape ref=null;
		Scanner in=new Scanner(System.in);
		System.out.println("1.Triangle");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		int ch=in.nextInt();
		switch(ch)
		{
			case 1:ref=new tri();
						 break;
			case 2:ref= new rect();
						 break;
			case 3:ref=new circle();
						 break;
		 	default:System.exit(0);
		}
		ref.printarea();
	}
}
	
		
	
