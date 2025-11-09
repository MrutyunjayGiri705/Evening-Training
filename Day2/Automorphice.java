public class Automorphice {
    public static void main(String[] args) {
        int n=25;
        int temp=n;
        int a=n*n;
        while (temp!=0) {
            int d=temp%10;
            int c=a%10;
            if (c==d) {
                System.out.println("The number is automorphic");


                
            }
            temp=temp/10;
            a=a/10;
            
        }




    }}

        

