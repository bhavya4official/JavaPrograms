File Handling in java Simple Reading and Writing
import java.io.*;
public class FileRead {
public void ReadData()
{
try
{
FileReader fr=new FileReader("e:/iims2017/Mini Project Topic.txt");
BufferedReader br=new BufferedReader(fr);
String str="";
while((str=br.readLine())!=null)
{
System.out.println(str);
}
}
catch(Exception ex)
{
}
}
public void WriteData()
{
try
{
FileWriter fw=new FileWriter("E://baccho chup ho jao.doc");
BufferedWriter bw=new BufferedWriter(fw);
InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);
System.out.println("Enter Text Here\n If you want to Stop Than type Exit ");
String str="";
while(!(str=br.readLine()).equalsIgnoreCase("exit"))
{
bw.write(str);
bw.newLine();
}
bw.close();
fw.close();
System.out.println("File Write Successfully...");
}
catch(Exception ex)
{
}
}
public static void main(String as[])throws Exception
{
long start=System.currentTimeMillis();
FileRead ff=new FileRead();
ff.WriteData();
long end=System.currentTimeMillis();
System.out.println("Total Execution Time Is : "+(end-start));
}
}