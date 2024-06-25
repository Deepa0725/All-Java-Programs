import java.util.Scanner;

public class GCDandLCM 
{
    // Function to find GCD of two numbers
    public static int findGCD(int a, int b) 
{
        while (b != 0) 
{
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // Function to find LCM of two numbers
    public static int findLCM(int a, int b) 
{
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        // Finding and printing GCD
        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        // Finding and printing LCM
        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}