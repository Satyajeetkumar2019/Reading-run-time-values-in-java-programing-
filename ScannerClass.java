//Reading run time value from keybord using scanner
import java.util.Scanner;
class ScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		/*
		System.out.println("enter the value");
		System.out.println(scn.nextInt());
		System.out.println(scn.nextInt());*/
//diffrena between next() and nextLine() method
	//	System.out.println(scn.next());//
		//System.out.println(scn.nextLine());

//problem with nextlin and next method below
/*
System.out.println("Enter the number :");
int n=scn.nextInt();
scn.nextLine();
System.out.println("Enter the name :");
String name=scn.nextLine();
System.out.println(n);
System.out.println(name);
*/
// write a program to print  id , name,salary ,dept 
System.out.println("Enter the employee id");
int id=scn.nextInt();
scn.nextLine();
System.out.println("Enter the name :");
String name=scn.nextLine();
scn.nextLine();
System.out.println("Enter the salary :");
double salary=scn.nextDouble();
scn.nextLine();
System.out.println("Entere the dept name");
String dept=scn.nextLine();
//scn.nextLine();
System.out.println("Display the employee detail here :");
System.out.println(id);
System.out.println(name);
System.out.println(salary);
System.out.println(dept);









	}//end of the main method
}//end of the class
