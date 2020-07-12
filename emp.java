import java.util.*;
class employee
{
  String name;
  int age;
  float salary;
  Scanner sc= new Scanner(System.in);
	public void accept()
	{
	System.out.println("enter employee name age and salary");
	name=sc.next();
	age=sc.nextInt();
	salary=sc.nextFloat();
	}
	public void display()
	{
	System.out.println(name+ "your age is "+age+" and salary is "+salary);
	}
public static void main(String as[])
	{
	employee emp= new employee();
	emp.accept();
	emp.display();
	}
}
		