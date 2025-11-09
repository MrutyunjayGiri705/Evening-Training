
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        

        Scanner mb = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        int P = mb.nextInt();

        System.out.print("Enter Rate of Interest (R): ");
        int R = mb.nextInt();

        System.out.print("Enter Time (T): ");
        int T = mb.nextInt();

        double CI = P * (Math.pow((1 + R / 100.0), T)) - P;

        System.out.println("Compound Interest is: " + CI);
    }
}



