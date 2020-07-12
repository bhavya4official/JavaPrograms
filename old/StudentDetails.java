;import java.util.*;
class Student 
{
private String name;
private int age ;
private float fee;
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
return name;
}

 
 
 public void setAge(int age)
  
{
    this.age=age;
  
}

  public int getAge()
  
{
     return age;
  
} 

  public void setFee(float fee)
  
{
    this.fee=fee;
  
}
  public float getFee()
  
{
     return fee;
  
} 
}

  
class StudentDetails
 
{
    Student[] stus;
   Scanner sc=new Scanner(System.in);

   public void insert()
   
{
    System.out.println("Enter No of Students ");

     int no=sc.nextInt();
     stus=new Student[no];

    
     for(int i=0;i<stus.length;i++)
       {
        
 System.out.println("Enter Student Name Age And Fee");
 
        Student st=new Student();
     
    st.setName(sc.next());
         st.setAge(sc.nextInt());
     
    st.setFee(sc.nextFloat());
 
         stus[i]=st;
       }     
 
   }


   public void display()
   
{
     System.out.println("Display Student Details..");

     System.out.println("Name\tAge\tFee");
  
   for(Student ss:stus)
      
 {
         
System.out.println(ss.getName()+"\t"+ss.getAge()+"\t"+ss.getFee());

       }

   }

  
 public static void main(String... as)
 
  {
     StudentDetails std=new StudentDetails();

     std.insert();

     std.display();
  
 } 
}
