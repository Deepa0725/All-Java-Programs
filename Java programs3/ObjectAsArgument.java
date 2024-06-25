class Person 
{
    String name;

    public Person(String name) 
    {
        this.name = name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
}

public class ObjectAsArgument 
{
    public static void main(String[] args) 
    {
        // Create a Person object
        Person person = new Person("Alice");
        
        // Call the method and pass the object as an argument
        changeName(person);

        // Print the updated name
        System.out.println("Name after method call: " + person.name);
    }

    // Method that modifies the object passed as an argument
    public static void changeName(Person p) 
    {
        p.setName("Bob");
    }
}