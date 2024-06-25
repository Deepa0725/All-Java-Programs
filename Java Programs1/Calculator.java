public class Calculator 
{
// Method with formal parameters and a return type 
public int add(int num1, int num2)
{
return num1 + num2;
}
public static void main(String[] args)
{
Calculator calculator = new Calculator();
// Method call with actual parameters 
int result = calculator.add(5, 7); // 5 and 7 are actual parameters
System.out.println("The sum of 5 and 7 is: " + result); 
}
}