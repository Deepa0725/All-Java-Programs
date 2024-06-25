class Base
{
    void f1()
    {
        System.out.println("bas");
    }
}

class Der extends Base
{
    void f1()
    {
        System.out.println("der");
    }
}


public class Slicing 
{
 public static void main(String ... args)
{
    Base b1=new Der();
b1.f1();
 }   
}
