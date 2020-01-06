//The ArrayList class is a resizable array
import java.util.ArrayList;  // import the ArrayList class

class Demo{
  public static void main(String arg[]){
    ArrayList<String> cars = new ArrayList<String>();  // Create an ArrayList object
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mercedes");
    System.out.pirntln(cars);
    System.out.println(cars.size());
    System.out.println(cars.get(0));
    cars.set(1,"Audi");
    cars.remove(2);
    cars.clear();
    }
}
  
