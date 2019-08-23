import java.util.*;
public class realtime
{
	public static void main(String args[])
	{
		 int a,b,c,f,ch;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the initial time");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=sc.nextInt();
		 time ob=new time();
		 
		 f=1;
		 while(f==1)
		 {
		 	System.out.println("Enter");
			System.out.println("1:Advance");
			System.out.println("2:Reset");
		 	System.out.println("3:Display");
		 	System.out.println("4:Exit");
		 	ch=sc.nextInt();
		 	switch(ch)
		 	{
		 		case 1:
		 		System.out.println("Enter time to be advanced in the format hh mm ss");
		 		a=sc.nextInt();
		 		b=sc.nextInt();
		 		c=sc.nextInt();
		 		ob.advance(a,b,c);
		 	        break;
		 	        case 2:
		 	        System.out.println("Enter the reset time in the format hh mm ss");
		 	        a=sc.nextInt();
		 		b=sc.nextInt();
		 		c=sc.nextInt();
		 		ob.reset(a,b,c);
		 		break;
		 		case 3:
		 		ob.display();
		 		break;
		 		default:
		 		f++;
		 	}
		 }
	}
}
