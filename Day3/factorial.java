import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        

Scanner mb=new Scanner(System.in);

int n=mb.nextInt();
 int fact = 1;
        int i = 1;

        while (i <= n) {
            fact = fact * i;
            i = i + 1;
        }



System.out.println("The factorial number is "+ fact);
    }

}
    

