class student
{
	int rollno;
	String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EncapsulationDemo {
	public static void main(String args[])
	{
	    student s1= new student();

		s1.setRollno(53);
		s1.setName("Tameem");
		System.out.println(s1.getRollno());
	    System.out.println(s1.getName());

	}

}
