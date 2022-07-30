class NewThread8 extends Thread
{
	String name;
	NewThread8(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		try {
			for(int i=0;i<=5;i++)
			{
				System.out.println(this.name+i);
				Thread.sleep(500);
				//System.out.println(" Thread name is "+Thread.currentThread());
			}
		}
		catch(Exception e) {}
		System.out.println("Child thread exiting");
	}
}
public class Thread8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread8 t1= new NewThread8("one");
		NewThread8 t2= new NewThread8("two");
		//Thread t=new Thread(); in implents edi
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e) {}
		System.out.println(t1.isAlive());
		t2.start();
		try
		{
			t2.join();
		}
		catch(Exception e) {}

		
		System.out.println(" Thread name is "+Thread.currentThread());
		try {
			for(int i=0;i<=5;i++)
			{
				System.out.println("Main Thread is "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {}
		System.out.println("main thread exiting");
	}

	}