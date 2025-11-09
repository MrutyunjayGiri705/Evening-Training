import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner mb = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = mb.nextInt();
        int temp = n;
        int reverse = 0;

        while (n > 0) {
            int d = n % 10;
            reverse = reverse * 10 + d;
            n = n / 10;
        }

        if (temp == reverse) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
