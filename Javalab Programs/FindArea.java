class Shape
{
    double calculateArea(double dimension1,double dimension2)
    {
        System.out.println("This method should be overridden by subclass");
        return 0;
    }
}
class Rectangle extends Shape
{
    double calculateArea(double length,double width)
    {
        return length*width;
    }
}

class Triangle extends Shape
{
    @Override
    double calculateArea(double base,double height)
    {
        return 0.5*base*height;
    }
}

public class FindArea
{
    public static void main(String[] args) 
    {
        Shape myRectangle=new Rectangle();
        Shape myTriangle=new Triangle();

        double RectangleArea=myRectangle.calculateArea(10,5);
        double TriangleArea=myTriangle.calculateArea(10,5);

        System.out.println("Area of Rectangle:" + RectangleArea);
        System.out.println("Area of Triangle:" + TriangleArea);
        
    }
}


