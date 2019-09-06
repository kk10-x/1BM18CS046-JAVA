import java.util.*;
class demo
{
	int f=-1,r=-1,n;Scanner in=new Scanner(System.in);
	demo()
	{
		
		System.out.println("Enter the limit of the queue");
		n=in.nextInt();
	}
	int a[]=new int[n];
	void insert()
	{
		if(f==-1)
			f++;
		if(r==n)
		{	
			System.out.println("Queue is full");
			return;
		}
		System.out.println("Enter the element");
		int item=in.nextInt();
		a[++r]=item;
	}
	void delete()
	{
		if(f>r)
			System.out.println("Queue empty");
		f=f+1;
	}
	void display()
	{
		for(int i=f;i<=r;i++)
			System.out.println(a[i]);
	}
}
class queue
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int ch,i=1;
		demo ob=new demo();
		while(i==1)
		{
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			ch=in.nextInt();
			switch(ch)
			{
				case 1:ob.insert();
					break;
				case 2:ob.delete();
					break;
				case 3:ob.display();
					break;
				default:i=0;
			}
		}
	}
}
			
				
		
		
		

