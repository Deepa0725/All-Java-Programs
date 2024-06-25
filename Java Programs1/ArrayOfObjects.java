class Student 
{
    
    private String name;
    private int id;
    
    public Student(String name, int id) {
    this.name = name;
    this.id = id;
    }
    
    public void displayInfo() {
    System.out.println("Name: " + name + ", ID: " + id);
    }
    }
    
    public class ArrayOfObjects 
    {
    public static void main(String[] args) 
    {
    Student[] students = new Student[3];
    
    students[0] = new Student("Alice", 123);
    students[1] = new Student("Bob", 456);
    students[2] = new Student("Charlie", 789);
    
    for (int i = 0; i < students.length; i++) 
    {
    System.out.println("Student " + (i + 1));
    students[i].displayInfo();
    }
    }
    }
