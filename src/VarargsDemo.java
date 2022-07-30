class Calu{
	public int sum(int ... n)  //Variable arguments
	{
		int sum=0;
		for(int i:n)
		{
			sum=sum+i;
			
		}
		return sum;
	}
}
public class VarargsDemo {
	public static void main(String args[]) {
		Calu obj1= new Calu();
 		System.out.println(obj1.sum(1,2,3,4,5,6));
	}

}
