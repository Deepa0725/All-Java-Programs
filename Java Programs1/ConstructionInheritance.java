//Invocation of constructor 
//calling without usage of
//super keyword

//class 1
//superclass
class Base
{
    //Constructor of super class
    Base()
    {
        //Print statement
        System.out.println("Base Class Constructor Called");
    }
}

//clas 2
//Sub class
class Derived extends Base
{
    //Consructor of sub class
    Derived()
    {
        //print statement
        System.out.println("Derived Class Consructor Called");
    }
}

//class 3
//main class
public class ConstructionInheritance 
{
    //main driver method
    public static void main(String[] args) {
        //creating an object of sub class
        //inside main() method
        Derived d=new Derived();

        //here first super class consructor will be 
        //called there after derived(sub class) 
        //consructor will be called
    }
}
