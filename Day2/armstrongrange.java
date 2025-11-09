public class armstrongrange {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            int sum = 0;
            int digit = 0;
            int m = i;

        
            while (m != 0) {
                m = m / 10;
                digit++;
            }

            m = i;
            while (m != 0) {
                int r = m % 10;
                int power = 1;

            
                for (int j = 0; j < digit; j++) {
                    power *= r;
                }

                sum += power;
                m = m / 10; 
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
