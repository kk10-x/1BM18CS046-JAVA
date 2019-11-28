import java.util.*;
class threadprob{
	public static void main(String args[]){
		new t1();
	}
}
class t1 implements Runnable{
	Thread t;
	t1(){
		t = new Thread(this, "t1");
		t.start();
	}
	public void run(){
	        System.out.println("Hello from Thread1");
		new t2();
		try{	
			t.sleep(20);
			System.out.println("Hello from Thread1");
		}
		catch(InterruptedException e){
			System.out.println("Interrupted in Thread1");
		}
	}
}
class t2 implements Runnable{
	Thread t;
	t2(){
		t = new Thread(this, "t2");
		t.start();
	}
	public void run(){
	    System.out.println("Hello from Thread2");
		new t3();
		try{	
			t.sleep(18);
			System.out.println("Hello from Thread2");
		}
		catch(InterruptedException e){
			System.out.println("Interrupted in Thread2");
		}
	}
}

class t3 implements Runnable{
	Thread t;
	t3(){
		t = new Thread(this, "t3");
		t.start();
	}
	public void run(){
	    System.out.println("Hello from Thread3");
		new t4();
		try{	
			t.sleep(10);
			System.out.println("Hello from Thread3");
		}
		catch(InterruptedException e){
			System.out.println("Interrupted in Thread3");
		}
	}
}
class t4 implements Runnable{
	Thread t;
	t4(){
		t = new Thread(this, "t4");
		t.start();
	}
	public void run(){
		new t5();
		try{	
		    System.out.println("Hello from Thread4");
			t.sleep(8);
			System.out.println("Hello from Thread4");
		}
		catch(InterruptedException e){
			System.out.println("Interrupted in Thread4");
		}
	}
}

class t5 implements Runnable{
	Thread t;
	t5(){
		t = new Thread(this, "t5");
		t.start();
	}
	public void run(){
	    System.out.println("Hello from Thread5");
		System.out.println("Hello from Thread5");
	}
}
