
import java.util.Scanner;
public class First_Col_And_Last_Col_Print{



    public static void main(String[] args) {

        int row,col,n;
        
        Scanner mb=new Scanner(System.in);
     
       
          System.out.println("Enter the row:");
           row=mb.nextInt();
           System.out.println("Enter the col:");
           col=mb.nextInt();
           int array[][]=new int[row][col];
               
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
               array[i][j]=mb.nextInt();
            }
        
        }
            
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j==0 || j==array.length-1) {
                    System.out.print(array[i][j] + " ");

                    
                }
                else{
                    System.out.println(""+"x");
                }   
                
            }
            System.out.println();
    }
}


}
