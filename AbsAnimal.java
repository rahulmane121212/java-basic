package OppsPractice;

abstract class AbsAnimal{
    abstract void elephant();
    abstract void dog();
    public void cat()
    {
        System.out.println("\nMeow Meow");
    }
}

class Sound extends AbsAnimal{
    void elephant()
    {
        System.out.println("\nWohh");
    }
    
    void dog()
    {
        System.out.println("\nBhau Bhau");
    }
    
    public static void main(String[] args)
    {
        Sound s = new Sound();
        s.elephant();
        s.cat();
        s.dog();
    }
}

