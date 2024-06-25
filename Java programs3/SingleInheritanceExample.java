//Superclass
class Animal
{
    //Method in the superclass
    public void eat()
    {
      System.out.println("The animal eats food.");
    }
}

//Subclass
class Dog extends Animal{
    //Method in the subclass
    public void bark()
        {
            System.out.println("The Dog barks.");
        }
}
        
//Main class to demonstrate single inheritance
        public class SingleInheritanceExample 
        {
        public static void main(String args[])
        {
            //Create an instance of Dog
            Dog myDog=new Dog();

            //call methods from both the superclass and the subclass
            myDog.eat();  //Inherited method from Animal class
            myDog.bark();  //Method from Dog class
        }
    
}
