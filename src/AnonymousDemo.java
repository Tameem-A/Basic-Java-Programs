interface Alpha
{
	void show();
	
}
/*class Beta implements Alpha
{
	public void show()
	{
		System.out.println("Hey Hello");
	}
} */

public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha obj= new Alpha()
				{
			      public void show()
			      {
				         System.out.println("Hey Hello");
			      }
				};
				
		obj.show();		

	}

}
