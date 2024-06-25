public class AnonymousClassDemo 
{
    interface Greeting
    {
        void greet();
    }
    public static void main(String[] args) 
    {
        Greeting greetingInstance=new Greeting() {
            @Override
            public void greet()
            {
            System.out.println("Hello World!");
        }
    };

    greetingInstance.greet();
}
}
