package OppsPractice;

/*
   Method overriding is nothing but If child class having same method as parent class with same name and formal arguments,
   then it is called as method overriding. 
   Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
   Method overriding is used for runtime polymorphism
 */

 class Vehicle{
	public void run() {
		System.out.println("Car Running");
	}
 }

 public class MethOverRidding extends Vehicle{
	
	public void run() {
		System.out.println("Bike Running");
	}

	public static void main(String[] args) {
		MethOverRidding meth = new MethOverRidding();
		meth.run();

	}

 }
