public class Example3 
{
// Method with parameters and no return value
public void methodParamsNoReturn(int number, String message)
{
System.out.println("Number: " + number + ", Message: " + message);
}
public static void main(String[] args) 
{
Example3 example = new Example3();
example.methodParamsNoReturn(5, "Hello World!"); // Calling the method with arguments
}
}