import java.util.Scanner;
public class MultiplicationTables
{
public static void main(String[] args)
{ 
Scanner scanner=new Scanner(System.in);
//Input range m and n 
System.out.print("Enter value for m: "); 
int m = scanner.nextInt();
System.out.print("Enter value for n: ");
int n=scanner.nextInt();
//Validate input
if (m >= n)
{
System.out.println("Invalid input. Ensure m < n."); 
return;
}
//Generate multiplication tables for each number in the range
for(int i=m;i<=n;i++)
{
System.out.println("Multiplication table for " + i + "");
for(int j=1;j<=10; j++) 
{
System.out.println(i+"x"+j+"="+(i*j));
}
System.out.println(); // Add a newline for readability
}
scanner.close();
}
}