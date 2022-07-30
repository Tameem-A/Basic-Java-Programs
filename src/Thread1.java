class NewThread implements Runnable 
{ 
	
NewThread() {
	Thread t= new Thread(this ,"My first thread"); 
	//Thread t = new Thread(this, "Demo Thread"); 
//System.out.println("Child thread: " + t); 
	System.out.println( "Child Thread: " + t.getId());
t.start();
}
public void run() {
try {
for (int i = 5; i > 0; i--) { 
System.out.println("Child Thread: " 
+ i); Thread.sleep(500);
}
} catch (InterruptedException e) {
System.out.println("Child interrupted.");
}
System.out.println("Exiting child thread.");
}
}

public class Thread1 {
	public static void main(String args[]) {
		//A new thread is created as an object of
		// NewThread:
		new NewThread();
		try {
			for (int i = 5; i > 0; i--) { 
			System.out.println("Main Thread: " 
			+ i); Thread.sleep(1000);
			}
			} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
			}
			System.out.println("Main thread exiting.");
			}
			}



