package OppsPractice;

 class Parent {  
	 
	 public void car() {
		 System.out.println("Calling Car from Parent!");
	 }
	 public void bike() {
		 System.out.println("Calling Bike from Parent!");
	 }

}

 class Child extends Parent{
	 public void Bicycle() {
		 System.out.println("Calling Bicycle from Child!");
	 }
	 
	 public static void main(String[] args) {
		 Child c = new Child();
		 c.bike();
		 c.Bicycle();
		 c.car();
	 }
 }
