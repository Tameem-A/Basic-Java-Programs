class Mythread10 extends Thread
{
	public void run()
	{
		System.out.println("After changing Priority"+ Thread.currentThread().getPriority());
	}
}
public class Thread10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread10 t1= new Mythread10();
		System.out.println("Before changing Priority"+ t1.getPriority());
		
		//t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(9);

		t1.start();

		

	}

}
