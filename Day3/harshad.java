import java.util.Scanner;

public class harshad {
    public static void main(String[] args) {
        Scanner mb=new Scanner(System.in);
        int n,temp,sum=0;
        System.out.println("Enter the number is:");
        n=mb.nextInt();
        temp=n;
        while (temp>0) {
            int rem=temp%10;
            temp/=10;
            sum=sum+rem;
            
        }
        if (n%sum==0) {
            System.out.println("The number is Harshad Number");
            
        }
        else
          System.out.println("The number is not Harshad Number");
    }
    
}
