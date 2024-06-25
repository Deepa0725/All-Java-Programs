public class OverloadingExample 
{
    // Method 1: No parameters
    public void display() 
    {
        System.out.println("Display with no parameters");
    }

    // Method 2: Changing the number of parameters
    public void display(int a) 
    {
        System.out.println("Display with one parameter: " + a);
    }

    public void display(int a, int b) 
    {
        System.out.println("Display with two parameters: " + a + ", " + b);
    }

    // Method 3: Changing the data types of the arguments
    public void display(String s) 
    {
        System.out.println("Display with a String parameter: " + s);
    }

    public void display(double d) 
    {
        System.out.println("Display with a double parameter: " + d);
    }

    // Method 4: Changing the order of the parameters
    public void display(int a, String s) 
    {
        System.out.println("Display with int and String parameters: " + a + ", " + s);
    }

    public void display(String s, int a) 
    {
        System.out.println("Display with String and int parameters: " + s + ", " + a);
    }

    public static void main(String[] args) 
    {
        OverloadingExample example = new OverloadingExample();

        // Calling methods to demonstrate overloading

        // No parameters
        example.display();

        // Changing the number of parameters
        example.display(10);
        example.display(10, 20);

        // Changing the data types of the arguments
        example.display("Hello");
        example.display(10.5);

        // Changing the order of the parameters
        example.display(30, "Order");
        example.display("Order", 30);
    }
}
