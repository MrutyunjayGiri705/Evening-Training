package Day8;
public class ThirdLargest {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 60, 40, 60, 60};
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int thirdLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

           
            if (current == large || current == secondLarge || current == thirdLarge) {
                continue;
            }

            if (current > large) {
                thirdLarge = secondLarge;
                secondLarge = large;
                large = current;
            } else if (current > secondLarge) {
                thirdLarge = secondLarge;
                secondLarge = current;
            } else if (current > thirdLarge) {
                thirdLarge = current;
            }
        }

        if (thirdLarge == Integer.MIN_VALUE) {
            System.out.println("Less than 3 distinct elements.");
        } else {
            System.out.println("Third largest distinct number: " + thirdLarge);
        }
    }
}