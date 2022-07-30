abstract class Bank
{    
abstract int getRateOfInterest();    
}    
class SBI extends Bank
{    
int getRateOfInterest()
{
	return 7;
}    
}    
class PNB extends Bank{    
int getRateOfInterest(){return 8;}    
}    
    
class AbstractDemo3{    
public static void main(String args[]){    
//Bank b;  
SBI obj1=new SBI();  
System.out.println("Rate of Interest is: "+obj1.getRateOfInterest()+" %");    
PNB obj2=new PNB();  
System.out.println("Rate of Interest is: "+obj2.getRateOfInterest()+" %");    
}}    