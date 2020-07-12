package java;
import java.util.*;
public class java 
{
    List<String> list=new ArrayList<String>();
    Scanner sc=new Scanner(System.in);
    public void enter()
    {
      System.out.println("Enter Student Name");
      String name=sc.next();
      list.add(name);
    }
    
    public void display()
    {
        for(String str:list)
        {
            System.out.println("Name : "+str);
        }
        
    }
     public static void main(String as[])
     {
         java mm=new java();
         char ch='y';
         while(ch=='y' || ch=='Y')
         {
             System.out.println("Enter 1 for Add Student Name");
             System.out.println("Enter 2 for Display Student Name");
             System.out.println("Enter 3 for Exit");
             int a=mm.sc.nextInt();
             switch(a)
             {
                 case 1:
                     mm.enter();
                     break;
                 case 2:
                     mm.display();
                     break;
                 case 3:
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Invlid Choice...");
                     break;
                
             }
              System.out.println("Do you want to enter More names Y/N");
               ch=mm.sc.next().charAt(0);
         }
                 
     }
}