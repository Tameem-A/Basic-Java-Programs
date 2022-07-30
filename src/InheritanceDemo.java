class Calc1{   //super class or parent class
	public int sum(int a, int b)
	{
		return a+b;
	}
}

class Calc2 extends Calc1   //sub class or child class
{
	public int sub(int a , int b)
	{
		return a-b;
	}
}

class Calc3 extends Calc2{
	public int mul(int a , int b)
	{
		return a*b;
	}
}
public class InheritanceDemo {
	public static void main(String args[]) {
		Calc3 obj1= new Calc3();
		System.out.println(obj1.sum(3, 4));
		System.out.println(obj1.sub(3, 4));
		System.out.println(obj1.mul(3, 4));


	}

}
