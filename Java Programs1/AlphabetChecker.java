public class AlphabetChecker 
{
    public static void main(String[] args) 
{
        char ch = 'A'; // Change this to the character you want to check
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
{
            System.out.println(ch + " is an alphabet.");
        } 
else 
{
            System.out.println(ch + " is not an alphabet.");
}
}
}