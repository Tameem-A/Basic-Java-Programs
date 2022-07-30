import java.io.*;
//import java.io.IOException;
public class IOBasics2 {
	public static void main(String[] args) throws IOException
	{
		InputStreamReader IR = new InputStreamReader(System.in);
		BufferedReader BR= new BufferedReader(IR);
		int a= Integer.parseInt(BR.readLine());
		String str=BR.readLine();
		System.out.println(a);
		System.out.println(str);

		
	}
 
}
