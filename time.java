public class time
{
	int h,m,s;
	time()
	{
		h=0;m=0;s=0;
	}
	time(int a,int b,int c)
	{
		h=a;m=b;c=s;
	}
	void advance(int a,int b,int c)
	{
		s=s+c;
		m=m+b;
		h=h+a;
		while(s>=60)
		{
			s-=60;
			m+=1;
		}
		while(m>=60)
		{
			m-=60;
			h+=1;
		}
	}
	void reset(int a,int b,int c)
	{
		h=a;
		m=b;
		s=c;
	}
	void display()
	{
		System.out.println("The current time is "+h+":"+m+":"+s);
	}
}
