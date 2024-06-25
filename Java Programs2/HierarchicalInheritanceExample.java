//parent class
class Animal
{
    void eat()
{
    System.out.println("The animal eats food");
}
}

//child class 1
class Dog extends Animal
{
    void bark()
    {
System.out.println("The dog barks.");
    }
}

//child class 2
class Cat extends Animal
{
    void meow()
    {
    System.out.println("The cat meows.");
}
}

//main class to demonstrate hierarchical inheritance
public class HierarchicalInheritanceExample 
{
    public static void main(String[] args) 
    {
        //create an object of Dog class
        Dog dog=new Dog();
        dog.eat();  //Inherited method from Animal class
        dog.bark();  //Method from Dog class

        //create an object of cat class
        Cat cat=new Cat();
        cat.eat();  //Inherited method from Animal class
        cat.meow(); //Method from Cat class
    }
}
