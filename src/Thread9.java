class Mythread9 implements Runnable {
	String name;
	Mythread9(String name){
		this.name=name;
	}
	public void run() {
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(this.name+i);
				 Thread.sleep(500);
			}	
		}
		catch(Exception e) {}
		
	}
}
public class Thread9 {
	public static void main(String[] args) {
		Mythread9 t1= new Mythread9("One");
		Mythread9 t2= new Mythread9("two");
		Mythread9 t3= new Mythread9("three");
		
		Thread g1= new Thread(t1);
		Thread g2= new Thread(t2);
		Thread g3= new Thread(t3);
		
		g1.start();
		g2.start();
		g3.start();
		
		System.out.println(g1.isAlive());
		System.out.println(g2.isAlive());
		System.out.println(g3.isAlive());

		try
		{
			g1.join();
		}catch(Exception e) {}
		try
		{
			g2.join();
		}catch(Exception e) {}
		try
		{
			g3.join();
		}catch(Exception e) {}
		
		System.out.println(g1.isAlive());
		System.out.println(g2.isAlive());
		System.out.println(g3.isAlive());

	}

}
