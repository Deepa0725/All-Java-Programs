class Animal
{
    void sound()
    {
System.out.println("Animal make a Sound");
    }
} 


class Dog extends Animal
{
void sound()
{
    System.out.println("Dog Barks");
}
}

class Cat extends Animal
{
void sound()
{
    System.out.println("Cat Meows");
}
}
    
public class DynamicdispatchExample
{
    public static void main(String[] args) 
    {
 Animal myAnimal;  //Reference variable of type Animal

 myAnimal=new Dog();   //Dog object assigned to animal reference
 myAnimal.sound();    //oupts:dog barks

 myAnimal=new Cat();    //Cat object assigned to animal reference
 myAnimal.sound();    //output:cat meows
    
}
}