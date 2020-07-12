import java.io.*;
class New
{
public static void main(String agr[])throws IOException
{
String name;
InputStreamReader sr = new InputStreamReader(System.in);
BufferedReader ob = new BufferedReader(sr);

System.out.println("Hello \n"+"Enter your name");
name=ob.readLine();

System.out.println("Thank you"+" "+name+"\n have a great day");
}
}