Java Shopping program With Generate BILL
import java.util.*;
class Shopping 
{
float total=0.0f;
Scanner sc=new Scanner(System.in);
String desc="";
public void fridge()
{
System.out.println("Enter 1 for Purchase 100 Ltr Fridge");
System.out.println("Enter 2 for Purchase 150 Ltr Fridge");
System.out.println("Enter 3 for Purchase 250 Ltr Fridge");
int a=sc.nextInt();
switch(a)
{
case 1:
System.out.println("------------------------------------");
System.out.println("100 Ltr Fridge with Automatic Stabilizer 3 Star \n Price : 18000.00 Rs.");
System.out.println("------------------------------------");
System.out.println("Do you want to Add to cart press Y/N");
char ch=sc.next().charAt(0);
if(ch=='y' || ch=='Y')
{
desc+="100 Ltr Fridge : 18000 INR";
total+=18000.00f;
}
break;
case 2:
System.out.println("------------------------------------");
System.out.println("150 Ltr Fridge with Automatic Stabilizer 4 Star \n Price : 28000.00 Rs.");
System.out.println("------------------------------------");
System.out.println("Do you want to Add to cart press Y/N");
ch=sc.next().charAt(0);
if(ch=='y' || ch=='Y')
{
desc+="150 Ltr Fridge : 28000 INR";
total+=28000.00f;
}
break;
case 3:
System.out.println("------------------------------------");
System.out.println("200 Ltr Fridge with Automatic Stabilizer 5 Star \n Price : 38000.00 Rs.");
System.out.println("------------------------------------");
System.out.println("Do you want to Add to cart press Y/N");
ch=sc.next().charAt(0);
if(ch=='y' || ch=='Y')
{
desc+="200 Ltr Fridge : 38000 INR";
total+=38000.00f;
}
break;
}
}
public void tv()
{
System.out.println("Enter 1 for Purchase 32 inch LED");
System.out.println("Enter 2 for Purchase 32' inch Smart LED");
System.out.println("Enter 3 for Purchase 40' Android LED");
int a=sc.nextInt();
switch(a)
{
case 1:
System.out.println("------------------------------------");
System.out.println("32' LED TV with Energy saver And child Lock 3 Star \n Price : 12000.00 Rs.");
System.out.println("------------------------------------");
System.out.println("Do you want to Add to cart press Y/N");
char ch=sc.next().charAt(0);
if(ch=='y' || ch=='Y')
{
desc+="32' LED TV : 12000 INR";
total+=12000.00f;
}
break;
case 2:
System.out.println("------------------------------------");
System.out.println("32' LED TV with Automatic Stabilizer 4 Star \n Price : 28000.00 Rs.");
System.out.println("------------------------------------");
System.out.println("Do you want to Add to cart press Y/N");
ch=sc.next().charAt(0);
if(ch=='y' || ch=='Y')
{
desc+="32' Smart LED TV : 28000 INR";
total+=28000.00f;
}
break;
case 3:
System.out.println("------------------------------------");
System.out.println("40' Android LED TV with WI FI And Miracast screen Sharing \n Price : 38000.00 Rs.");
System.out.println("------------------------------------");
System.out.println("Do you want to Add to cart press Y/N");
ch=sc.next().charAt(0);
if(ch=='y' || ch=='Y')
{
desc+="40' Android LED TV : 38000 INR";
total+=38000.00f;
}
break;
}
}
public static void main(String as[])
{
Shopping sp=new Shopping();
System.out.println("***********************************");
System.out.println("*** LG TRADERS Sale For LG ONLY ***");
System.out.println("***********************************");
while(true) 
{
System.out.println("Enter 1 for purchase TV"); 
System.out.println("Enter 2 for purchase Fridge");
System.out.println("Enter 3 for Genrate Bill..");
System.out.println("Enter 4 for Exit");
System.out.println("Enter your choice");
int a=sp.sc.nextInt();
switch(a) 
{
case 1:
sp.tv();
break;
case 2:
sp.fridge();
break;
case 3:
System.out.println("Enter Customer Name :");
String name=sp.sc.next();
System.out.println("***********************");
System.out.println("***** Sale Invoice*****");
System.out.println("***********************");
System.out.println("Curtomer Name "+name);
System.out.println("** Product Description **");
System.out.println(sp.desc);
System.out.println("Total Amount "+sp.total);
System.out.println("Thank You Sir Please Visit Again...");
System.out.println("***********************");
break;
case 4:
System.exit(0);

}
} 
}

}