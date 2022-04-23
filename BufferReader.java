//Bufferclass using reading run time value
import java.io.*;
class BufferReader{
	public static void main(String[] args) throws IOException{

BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Entr the byte numbre");
byte b=Byte.parseByte(br.readLine());
System.out.println(b);
System.out.println("Entere the short ");
short s=Short.parseShort(br.readLine());
System.out.println(s+" ");
System.out.println("Enter the int ");
int T= Integer.parseInt(br.readLine());
System.out.println(T+" ");
System.out.println("Entter the long");
long l=Long.parseLong(br.readLine());
System.out.println(l+" ");
System.out.println("Entter the float");
float f=Float.parseFloat(br.readLine());
System.out.println(f+" ");
System.out.println("Entter the double");
double d=Double.parseDouble(br.readLine());
System.out.println(d+" ");
System.out.println("Entter the char");
char ch=br.readLine().charAt(0);
System.out.println(ch+" charechter");
System.out.println("Entter the boolen");
boolean bl=Boolean.parseBoolean(br.readLine());
System.out.println(bl+" boolean ");

//System.out.println(T);


	}//end  of the main method
}//end of the class 
