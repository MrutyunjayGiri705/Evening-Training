public class fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int n = 5;

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.println(x);
            int z = x + y;
            x = y;
            y = z;
        }
    }
}

