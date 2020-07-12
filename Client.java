import java.io.*;
import java.net.*;

class Client
{
  public static void main(String as[])
  {
    try
     {
        Socket sc=new Socket("localhost",500);
        InputStream is=sc.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
         String msg=br.readLine();
       System.out.println("Server Said: "+msg);
     }
    catch(Exception ex)
    {
    }

  }
}