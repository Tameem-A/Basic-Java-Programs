import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaSocket1 {
	public static void main(String[] args){  
		try{  
		ServerSocket ss=new ServerSocket(6666);  // creates socket with port 6666
		Socket s=ss.accept();       //establishes connection   
		DataInputStream dis=new DataInputStream(s.getInputStream());  // returns the 
		                                                                  
		String  str=(String)dis.readUTF();  // reads in a string that has been encoded using 
		                                                                                 
		System.out.println("message= "+str);  // prints the output in screen
		ss.close();  // closes this socket
		        } catch(Exception e){System.out.println(e);}  
		    }  
		}  


