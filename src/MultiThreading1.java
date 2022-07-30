class MyThread implements Runnable{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("The value of i is "+i);
		}
	}
public class MultiThreading1 {
	public void main(String[] args) {
		MyThread t= new MyThread();
		Thread thread= new Thread();
	}
}

}
