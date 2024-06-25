public class FinalMembersExample 
{
    
//Final instance variable
private final int instanceVar; 
 
//Final static variable(constant)
public static final int STATIC_VAR=100;

//Constructor to initialize final instance variable
public FinalMembersExample(int value)
{
this.instanceVar=value;
}

//Final Method(connot be overriden)
public final void displayValues()
{
System.out.println("Instance Variable:" +instanceVar);
System.out.println("Static Variable:" +STATIC_VAR);
}
public static void main(String[] args)
{
FinalMembersExample example=new FinalMembersExample(42);
example.displayValues();
    
//Uncommenting the following line will cause a compile-Time error
//example.instanceVar=50;

//Uncommenting the following line will cause a compile-Time error
//FinalMembersExample.STATIC_VAR=200;
} 
}
