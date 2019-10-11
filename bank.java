import java.util.*;
abstract class account
{
	Scanner in=new Scanner(System.in);
	String name,accno;
	int type;
	void input()
	{
		System.out.print("\nEnter the user name:");
		name=in.next();
		System.out.print("\nEnter the account number:"); 
		accno=in.next();
		
	}
	void output()
	{
		String dis;
		if(type==1)
			dis="Current Account";
		else
			dis="Savings Account";
		System.out.println("Name:" + name +"\nAccount Number:" + accno +"\nType:" + dis);
		
	}
	abstract void trans();
}
class current extends account
{
	float bal=0;
	int d=0,w=0;
	void input()
	{
		super.input();
	}
	void trans()
	{
		int i=1,ch;
		while(i==1)
		{
			System.out.print("\n1.Deposit \n2.Withdraw\n");
			ch=in.nextInt();
			switch(ch)
			{
				case 1:
						System.out.print("\nEntert the  Deposit Amount\n");
						d=in.nextInt();
						bal=bal+d;
						break;
				case 2:
						System.out.print("\nEnter the Withdraw Amount \n");
						w=in.nextInt();
						if(w>bal)
							System.out.print("\nInsufficient Balance\n");
						else
							bal=bal-w;
						if(bal<1000)
							System.out.print("\nBalacne is less than the Min Balance penalty will be imposed\n");
						break;
				default:i=0;
			}
		}
	}
	void output()
	{
		super.output();
		System.out.print("\nAvali. Balance:"+bal+"\n");
	}	
}
class saving extends account
{
	double bal=0,cmpi=0,rate;
	int d=0,w=0,t=0;
	Scanner in=new Scanner(System.in);
	void input()
	{
		
		super.input();
		System.out.print("\nEnter the time and rate:");
		t=in.nextInt();
		rate=in.nextDouble();
	}
	void trans()
	{
		int i=1,ch;
		while(i==1)
		{
			System.out.print("\n1.Deposit \n2.Withdraw\n");
			ch=in.nextInt();
			switch(ch)
			{
				case 1:
						System.out.print("\nEntert the  Deposit Amount\n");
						d=in.nextInt();
						bal=bal+d;
						break;
				case 2:
						System.out.print("\nEnter the Withdraw Amount \n");
						w=in.nextInt();
						if(w>bal)
							System.out.print("\nInsufficient Balance\n");
						else
							bal=bal-w;
						if(bal<1000)
							System.out.print("\nBalacne is less than the Min Balance penalty will be imposed\n");
						break;
				default:i=0;
			}
			cmpi=bal* Math.pow((1.0+(rate/100.0)),t)-bal+cmpi;
			
		}
	}
	void output()
	{
		super.output();
		System.out.print("\nAvali. Balance:"+bal+"\n");
		System.out.print("\nBalance with the compound interest \n" +(bal+cmpi));
	}	
}
class bank
{
	public static void main(String args[])
	{
	    account ref;
			current c1=new current();
			saving s1=new saving();
		Scanner in=new Scanner(System.in);
		int i=1,ch,type;
		while(i==1)
		{
			System.out.print("\nEnter the account type:\n\t1.Current \n\t2.Saving");
			type=in.nextInt();
			if(type==1)
					
						ref=c1;
			if(type==2)
						
						ref=s1;
			else
				i=0;
			
			ref.input();
			ref.trans();
			ref.output();
		}
	}
}
						
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
					
