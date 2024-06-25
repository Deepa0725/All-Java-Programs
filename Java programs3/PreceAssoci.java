import java.util.Scanner;
public class PreceAssoci
{
public static void main(String[] args)
{
int x;
Scanner ob=new Scanner(System.in);
System.out.println("Enter the value of a"); 
int a=ob.nextInt();
System.out.println("Enter the value of b"); 
int b=ob.nextInt();
System.out.println("Enter the value of e"); 
int c=ob.nextInt();
x=a+b*c;
System.out.println("Output based on operator precedence="+x);

x=a-b+c;
System.out.println("Output based on operator Associativity="+x);

x=(a+b)*c;
System.out.println("Output based on operator Overridden1="+x);

x=a-(b+c);
System.out.println("Output based on operator Overridden2="+x);

ob.close();
}
}