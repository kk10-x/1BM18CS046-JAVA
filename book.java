import java.util.*;
public class book
{
	String name,auth;
	double price;
	int npage;
	book()
	{
		name="";
		auth="";
		price=0;
		npage=0;
	}
	void set()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Name of the Book");
		name=in.next();
		System.out.println("Enter the Name of the Author");
		auth=in.next();
		System.out.println("Enter the Price of the Book");
		price=in.nextDouble();
		System.out.println("Enter the No. of pages in the Book");
		npage=in.nextInt();
	}
	public String toString()
	{
		System.out.println("The Name of the Book:"+name);
		System.out.println("The Name of the Author:"+auth);
		System.out.println("The Price of the Book:"+price);
		System.out.print("The No. of pages in the Book:"+npage);
		return "";
	}
}
		
		