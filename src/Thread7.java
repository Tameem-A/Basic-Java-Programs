class ThreadDemo implements Runnable
{
	String name;
	ThreadDemo(/*String name1*/)
	{
		//name=name1;
	}
	public void run() {
		for(int i=0;i<5;i++)
		{
			//System.out.println(name+":"+i);
			System.out.println("Child Thread"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}
public class Thread7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 =new ThreadDemo(/*"karthicpuku"*/);
		ThreadDemo t2= new ThreadDemo(/*"harshapuku"*/);
		Thread t3= new Thread(t1);
		Thread t4= new Thread(t2);
		t3.start();
		try {
			t3.join();
			System.out.println(t3.isAlive());
		}
		catch(Exception e) {}
		t4.start();

		

	}

}
