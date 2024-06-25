import java.util.Scanner;
public class GreatestOfThree 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double greatest = num1;

        if (num2 > greatest) 
{
            greatest = num2;
        }
        if (num3 > greatest) 
{
            greatest = num3;
        }

        System.out.println("The greatest number is: " + greatest);

        scanner.close();
}
}