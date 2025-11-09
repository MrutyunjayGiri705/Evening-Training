public class harshad1 {
    public static void main(String[] args) {
        
    int digit=0,sum=0;
    int n=18;
    int temp=n;
    while (n!=0) {
        int r=n%10;
        //  digit++;
         sum=sum+r;
         if (temp%sum==0) {
            System.out.println("The number is harshad");
            break;
            
         }
         n=n/10;
         
        
    }

    
}
}