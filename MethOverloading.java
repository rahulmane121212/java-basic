package OppsPractice;


class A{
	public void add(int a, int b) {
		System.out.println("Addition of two Numbers="+a+b);
		
	}
	
	public void add(int a, int b , int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(String s)
	{
		System.out.println("Calling Arbaz");
	}
}
 
class MethOverloading {

	public static void main(String[] args) {
		A a = new A();
		a.add(10, 15);
		a.add(5, 10, 15);
		a.add("arbaz");
		

	}
}

