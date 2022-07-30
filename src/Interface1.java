interface Ant
{
	void Ashow();
	void Adisplay();
}

interface  Bat
{
	void Bshow();
	void Bdisplay();     ///https://www.youtube.com/watch?v=Mj8uanC2Wn0 refer this video for example   ### class extends class|| class implements interface  || interface  extends interface
}

class ABCD implements Ant,Bat
{
	public void Ashow()
	{
		System.out.println("In Ashow");
	}
	public void Adisplay()
	{
		System.out.println("In Adisplay");
	}
	
	public void Bshow()
	{
		System.out.println("In Bshow");
	}
	public void Bdisplay()
	{
		System.out.println("In Bdisplay");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		ABCD obj=new ABCD();
		obj.Adisplay();
		obj.Ashow();
		obj.Bdisplay();
		obj.Bshow();

	}

}
