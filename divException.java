import java.io.*;
class divException
{
	public static void main(String ar[])
	{
int n1,n2,res=0;
try
	{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

System.out.println("Enter the first no");
n1=Integer.parseInt(br.readLine());

System.out.println("Enter the second no");
n2=Integer.parseInt(br.readLine());

res=n1/n2;

System.out.println("Result="+res);
	}

catch(NumberFormatException e)
 {
	System.out.println("Error="+e);
	System.out.println("Please enter the valid data type");
 }
catch(ArithmeticException e)
 {
	System.out.println("Error="+e);
 }
catch(IOException e)
 {  //Checked Exception
	System.out.println("Error="+e);
 }



finally
	{//to show result even if exception exist
	System.out.println("Auto Result="+res);
	}
}
}