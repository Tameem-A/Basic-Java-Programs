abstract class Shape
{
	abstract void draw();
	public void geey() {
		System.out.println("In geey");
	}
	
}

class rectangle extends Shape
{
	void draw()
	{
		System.out.println("In Draw");
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj= new rectangle();
		obj.draw();
		obj.geey();
		
	}

}
