// Reading run time value frome keybord using console 
import java.io.*;
class ConsoleClass {
	public static void main(String[] args) {
	Console con=System.console();
	System.out.println("Enter the name :");
	String name=con.readLine();
	System.out.println(name);
	System.out.println("Enter the password :");
	char[] pass=con.readPassword();
	//System.out.println(pass);






		//System.out.println("Hello World!");
	}//end of the main method
}//end of the class
