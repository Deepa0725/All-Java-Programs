final class MyFinalClass
{
    void myFinalMethod()
    {
        System.out.println("We are in the final class we just created");
    }
}

public class FinalClassExample
 {
    public static void main(String[] args) 
    {
        MyFinalClass fc=new MyFinalClass();
        fc.myFinalMethod();
    }
}
