//Develope programe to print employ detail frome keybord using console method
//employe id, name,password,emailid etc.....;
import java.io.Console;
class EmployeDetail {
	public static void main(String[] args) {
	
	//to create variable name and inslize value
    // int id=0;
   String name=null;
  // char[] pass=0;
   String emailid=null;
   //to creat console object 
   Console con=System.console();
//System.out.println("Enter the Employe id :");
//id=con.readLine();
System.out.println("Enter the name :");
name=con.readLine();
System.out.println("Enter the passwprd :");
char[] pass=con.readPassword();
System.out.println("Enter the email id :");
emailid=con.readLine();
//Dispalay the employ detail 
//System.out.println(id);
System.out.println(" Emolpye name :"+name);
System.out.println("Employe password :"+pass);
System.out.println("Employe email :    "+emailid);

		//System.out.println("Hello World!");
	}
}
