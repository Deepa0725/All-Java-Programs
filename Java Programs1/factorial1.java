public class factorial1 
{
    //Recursive method to calculate factorial
    public static int factorial(int n)
    {
        if(n==0) //Base Case
        {
            return 1;
        }
        else //Recursive Case
        {
            return n*factorial(n-1);
        }
    }
    public static void main(String args[])
    {
        //Test the factorail method
        int number= 5;
        int result= factorial(number);
        System.out.println("Factorial of " + number + " is " + result); //output:120
    }
    
}
