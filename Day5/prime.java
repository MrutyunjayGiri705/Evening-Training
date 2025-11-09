import java.util.*;
public class prime {

public static void main(String[] args) {
  Scanner mb= new Scanner(System.in); 
    int n;
    System.out.println("enter the number");
    n=mb.nextInt();
    int flag=0;
    int i=1;
    while (i<=n) {
        if(i%n==0){
            flag=flag+1;
        System.out.println(i);
        }
        i=i+1;

        
    }
    if (flag==2) {
        System.out.println("The number is prime number");
        
    }
    else
    System.out.println("The number the not prime number");
}

    
}
// import java.util.*;

// public class Prime {
//     pu.out.println("Enter the number:");
//         int n = mb.nextInt();

//         System.out.println("Prime numbers from 1 to " + n + " are:");
//         for (int i = 2; i <= n; i++) {
//             boolean isPrime = true;

//             for (int j = 2; j <= i / 2; j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             if (isPrime) {
//                 System.out.println(i);
//             }
//         }
//     }
// }
// blic static void main(String[] args) {
//         Scanner mb = new Scanner(System.in);
//         System