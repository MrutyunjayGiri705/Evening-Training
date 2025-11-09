public class Automorphicerange {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int n = i;
            int temp = n;
            int a = n * n;
            boolean isAutomorphic = true;

            while (temp != 0) {
                int d = temp % 10;
                int c = a % 10;

                if (c != d) {
                    isAutomorphic = false;
                    break;
                }

                temp = temp / 10;
                a = a / 10;
            }

            if (isAutomorphic) {
                System.out.println(i + " is automorphic");
            }
        }
    }
}
