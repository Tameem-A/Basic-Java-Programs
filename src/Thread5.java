
class Mythread5 extends Thread{
	public void run(){
		try
		{
			System.out.println(this.isAlive());
			Thread.sleep(500);
		}
		catch(Exception e) {}
	}
}
public class Thread5{

	public static void main(String[] args) {
		Mythread5 t1=new Mythread5();
		Mythread5 t2= new Mythread5();
		System.out.println(t1.isAlive());
		//System.out.println(t2.isAlive());
		t1.start();
		t2.start();
		
		
	}
		
	
	}

