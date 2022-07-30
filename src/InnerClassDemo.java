class Outer{
	public void show() {
		System.out.println("Class Outer");
	}
	
	class Inner{
		public void display(){
			System.out.println("Class Inner");
		}
	}
}
public class InnerClassDemo {
	public static void main(String args[]) {
		Outer obj1=new Outer();
		obj1.show();
		Outer.Inner obj2= obj1.new Inner();
		obj2.display();
	}

}
