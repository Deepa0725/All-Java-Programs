import java.util.Scanner;

class NegativeNumberException extends Exception 
{
 public NegativeNumberException(String message) 
{
 super(message);
 }
}

public class SquareRootCalculator
 {
 public static double calculateSquareRoot(int number) throws NegativeNumberException 
{
 if (number < 0) {
 throw new NegativeNumberException("Invalid input: " + number + ". Number must be non-negative.");
 }
 return Math.sqrt(number);
 }

 public static void main(String[] args) 
 {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a non-negative number to calculate its square root: ");
 int number = scanner.nextInt();
 
 try 
 {
 double result = calculateSquareRoot(number);
 System.out.println("The square root of " + number + " is " + result);
 } 

 catch (NegativeNumberException e) 
 {
 System.out.println("Exception: " + e.getMessage());
 } 

 finally 
 {
 scanner.close();
 System.out.println("Square root calculation process completed.");
 }
 }
}