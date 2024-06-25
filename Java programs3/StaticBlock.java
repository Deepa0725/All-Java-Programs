class StaticBlock
{
static int a=7;
static int b;
void printValues()
{
System.out.println("a:"+a);
System.out.println("b:"+b);
}
static // static block
{
System.out.println("Inside Static Block");
b=a+5;
}
public static void main(String args[])
{
StaticBlock obj=new StaticBlock();
obj.printValues();
}
}