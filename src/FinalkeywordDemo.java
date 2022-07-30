class A
{
	public final void show()
	{
		System.out.println("In show");

	}
}

class B extends A
{
	//public void show() {
		//System.out.println("In show");     // remove comments to understand the logic

	}
//}
public class FinalkeywordDemo {
	public static void main(String[] arg) {
		B obj= new B();
		obj.show();
	}

}

