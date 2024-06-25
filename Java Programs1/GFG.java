import java.io.*;
class GFG
{
//Method1
 void hello()
    {
//Print statement whenever this methods called
        System.out.println("This is the userDefinedMethod");
    }
//Method 2
    public static void main(String args[])
    {
//Creating instance of the class
        GFG ob=new GFG();

//calling the method of class 1
//inside class 2
        ob.hello();
    }
}