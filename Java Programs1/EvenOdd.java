import java.util.Scanner;
public class EvenOdd
{
    public static void main(String args[])
    {
      //Crating Scanner class object
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the number:");
      //reading value from the user
      int num=scan.nextInt();
      //method calling
      findEvenOdd(num);  
    }
    public static void findEvenOdd(int num) 
    {
      //method body
    if(num%2==0)
    System.out.println(num+" is even");
    else
    System.out.println(num+" is Odd");
    }  
}