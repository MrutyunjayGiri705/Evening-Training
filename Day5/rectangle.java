
import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        Scanner mb=new Scanner(System.in);
        int length,width,perimeter;
        length=mb.nextInt();
        System.out.println("Enter the length:"+length);
        width=mb.nextInt();
        System.out.println("Enter the width:"+width);
        perimeter=2*(length+width);
        System.out.println("The perimeter is:"+perimeter);

    }
    
}


