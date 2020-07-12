import java.io.*;

class cal
{
public static void main(String arg[])throws IOException
{
int num1,num2,num3;
InputStreamReader sr=new InputStreamReader(System.in);
BufferedReader ar=new BufferedReader(sr);

System.out.println("enter first number");
num1=Integer.parseInt(ar.readLine());
System.out.println("enter second number");
num2=Integer.parseInt(ar.readLine());
num3=num1+num2;
System.out.println("Sum= "+num3);
}
}