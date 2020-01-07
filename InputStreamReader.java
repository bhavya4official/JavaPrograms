// connecting the BufferedReader stream with the InputStreamReader stream for reading the line by line data from the keyboard
import java.io.*;
public class inputDemo{
  public static void main(String arg[]){
    InputStreamReader r = new InputStreamReader(System.out);
    BufferedReader br = new BufferedReader(r);
    System.out.print("Enter your name: ");
    String name = br.readLine();
    System.out.println("Welcome " + name);
    }
}
