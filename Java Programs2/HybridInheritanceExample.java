//Base class
class Animal
{
    void eat()
    {
        System.out.println("The animal eats.");
    }
}

//Derived class from Animal(Single Inheritance)
class Mammal extends Animal
{
    void walk()
    {
System.out.println("The mammal walks.");
    }
}

//Another class from Animal(Single Inheritance)
class Bird extends Animal
{
void layEggs()
{
System.out.println("The bird lays Eggs.");
}
}

//Flyable Interface
interface Flyable
{
    void fly();
}

//Bat class inherits from Mammal and implements Flyable interface(Hybrid Inheritance)
class Bat extends Mammal implements Flyable
{
    @Override
    public void fly()
    {
        System.out.println("The bat flies.");
    }
}

//Main class to demonstrate hybrid inheritance
public class HybridInheritanceExample 
{
    public static void main(String[] args) 
    {
        Bat bat=new Bat();

        //Bat inherits methods from Animal and Mmammal
        bat.eat();  //Inherited from Animal
        bat.walk();  //Inherited from Mammal
        bat.fly();   //Implemented from Flyable interface
    }
}
