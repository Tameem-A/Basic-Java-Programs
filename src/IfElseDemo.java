
public class IfElseDemo {
	public static void main(String[] args)
	{
		int marks=47;
		char grade;
		
		if(marks>=91)
		{
			grade='A';
		}
		else if(marks>=80)
		{
			grade='B';
		}
		else if(marks>=70)
		{
			grade='C';
		}
		else if(marks>=60)
		{
			grade='D';
		}
		else
		{
			grade='F';
		}
		
		System.out.println("Grade= "+ grade);
	}

}
