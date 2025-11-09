import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner mb = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = mb.nextInt();
        int temp = n;
        int count = 0;

        // Count the number of digits
        int t = n;
        while (t > 0) {
            count++;
            t /= 10;
        }

        int sum = 0;
        t = n;
        
        
        while (t > 0) {
            int digit = t % 10;
            int pro = 1;
            for (int i = 0; i < count; i++) {
                pro *= digit;
            }
            sum += pro;
            t /= 10;
        }

        if (sum == temp) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
