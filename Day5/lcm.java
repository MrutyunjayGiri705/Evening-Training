public class lcm {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max;
        int lcm;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        while (true) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max++;
        }

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}

