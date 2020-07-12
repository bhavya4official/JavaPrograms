import java.io.*;
public class Input
{
String name;
int stime, ltime, etime, ptime, ttime;

BufferedReader in= new BufferedReader (new InputStreamReader(System.in));
    void read()
    {
    System.out.println("Enter your name");
    name= in.readLine();
    System.out.println("Enter the time(in hours) you spend \n on SoloLearn");
    stime=Integer.parseInt(in.readLine());
    System.out.println("on other learning platform");
    ltime= Integer.parseInt(in.readLine());
    System.out.println("on entertainment");
    etime= Integer.parseInt(in.readLine());
    System.out.println("on other learning platform");
    ptime= Integer.parseInt(in.readLine());
    }
}

/*public class Output
{
int ttime, wtime, rtime;

ttime=(stime+ltime+etime+ptime);
    void show()
    {
    System.out.println("Thanks "+name+" for checking out my code,\n your total active time is "+ttime+"hr. \n");
    
/*if(stime+ltime>etime+ptime)
    {
        System.out.println("you are more focused on your goal");
    }     
else if(stime+ltime<etime+ptime)
    {
        System.out.println("you are spending more time on fun");
    }
else
    {
        System.out.println("you are living a balanced life");
    }*/
    }
}*/

public class Active
{
    public static void main(String[] args) 
    {
     Input o1= new Input();
     //Output o2= new Output();
     o1.read();
     //o2.show();
    }
}
