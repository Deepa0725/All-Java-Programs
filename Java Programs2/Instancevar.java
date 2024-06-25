//java Program to demonstrate
// Instance Variable
import java.io.*;
class Instancevar 
{
//Declared Instance Variable
public String geek; 
public int i; 
public Integer I;
public Instancevar()
{
//Default Constructor
// initializing Instance Variable
this.geek="Shubham Jain";
}
// Main Method
public static void main(String[] args)
{
//Object Creation
Instancevar name = new Instancevar();
// Displaying O/P S
System.out.println("Geek name is: "+name.geek); 
System.out.println("Default value for int is " + name.i);
//toString() called internally 
System.out.println("Default value for Integer is "+ name.I);
}
}