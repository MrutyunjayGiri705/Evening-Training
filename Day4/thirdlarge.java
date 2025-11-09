
public class thirdlarge {
    public static void main(String[] args) {
        int arr[]={10,20,30,60,40,60,60}; 
        int length=arr.length;
        int large=-1;
        int secondlarge=-1;
        int thirdlargenumber=-1;
        for(int i=0;i<length;i++) {
            if(arr[i]>large){
                thirdlargenumber=secondlarge;
                secondlarge=large;
                large=arr[i];
            }
            else if(arr[i]> secondlarge && arr[i]!=thirdlargenumber){
                thirdlargenumber=secondlarge;
                secondlarge=arr[i];
            }
            else if(arr[i]>thirdlargenumber && arr[i]!=large){
                thirdlargenumber=arr[i];
            }
        
  
    }
    System.out.println(thirdlargenumber);
    
}
}
