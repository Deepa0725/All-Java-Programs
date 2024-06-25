interface Animal
{
void sound();        //absract method
void eat();      //absract method
}

abstract class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog barks");
    }
    //leaving the cat method absract
}

class Labrador extends Dog
{
    public void eat()
    {
        System.out.println("Labrador eats");
    }
}

public class Partial1
 {
    public static void main(String[] args) 
    {
    Labrador myLabrador=new Labrador();
    myLabrador.sound();
    myLabrador.eat();    
    }
}
