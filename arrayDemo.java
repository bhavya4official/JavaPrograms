import java.io.*;
class arrayDemo
{
	int[][] n=new int[3][3];
	int i,j;


void accept() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the value to store in array");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		n[i][j]=Integer.parseInt(br.readLine());
		}
	}
}
void display()
{

	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		System.out.print(n[i][j]+"\t");
		}
	System.out.println();
	}
}
public static void main(String ar[]) throws IOException
{
arrayDemo o=new arrayDemo();
o.accept();
o.display();
}
}