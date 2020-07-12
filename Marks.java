import java.io.*;
class Marks
{
public static void main(String arg[])throws IOException
{
int a,b,c,d,e,f;
float p;
InputStreamReader sr= new InputStreamReader(System.in);
BufferedReader ob= new BufferedReader(sr);

System.out.println("enter your marks of 5 subjects");
a=Integer.parseInt(ob.readLine());
b=Integer.parseInt(ob.readLine());
c=Integer.parseInt(ob.readLine());
d=Integer.parseInt(ob.readLine());
e=Integer.parseInt(ob.readLine());

f=a+b+c+d+e;
System.out.println("Your total marks is "+f);

p=(f/5)*100;
System.out.println("Your percentage is "+p);
}
}