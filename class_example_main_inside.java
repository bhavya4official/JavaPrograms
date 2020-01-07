//Defining a Student class.
class Student{
//Defining fields or data member or instance variable
int id;
String name;

public static void main(String arg[]){
//Creating an object or instance 
    Student s1= new Student();  //creating an object of Student 
//Printing values of the object 
    System.out.println(s1.id);  //accessing member through reference variable
    System.out.println(s1.name);
 }
}

/*
0
Null
*/
/*
A variable which is created inside the class but outside the method is known as an instance variable.
Instance variable doesn't get memory at compile time.
It gets memory at runtime when an object or instance is created.
*/
/*
The "new" keyword is used to allocate memory at runtime. All objects get memory in Heap memory area.
*/
