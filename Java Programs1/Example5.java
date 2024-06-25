public class Example5
{ 
public void modifyValue(int value) 
{
value=value + 10;
System.out.println("Inside method: "+ value); // Output: Inside method: 20
}
public static void main(String[] args) 
{
int originalValue = 10;
Example5 example = new Example5();
System.out.println("Before method call: " + originalValue); // Output: Before method call: 10
example.modifyValue(originalValue);
System.out.println("After method call: " + originalValue); // Output: After method call: 10
}
}