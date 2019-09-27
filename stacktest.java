import java.util.*;
interface stack
{
	void push();
	void pop();
	boolean check();
}
class stacktests implements stack
{ 
	Scanner in=new Scanner(System.in);
	int size=10;
	int a[]=new int[size];
	int t=-1;
	public boolean check()
	{
		if(t==-1)
			{
				System.out.println("Stack is empty");
				return true;
			}
			return false;
	}
	public void push()
	{
		System.out.println("Enter the item to be pushed");
		int item=in.nextInt();
		if(t==(size-1))
		{
			size=size*2;
			int temp[]=new int[size];
			for(int i=0;i<t;i++)
				temp[i]=a[i];
			a=temp;
		}
		a[++t]=item;
	}
	public void pop()
	{
		if(check())
		{
			return;
		}
		System.out.println("The element "+a[t--]+" has been popped");
	}
	void display()
	{
		for(int i=t;i>=0;i--)
			System.out.println(a[i]);
	}
}
class stacktest
{	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		stacktests ref=new stacktests();
		int i;
		while(true)
		{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
	 		System.out.println("any number to exit");
	 		int ch=in.nextInt();
	 		switch(ch)
	 		{
	 			case 1:ref.push();
	 					   break;
	 			case 2:ref.pop();
	 						 break;
	 			case 3:ref.display();
	 						 break;
	 			default:System.exit(0);
	 		}
	 	}
	}
}
