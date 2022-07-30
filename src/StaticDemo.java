class Emp{
	int eid;
	int salary;
	static String ceo;  //static makes same for all objects
	
	public void show() {
		System.out.println(eid +":"+ salary + ":"+ceo);

	}
	
}
public class StaticDemo {
	public static void main(String args[]) {
		Emp obj= new Emp();
		obj.eid=1234;
		obj.salary=5000;
		Emp.ceo="Puri";
		
		
		Emp obj2= new Emp();
		obj2.eid=1254;
		obj2.salary=8000;
		Emp.ceo="Puri";
		Emp.ceo="Tamim"; // we dont meed object
		obj.show();
		obj2.show();
		
	}

}
