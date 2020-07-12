import java.net.*;
import java.io.*;

class Server
{
  public static void main(String as[])
  {
     try
      {
        ServerSocket ss=new ServerSocket(500);
        System.out.println("ServerStarted \n Waiting For Connection...");
        Socket sc=ss.accept();
        System.out.println("Connection Created...");
        OutputStream os=sc.getOutputStream();
        PrintStream ps=new PrintStream(os);
        ps.println("Hello Client");
      }
      catch(Exception ex)
      {
      }
  }
}