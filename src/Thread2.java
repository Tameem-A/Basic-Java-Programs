
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		System.out.println("current thread"+ Thread.currentThread());
		System.out.println(t.getId());
		t.setName("Tameem");
		System.out.println(Thread.currentThread());
		System.out.println(t.getName());
		try {
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(Exception e) { }
	}

}
