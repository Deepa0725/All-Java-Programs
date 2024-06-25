public class Parameter {
    //Parameterized method
    public void displayMessage(String message)
    {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Parameter example=new Parameter();
        example.displayMessage("Hello,This is a parameterized method"); //calling the parameterized method
    }
}
