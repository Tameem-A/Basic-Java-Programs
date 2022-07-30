import java.util.Scanner;

public class JavaScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
		int id;
		float marks;
		Scanner sc= new Scanner(System.in);
		System.out.println("Student Name");  //sysout+ ctrl+space
        Name=sc.next();
		System.out.println("Student Id"); //sysout+ ctrl+space
		id=sc.nextInt();
		System.out.println("Student Marks");  //sysout+ ctrl+space
		marks=sc.nextFloat();
		System.out.println("Student Name:"+Name+" | "+ "ID:"+id+ " | "+"Marks:"+marks);
		


        
	}

}
