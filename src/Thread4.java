class NewThread2 extends Thread
{
	//Thread t = new Thread(this,"Red");
	//System.out.println("current thread"+ Thread.currentThread());
	//Thread t = new Thread(this, "Demo Thread");
	
	public void run()
	{
		try {
			for(int i=0;i<=5;i++)
			{
				System.out.println("child Thread is "+i);
				Thread.sleep(500);
				//System.out.println(" Thread name is "+Thread.currentThread());
			}
		}
		catch(Exception e) {}
		System.out.println("Child thread exiting");
	}
}
public class Thread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread2 t1= new NewThread2();
		//Thread t=new Thread(); in implents edi
		t1.start();
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
