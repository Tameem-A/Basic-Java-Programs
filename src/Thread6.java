
class Mythread6 extends Thread{
	public void run(){
		try
		{
			System.out.println(this.isAlive());
			Thread.sleep(500);
		}
		catch(Exception e) {}
	}
}
public class Thread6{

	public static void main(String[] args) {
		Mythread5 t1=new Mythread5();
		Mythread5 t2= new Mythread5();
		t1.start();
		try {
			t1.join();
			System.out.println(t1.isAlive());
		}
		catch(Exception e) {}
		
		
		
		t2.start();
		//System.out.println(t2.isAlive());
		
		
	}
		
	
	}