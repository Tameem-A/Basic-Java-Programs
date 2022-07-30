class AB
{
	public AB()
	{
		System.out.println("In AB");
	}
	public AB(int i)
	{
		System.out.println("In int AB");
	}
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	
}

class BC extends AB
{
	public BC()
	{
		System.out.println("In BC");

	}
	public BC(int i)
	{
		super(i); /// remove this and try u will know the difference  

		System.out.println("In int BC");

	}
}

public class SuperDemo{
	public static void main(String args[]) 
	{
		BC obj= new BC(5);
		obj.add(3,4);
	}
}
