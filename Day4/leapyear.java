import java.util.Scanner;

public class leapyear {

public static void main(String[] args) {
    
    Scanner mb =new Scanner(System.in);
    int year;
    System.out.println("Enter the year");
    year=mb.nextInt();
    if ((year%4==0 )|| (year%4==0 && year%100!=0)) {
        System.out.println("This is a Leap year");
        
    }
    else
    System.out.println("This not a Leap year");

}

    
}
