import java.util.*;
public class fib
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int n3;
		int n1=0;
		int n2=1;
		System.out.print("1");
		for(int i=2;i<=n;i++)
		{
			n3=n2+n1;
			System.out.print(n3);
			n1=n2;
			n2=n3;
		}
	}
}
