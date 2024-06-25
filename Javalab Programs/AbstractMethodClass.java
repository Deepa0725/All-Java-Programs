abstract class Shape
{
    public abstract void draw();
   }
   class Circle extends Shape
   {
    public void draw()
    {
    System.out.println(" Drawing a circle");
    }
   }
   class Rectangle extends Shape
   {
    public void draw()
    {
    System.out.println(" Drawing a Rectangle");
    }
   }
   public class AbstractMethodClass 
   {
    public static void main(String[] args)
    {
    Circle C = new Circle();
    Rectangle R = new Rectangle();
    C.draw();
    R.draw();
    }
   }