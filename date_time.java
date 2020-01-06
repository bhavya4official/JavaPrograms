import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class TimeDemo{
  public static void main(String []arg){
    LocalDateTime obj1 = LocalDateTime.now();
    System.out.println("Default Date Time:" + obj1);
    
    DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
    String formatted = obj1.format(formatObj);
    System.out.println("After formatting:" + formatted);
    
    LocalDate obj2 = LocalDate.now();
    System.out.println(obj2);
    
    LocalTime obj3 = LocalTime.now();
    System.out.println(obj3);
    
/*
yyyy-MM-dd 	"1988-09-29" 	
dd/MM/yyyy 	"29/09/1988" 	
dd-MMM-yyyy 	"29-Sep-1988" 	
E, MMM dd yyyy 	"Thu, Sep 29 1988" 	
*/    
