public class EvenNumbers 
{
    public static void main(String[] args) 
{
        int number = 10; // Change this number to print even numbers up to a different limit

        System.out.println("Even numbers up to " + number + ":");
        for (int i = 0; i <= number; i++) 
{
            if (i % 2 == 0) 
{
                System.out.println(i);
}
}
}
}