//Define the vase interface
interface Vehicle 
{
void start();
void stop();
}

//Extend the Base interface
interface Car extends Vehicle
{
    void honk();
}

//Implemnting class that implemts the derived interface
class Sedan implements Car
{

    //providing implementation for start method
public void start()
{
    System.out.println("Sedan starts");
}
    //providing implementation for stop method
    public void stop()
    {
System.out.println("Seden stops");
    }

  //providing implementation for honk method
public void honk()
{
System.out.println("Seden honks");
}
}

public class ExtensionImplement 
{
    public static void main(String[] args) 
    {
        Sedan mySedan=new Sedan();
        mySedan.start();
        mySedan.stop();
        mySedan.honk();
    }
}