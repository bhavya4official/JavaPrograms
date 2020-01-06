import java.util.scanner; // Import the Scanner class
class Demo{
  public static void main(System []arg){
    Scanner input = new Scanner(Sysetm.in);  // Create a Scanner object
    
    System.out.print("Enter your name:");
    String name = input.nextLine();  // Read user input
    
    System.out.print("Enter your ID:");
    int ID = input.nextInt();
    
    System.out.println("Hello"+name);  // Output user input
    }
}    
/*
nextBoolean() 	
nextByte() 	
nextDouble()
nextFloat() 
nextInt() 	
nextLine() 	
nextLong() 	
nextShort()
*/
