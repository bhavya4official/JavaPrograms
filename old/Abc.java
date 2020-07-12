class Abc
{
public void Abc()
	{System.out.println("constructor call");
	}
public void Abc(int a)
	{System.out.println("single parameterized constructor call");
	}
public void Abc(int a,int b)
	{System.out.println("2 paremeterized constructor call");
	}
public void Abc(int a,float b)
	{System.out.println("float constructor call");
	}

public void Abc(float a,int b)
	{System.out.println("sequence constructor call");
	}
public static void main(String as[])
	{
	Abc c=new Abc();
	Abc c=new Abc(4);
	Abc c=new Abc(2,3);
	Abc c=new Abc(1.5f,20);	
	}
}