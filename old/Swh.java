import java.util.*;
class Swh
{
	public void disp1()
	{ 
	 System.out.println("Hello");
	}
	public void disp2()
	{
	System.out.println("Hi");
	}
public static void main(String as[])
{ 
 Swh ss=new Swh();
Scanner sc= new Scanner(System.in);
System.out.println("Enter Hi or Hello (for swapping)");
String a =sc.next();

switch(a)
	{
	case "Hi":	ss.disp1();
	 break;

	case "Hello":	ss.disp2();
	 break;

	default:	System.out.println("Wrong choice");
	 break;
	}
}
}