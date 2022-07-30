class Sum{
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	public void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
}
public class ConstructorOverloadingDemo {
	public static void main(String args[]) {
		Sum obj1=new Sum();
		obj1.add(3, 8);
		obj1.add(3,2,1);
	}

}
