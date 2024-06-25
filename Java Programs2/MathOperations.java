 class MathOperations 
 {
    //Method to add two numbers
    public int add(int a,int b)
    {
        return a+b;
    }

    //Method to square a number
    public int square(int a)
    {
        return a*a;
    }
    
//Nested method class example
public int addAndSquare(int a,int b)
{
    //Using the add method
    int sum=add(a,b);

    //Using the square method on the result of add method

    int result=square(sum);

    return result;
}
public static void main(String args[])
{
//Creating an insatnce of MathOperations
MathOperations mathOps=new MathOperations();

//Direct method calls
int addition=mathOps.add(2,3);
System.out.println("Addition of 2 and 3:" + addition);  //output:5

int squared=mathOps.square(4);
System.out.println("Square of 4:" + squared);   //Output:16

//Nested method calls
int nestedResult=mathOps.addAndSquare(2,3);
System.out.println("Square of the Sum of 2 and 3:" +nestedResult);   //Output:25
}
}