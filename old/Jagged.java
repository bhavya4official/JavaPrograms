import java.util.*;

class TwoDim
{

   int arr[][]=new int[3][3];

   Scanner sc=new Scanner(System.in);


 public void accept()

{
    System.out.println("Enter array Elements");

    for(int i=0;i<arr.length;i++)
    
 {
       for(int j=0;j<arr[i].length;j++)
       
 {
           arr[i][j]=sc.nextInt();
       
 }
     
}
 }

  
public void display()
  
{
     System.out.println("Display Array Elements");
     
for(int i=0;i<arr.length;i++)
      
{
        
for(int j=0;j<arr[i].length;j++)
          
{
           
 System.out.print("  "+arr[i][j]);
         
 }
          System.out.println();
     
 }
  }
  
  
public void display1()
  
{
    
System.out.println("Display Foreach Loop Elements");
      
for(int[] aa:arr)
        
{
           
for(int a : aa)
             
{
               
System.out.print(a+"   ");
             
}
           
 System.out.println();
        
}
  }

  public static void main(String as[])
  {
       
TwoDim dd=new TwoDim();
        
dd.accept();
       
dd.display();
        
dd.display1();

  
}
}