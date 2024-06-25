import java.util.Scanner;
public class Fibonacci
{
public static void main(String[] args)
{
int f=0, s=1, next;
Scanner ob=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=ob.nextInt();
System.out.println("Fibonnaci Series is:");
for(int i=1;i<=n;i++)
{
System.out.print(f+" ");
next=f+s;
f=s;
s=next;
}
}
}