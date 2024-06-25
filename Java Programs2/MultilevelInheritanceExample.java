//Base class
class Animal
{
    public void eat()
    {
System.out.println("The animal eats food");
    }
}

//Derived class
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("The dog barks.");
    }
}

//Another derived class
class Labrador extends Dog
{
    public void fetch()
    {
        System.out.println("The Labrador fetches the ball.");
    }
}

public class MultilevelInheritanceExample 
{
  public static void main(String[] args) 
  {
    //Create an object of the derived class
    Labrador labrador=new Labrador();

    //call methods from all levels of the inheritance chain
    labrador.eat();  //From Animal class
    labrador.bark();  //From Dog class
    labrador.fetch();  //From Labrador class
  }  
}
