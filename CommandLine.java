//some tast case check here 
class CommandLine 
{
	public static void main(String[] args) 
	{ /*
		String  num=args[0];
	   String name=args[0];
	  String course=args[1];
     String  fee=args[3];
//display the value Here
		System.out.println(num);
		System.out.println(name);
		System.out.println(course);
		System.out.println(fee);

*/
//To prform addation operaction 
/*
int a= Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int result=a+b;
System.out.println(result);
*/
/*
byte b=Byte.parseByte(args[0]);
short s=Short.parseShort(args[1]);
int eno=Integer.parseInt(args[2]);
long l=Long.parseLong(args[3]);

double fee=Double.parseDouble(args[4]);
float f=Float.parseFloat(args[5]);

boolean brs=Boolean.parseBoolean(args[6]);
//char ch=args[7].charAt(7);
//Display the valuee frome comman line argument
System.out.println(b);
System.out.println(s);
System.out.println(eno);
System.out.println(l);
System.out.println(fee);
System.out.println(f);
System.out.println(brs);
//System.out.println(ch);
*/
//int i=Integer.parseInt(args[0]);
//System.out.println(i);

for(int i=0;i<args.length;i++){
	int a=Integer.parseInt(args[i]);
System.out.println(a);
}







	}//end of the main method
}//end of the class
