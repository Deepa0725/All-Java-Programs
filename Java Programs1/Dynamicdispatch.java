class Animal
{
    void display()
    {
        System.out.println("Welcome to Zoo");
    }
}
class Lion extends Animal
{
    void display()
    {
        System.out.println("Lion is a king of Forest");
    }
}
    class Deer extends Animal
    {
void display()
{
    System.out.println("Deer is Cutest Animal");
}
    }
    
    public class Dynamicdispatch 
    {
    public static void main(String[] args) 
    {
        
    
    Animal A=new Animal();
    Lion L=new Lion();
    Deer D=new Deer();

    Animal ref;
    ref=A;
    ref.display();

    ref=L;
    ref.display();

    ref=D;
    ref.display();
    }
}
