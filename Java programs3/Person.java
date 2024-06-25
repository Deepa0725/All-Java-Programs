import java.util.Scanner;
public class Person
{
private String name;
private int age;
private String email;
public String getName() 
{
return name;
}
public void setName(String name) 
{
this.name = name; 
}
public int getAge() 
{
return age;
}
public void setAge(int age) 
{
this.age = age;
}
public String getEmail() 
{
return email;
}
public void setEmail(String email)
{
this.email = email;
}
public static void main(String []args)
{
Scanner scanner = new Scanner(System.in);
Person person = new Person();
System.out.print("Enter name: ");
String name = scanner.nextLine();
person.setName(name);
System.out.print("Enter age: ");
int age = scanner.nextInt();
person.setAge(age);
scanner.nextLine(); 
System.out.print("Enter email: ");
String email=scanner.nextLine();
person.setEmail(email);
System.out.println("\nName: " + person.getName());
System.out.println("Age: " + person.getAge());
System.out.println("Email: " + person.getEmail());
}
}