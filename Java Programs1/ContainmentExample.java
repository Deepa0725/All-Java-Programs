class Engine 
{
private String type;

public Engine(String type) 
{
this.type = type;
}
        
public String getType() 
{ 
return type; 
}
}
        
//Define the Car class which contains an Engine object 
class Car 
{
private String model;
private Engine engine;

public Car(String model, Engine engine)
{     
this.model = model;
this.engine = engine;
}
        
public void displayDetails() 
{ 
System.out.println("Car Model: " + model); 
System.out.println("Engine Type: " + engine.getType()); 
}
}

// Main class to demonstrate containment
public class ContainmentExample
{
public static void main(String[] args) 
{ 
// Create an Engine object 
Engine engine = new Engine("V8");

// Create a Car object with the Engine object 
Car car = new Car("Ford Mustang", engine);

// Display car details 
car.displayDetails();
} 
}
