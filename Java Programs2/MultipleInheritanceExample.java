//Define the first interface
interface Animal
{
    void eat();
}

//Define the Second interface
interface Mammal
{
    void sleep();
}

//Implements both interfaces in asingle class
class Dog implements Animal,Mammal
{
    //Provide implementation for the eat method from the Animal interface
    public void eat()
    {
        System.out.println("Dog is eating");
}

    //provide implementation for the sleep method from the mammal interface
    public void sleep()
    {
        System.out.println("Dog is sleeping");
    }
}

//Main class to demonstrate multiple inheritance
public class MultipleInheritanceExample 
{
    public static void main(String[] args) 
    {
        Dog dog=new Dog();

dog.eat();
dog.sleep();
    }
}
