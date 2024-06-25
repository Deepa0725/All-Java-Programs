public class OneDimenionalArrayExample
 {
    public static void main(String[] args) 
    {
    //Dclaration and creation
    int[] numbers=new int[5];
    
    //Initialization
    numbers[0]=1;
    numbers[1]=2;
    numbers[2]=3;
    numbers[3]=4;
    numbers[4]=5;

    //Access and modify elements
    System.out.println("First element:" + numbers[0]);
    numbers[2]=10;
    System.out.println("Modified thierd element:" + numbers[2]);

    //Loop through the array
    System.out.println("Array elements:");
    for (int i=0;i<numbers.length;i++)
    {
        System.out.print(numbers[i] + "");
    }
    
    }
}
