import java.util.*;
public class M{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     while(n>0){
        int count = 0;
        int target=sc.nextInt();
        for(int i=1;i<=99;i++){
            for(int j=1;j<=99;j++){
                if((i+j)==target){
                    count++;
                }
            }
        }
        System.out.println(count);
        n--;
     }
    }
}
