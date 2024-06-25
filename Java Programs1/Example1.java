public class Example1 
{
// Method with no parameters but returns a value
public String methodNoParamsReturn() 
{
return "This method does not accept parameters but returns a string.";
}
public static void main(String[] args) {
Example1 example = new Example1();
String result=example.methodNoParamsReturn(); // Calling the method and storing the return value System.out.println(result); // Printing the returned value
}
}