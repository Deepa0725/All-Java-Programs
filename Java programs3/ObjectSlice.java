//Base class
class Base{
    int x=10;

    void display()
    {
        System.out.println("Base class x: " + x);
    }
}

//Derived class
class Derived extends Base
{
    int y=20;

    @Override
    void display()
    {
        System.out.println("Derived class x:"+x+", y:"+y);
    }
}

public class ObjectSlice 
{
    public static void main(String[] args) 
    {
        Base baseRef=new Derived();
        baseRef.display();
    

if(baseRef instanceof Derived)
{
    Derived derivedRef=(Derived) baseRef;
    System.out.println("Derived class x:" +derivedRef.x + ", y:" +derivedRef.y);
}
}
}
