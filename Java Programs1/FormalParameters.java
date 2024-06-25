public class FormalParameters 
{
    //Method with Foramal Parameters
    public void greet(String name,int age)
    {
        System.out.println("Hello"+name+",you are"+age+"years old.");
    }

    public static void main(String args[])
    {
    FormalParameters example=new FormalParameters();
   
    //Method call with Actual Parameters
    example.greet("Alice",30); //"Alice" and 30 are actual parameters
}
}
