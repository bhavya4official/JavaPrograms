
import java.io.*;
import java.net.*;
import clientdatasend.ReadWrite;
 class ServerData
{
   
   public static void writeFile(byte[] bb,String filename)
{
  try
{
    FileOutputStream fos=new FileOutputStream("serverdata/"+filename);
    fos.write(bb);
   fos.close();}
  catch(Exception ex){}
}

  public static void main(String as[])
  {
     try
     {
       ServerSocket ss=new ServerSocket(5000);
        System.out.println("Server Started Waiting for a Client...");
       Socket s=ss.accept();
      PrintStream ps=new PrintStream(s.getOutputStream());
      DataInputStream dis=new DataInputStream(s.getInputStream());
    
      ObjectInputStream ois=new ObjectInputStream(dis);
     ReadWrite rw=(ReadWrite)ois.readObject();
     writeFile(rw.getData(),rw.getFilename());
     ps.println("Data Saved Successfully On Server");
     }
     catch(Exception ex){}
  }
  
}