import java.io.*;
public class arrayM
{
int[] n=new int[4];
int i,min,sum=0;
void accept() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the array of 4 elements");
	for(i=0;i<4;i++)
	{
	n[i]=Integer.parseInt(br.readLine());
	}
}
void addValue()
{
	for(i=0;i<4;i++)
	{
	sum=sum+n[i];
	}
System.out.println("Sum of arrays: "+sum);
}
void comp()
{
	min=n[0];
	for(int j=0;j<4;j++)
	{
	if(n[j]<min)
	min=n[j];
	}
System.out.println("minimum no is: "+min);
}
public static void main(String ar[]) throws IOException
{
arrayM o=new arrayM();
o.accept();
o.addValue();
o.comp();
}
}


	