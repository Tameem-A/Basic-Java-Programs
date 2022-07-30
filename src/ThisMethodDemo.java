class Thismethod{
	int num1;
	int num2;
	int result;
	
	public Thismethod(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
	public void cal() {
		result=num1+num2;
	}
	public int result1(){
		return result=num1+num2;

	}
	public Thismethod() {
		System.out.println("This is executed");	
	}
	
	
}
public class ThisMethodDemo {
	public static void main(String args[]) {
		
		Thismethod obj1 = new Thismethod();
		obj1.num1=5;
		obj1.num2=2;
		Thismethod obj2 = new Thismethod(5,6);
		//obj2.cal();
		obj2.result1();
		obj1.cal();
		System.out.println("result:"+obj1.result);

		System.out.println("result:"+obj2.result);

		
		
	}

}
