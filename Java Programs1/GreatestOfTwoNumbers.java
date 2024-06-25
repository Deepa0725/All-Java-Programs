import java.util.Scanner;
public class GreatestOfTwoNumbers
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int greatest = num1 > num2 ? num1 : num2;
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}