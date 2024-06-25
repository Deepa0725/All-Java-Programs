public class ExampleStat 
{
static int counter=0;
ExampleStat()
{
counter=counter+1;
}
static int getCount()
{
return counter;
}
public static void main(String[] args)
{
int object;
ExampleStat objl=new ExampleStat();
ExampleStat obj2=new ExampleStat();
ExampleStat obj3=new ExampleStat();
object=ExampleStat.getCount();
System.out.println("Number of objects created:" + object);
}
}