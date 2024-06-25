public class Example4 
{
//Method with parameters and returns a value 
public int methodParamsReturn(int a, int b) 
{ 
return a+b; //Returning the sum of two integers 
}
public static void main(String[] args) 
{
Example4 example=new Example4(); 
int sum=example.methodParamsReturn(3,7); //Calling the method with arguments and storing the return value System.out.println("Sum:"+sum); // Printing the returned value 
}
}