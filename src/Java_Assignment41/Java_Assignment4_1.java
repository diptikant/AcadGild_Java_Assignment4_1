package Java_Assignment41;
/*
 * This class will help to master the method overloading and method overriding
*/

public class Java_Assignment4_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
			System.out.println("\n..........Demonstration of overriding.........");
			Boy ob=new Boy(); // Instance of the derived class created
			ob.dance("Rajiv"); // executing the base class method
			ob.eat();//eat method of base class override by derive class
			System.out.println("\n..........Demonstration of overloading.........");
			System.out.println("\nPrinting Name Only");
			ob.Print("Raghu"); // executing the print method with single string parameter  
			System.out.println("\nPrinting Name and Address");
			ob.Print("Ranjan", "Mumbai"); // executing the print method with two string parameters
	}

}
// Base Class
class Human  
{
	   public void eat() // Base class eat method
	   {
	      System.out.println("Human is eating");
	   }
	   
	   public void dance(String name) // Base class dance method
	   {
	      System.out.println(name + " is Dancing");
	   }
}
//Derived Class
class Boy extends Human
{
	   public void eat() // Derived class overridden eat method
	   {
	      System.out.println("The boy is eating");
	   }
	   public void Print(String Name) // print method with a string parameter
	   {
	      System.out.println("Name :" + Name );
	   }
	   public void Print(String Name,String Adress) // print method with two string parameter
	   {
	      System.out.println("Name :" + Name );
	      System.out.println("Adress :" + Adress );
	   }
	   

}
