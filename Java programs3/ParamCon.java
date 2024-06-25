import java.io.*;
class Geek
{
//data members of the class. 
String name; 
int id; 
Geek(String name, int id)
{
this.name=name; 
this.id=id;
}
}
class ParamCon 
{
public static void main(String[] args)
{ 
// This would invoke the parameterized constructor
Geek ob = new Geek("Avinash", 68); 
System.out.println("GeekName:" + ob.name +" and GeekId:" + ob.id);
}
}