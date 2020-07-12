import java.io.*;
class Mobile
{
String name;
int price;

void inp()throws IOException
{
BufferedReader sr= new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter model name: ");
name=sr.readLine();

System.out.println("Enter price: ");
price=Integer.parseInt(sr.readLine());
}

void disp()
{
System.out.println("Model name: "+name+"\n Price: ");
}

public static void main(String arg[])throws IOException
{
Mobile bb=new Mobile();
bb.inp();
bb.disp();
}
}
