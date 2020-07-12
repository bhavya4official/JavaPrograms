import java.util.*;

 class ABB
 
{

    String[] arr=new String[5];

    Scanner sc=new Scanner(System.in);

    public void accept()
    
{
      for(int i=0;i<arr.length;i++)
       
{
          arr[i]=sc.next();
       
}
    }

    
    
public void display()
    
{
       System.out.println("Display Names");
        
for(String ss : arr)
        
{
         System.out.println(ss);
        
}
    }
 
    
public void sort()
    
{
       for(int i=0;i<arr.length-1;i++)
         
{
           for(int j=i+1; j<arr.length;j++)
             
{
               if(arr[i].compareTo(arr[j])>0)
                
{
                  String str=arr[i];
                   
arr[i]=arr[j];
                   arr[j]=str;
                
}  
             
}
         }
    }
    
    
public static void main(String as[])
    
{
      ABB aa=new ABB();
        
aa.accept();
        
System.out.println("Display Unsorted List ");
        
aa.display();  
        
System.out.println("Display Sorted List...");  
          
aa.sort();
        aa.display();
    
}
 }