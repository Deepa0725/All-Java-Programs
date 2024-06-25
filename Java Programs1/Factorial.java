public class Factorial 
{
    public static void main(String[] args) 
{
        int number = 5; // Change this to any number you want to find the factorial of
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
else 
{
            return n * calculateFactorial(n - 1);
        }
    }
}