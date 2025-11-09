package Day8;
public class array {
    public static void main(String[] args) {
        int n []={10,20,30,40};
        int sum=0;
        int length=n.length;
        for(int i=length-1;i>=0;i--){
            // System.out.println(n[i]);
            sum=sum+n[i];
        }
        System.out.println(sum);
    }
    
}
