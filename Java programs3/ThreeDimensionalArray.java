public class ThreeDimensionalArray 
{
     public static void main(String[] args) 
     {
    //Declaration and creation 
    int[][][] cube=new int[3][3][3];
    
    //Initialization
    cube[0][0][0] = 1; 
    cube[0][0][1] = 2; 
    cube[0][0][2] = 3; 
    cube[0][1][0] = 4;
    cube[0][1][1] = 5; 
    cube[0][1][2] = 6;
    cube[0][2][0] = 7;
    cube[0][2][1] = 8; 
    cube[0][2][2] = 9;
    
    //Access and modify elements 
    System.out.println("Element at (0,0,0):"+ cube[0][0][0]);
    cube[1][1][1] = 10;
    System.out.println("Modified element at (1,1,1): " + cube[1][1][1]);
    
    //Loop through the array 
    System.out.println("Cube elements:"); 
    for (int i = 0; i < cube.length; i++) 
    { 
        for (int j = 0; j < cube[i].length; j++) 
        {
             for (int k=0;k<cube[i][j].length; k++) 
             {
                 System.out.print(cube[i][j][k]+"");
             }
    System.out.println();
            }
            System.out.println();
        }
    }
}