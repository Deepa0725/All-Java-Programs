import java.util.Scanner;
public class DateValidation 
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter year: "); 
int year = scanner.nextInt();
System.out.print("Enter month (1-12): ");
int month = scanner.nextInt();
System.out.print("Enter day (1-31): ");
int day = scanner.nextInt();
if(isValidDate(day, month, year)) 
{
System.out.println("Valid date");
}
else
{ 
System.out.println("Invalid date");
}
}
public static boolean isValidDate(int day, int month, int year) 
{
if(month <1 || month > 12)
{
return false;
}
// Check for leap year
if (month==2)
{ 
if(isLeapYear(year))
{
return day <= 29;
}
else
{ 
return day <= 28;
}
}
//Months with 30 days
if(month==4 || month==6||month==9||month==11)
{ 
return day <= 30;
}
//All other months 
return day <= 31;
}
public static boolean isLeapYear(int year)
{
return (year % 4 == 0 && year % 100 != 0) || (year % 400==0);
}
}