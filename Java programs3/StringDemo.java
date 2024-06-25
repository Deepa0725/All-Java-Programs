import java.util.Scanner;
public class StringDemo 
{
 public static void main(String[] args) 
 {
 Scanner S = new Scanner(System.in);
 System.out.println("Enter a string");
 String str=S.nextLine();
 System.out.println("Original String: \"" + str + "\"");

 int length = str.length();
 System.out.println("Length of the string: " + length);

 char charAt = str.charAt(0);
 System.out.println("Character at index: " + charAt);

 String substring = str.substring(2, 5);
 System.out.println("Substring from index 7 to 12: \"" + substring + "\"");

 int indexOf = str.indexOf('W');
 System.out.println("Index of character 'W': " + indexOf);

 String lowerCase = str.toLowerCase();
 System.out.println("String in lowercase: \"" + lowerCase + "\"");

 String upperCase = str.toUpperCase();
 System.out.println("String in uppercase: \"" + upperCase + "\"");

 String replaced = str.replace("World", "Java");
 System.out.println("String after replacement: \"" + replaced + "\"");

 String[] splitArray = str.split(", ");
 System.out.println("String split by \", \":");
 for (String s : splitArray) {
 System.out.println("\"" + s + "\"");
 }

 String trimmed = str.trim();
 System.out.println("String after trim: \"" + trimmed + "\"");

 boolean startsWith = str.startsWith(" He");
 System.out.println("String starts with \" He\": " + startsWith);

 boolean endsWith = str.endsWith("! ");
 System.out.println("String ends with \"! \": " + endsWith);

 boolean contains = str.contains("World");
 System.out.println("String contains \"World\": " + contains);

 String concat = str.concat(" Welcome!");
 System.out.println("String after concatenation: \"" + concat + "\"");
 }
}
