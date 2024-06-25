class Animal
{
    public void makeSound()
    {
System.out.println("Generic animal sound");
    }
} 


class Dog extends Animal
{
@Override  //optional annotation to indicate overriding
public void makeSound()
{
    System.out.println("Woof!");
}
}

class Cat extends Animal
{
@Override  //optional annotation to indicate overriding
public void makeSound()
{
    System.out.println("Meow!");
}
}
    
public class MethodOverride 
{
    public static void main(String[] args) 
    {
        Animal animal1=new Dog();//Upcasting
        Animal animal2=new Cat();

        animal1.makeSound();//Executes Dog.makeSound()(Woof!)
        animal2.makeSound();//Executes Cat.makeSound()(Meow!)
    }
}
        
    
    

