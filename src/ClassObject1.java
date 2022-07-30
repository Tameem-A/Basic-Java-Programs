class Calc
{
	int a;
	int b;
	int result;
	
	public void perform()
	{
		result= a+b;
	}
}
public class ClassObject1 {
	public static void main(String[] arg)
	{
		Calc obj= new Calc();
		obj.a=5;
		obj.b=2;
		obj.perform();
		System.out.println("Answwer is : "+obj.result);
	}

}
