package encapsulation;
//import java.util.Scanner;
public class SimDriver 
{

	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		//HERE WE CREATED A OBJECT SIM CLASS BY THERE REFERENCE VARIABLE IS "s"
		//WE CAN ACCESS THE DATA BY USING REFERENCE VARIABLE
		Sim s=new Sim("Airtel",987654321l,299);
		System.out.println(s.getServiceProvider());
		s.setServiceProvider("AIRTEL");
		System.out.println(s.getBalance());
		s.setBalance(499);
		//WE CTREATED A NON STATIC METHOD FOR GET THE ALL DETAILS BY MENTIONING THE METHOD NAME "DISPLAY"
		s.display();
		Sim s1=new Sim("JIO",123456789l,699);
		s1.display();		
	}
}
