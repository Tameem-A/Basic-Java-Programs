class Table
{
	synchronized void PrintTable(int n)
	{
	try
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i*n);
			Thread.sleep(500);
		}
	}
	catch(Exception e) {}
}
}

class Mythread11 extends Thread
{
	Table t;
	private int n;
	Mythread11(Table t, int n)
	{
		this.t=t;
		this.n=n;
		
	}
	public void run() {
		t.PrintTable(n);
	}
}
public class Thread11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t1= new Table();
		Mythread11 t2 =new  Mythread11(t1,10);
		Mythread11 t3=new Mythread11(t1,2);
		t2.start();
		t3.start();

	}

}

