public class FibonacciSeries 
{
    public static void main(String[] args) 
{
        int n = 10; // Change this to the desired number of Fibonacci numbers
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series up to " + n + " numbers:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            int sum = first + second;
            first = second;
            second = sum;
}
}
}