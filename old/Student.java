import java.util.*;
class Student
{
private String name;
Scanner sc=new Scanner(System.in);
public void getname()
	{
	name=sc.next();
	}
public void display()
{System.out.println("Name is "+name);
}
public static void main(String... as)
{
Student std= new Student();
std.getname();
std.display();
}
}