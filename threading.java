import java.util.*;

class t1 implements Runnable
{
	Thread t;
	t1()
	{
		t=new Thread(this,"t1");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("BMSCE");
			try
			{
				Thread.sleep(0);
			}
			catch(InterruptedException e)
			{
				System.out.println("BMS thread intrupted");
			}
		}
	}
}
class t2 implements Runnable
{
	Thread t;
	t2()
	{
		t=new Thread(this,"t2");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("CSE");
			try
			{
				Thread.sleep(0);
			}
			catch(InterruptedException e)
			{
				System.out.println("CSE thread intrupted");
			}
		}
	}
}

class threading
{
	public static void main(String args[])
	{
		t1 ob1 = new t1();
		t2 ob2 = new t2();
	}
}	
