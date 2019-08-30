import java.util.*;
public class real
{
	public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the number of books:");
			int n=in.nextInt();
			book ob[]=new book[n];
			for(int i=0;i<n;i++)
			{	
				ob[i] = new book();
				ob[i].set();
			}
			for(int i=0;i<n;i++)	
				System.out.println(ob[i]);
		}
}