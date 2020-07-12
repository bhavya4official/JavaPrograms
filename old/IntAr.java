import java.util.*;
class IntAr
{ 
	int name[]=new int[5];
	Scanner sc=new Scanner(System.in);
public void insert()
{
System.out.println("Enter name");
for(int i=0;i<name.length;i++)
{name[i]=sc.nextInt();
}
}
public void display()
{System.out.println("Loop");
for(int ab:name)
	{
	System.out.println(name+" ");
	}
}

public static void main(String as[])
{
IntAr n=new IntAr();
n.insert();
n.display();
}
}

