
public class NestedifDemo {
	public static void main(String arhs[]) {
		int i=50;
		
		if(i==50) {
			System.out.println("i is 50");
			if(i<75) {
				System.out.println("i is smaller than 75");
				if(i<50) {
					System.out.println(" i is also less than 55");
				}
			}
		}
	}

}
