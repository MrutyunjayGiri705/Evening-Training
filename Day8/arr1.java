public class arr1 {
    public static void main(String[] args) {
        int n[]={10,20,30,40};
        int length=n.length;
         int large=n[0];
        
        for(int i=1;i<length;i++){
            if(n[ i ]> large){
               large=n[i];



         
            }
            
                 System.out.println(large);
        }
    }
    
}
