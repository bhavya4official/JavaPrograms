class Studentc
{
private String name;
private int age;
private float fee;
	public Studentc(String name,int age,float fee)
	{
	this.name=name;
	this.age=age;
	this.fee=fee;
	}
public String getName()
{
   return name;
}

public int getAge()
{
   return age;
}
public float getFee()
{
   return fee;
}
public static void main(String as[])
{
   Studentc st=new Studentc("bhavya",20,43000f);
   st.getName();
   st.outName();
   st.getAge();
   st.getFee();
}	
}
