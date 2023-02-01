package OppsPractice;

abstract class AbsBike {
	abstract void run();
    public void display()
    {
        System.out.println("Calling from abstract class");
    }

}


class Honda extends AbsBike{
    void run()
    {
        System.out.println("Running");
    }
    
    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
        h.display();
    }
}