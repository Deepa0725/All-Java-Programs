import java.io.*;
class Jump2 
{
public static void main(String[] args)
{
for (int i = 0; i < 10; i++) 
{
if (i == 6)
{
System.out.println();
// using continue keyword
// to skip the current iteration
continue;
}
System.out.println(i);
}
}
}