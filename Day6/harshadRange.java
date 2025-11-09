public class harshadRange {

    public static void main(String[] args) {

        int digit = 0, sum = 0;
        int n;
        
        for (int i = 1; i <= 100; i++) {
            n = i;
            int temp = n;
            sum = 0;

            while (n != 0) {
                int r = n % 10;
                sum = sum + r;
                n = n / 10;
            }

            if (temp % sum == 0) {
                System.out.println(temp + " is a Harshad number");
            }
        }

    }
}
