
    public static void main(String[] args) {
        int n = 135; 
        int temp = n;
        int digits = 0;

        
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int[] arr = new int[digits];


        for (int i = digits - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        int sum = 0;
        for (int i = 0; i < digits; i++) {
            sum += Math.pow(arr[i], i + 1);
        }

        if (sum == n) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not a Disarium Number");
        }
    }

 
