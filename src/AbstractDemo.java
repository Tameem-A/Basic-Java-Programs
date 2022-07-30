class Printer
{
	public void show(Number i)   // here number accepts both int and float values bcoz Number is an abstract class which extends both integer and double
	// show(Integer i) & show(Double i)
	{  
		System.out.println(i);
	}
}
public class AbstractDemo {
	public static void main(String args[]) {
		Printer obj= new Printer();
		obj.show(5.5);
		obj.show(5);
	}

}
