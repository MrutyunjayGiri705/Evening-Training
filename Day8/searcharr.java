package Day8;
class searcharr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,10,4,40,4};
        int key=4;
        int flage=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                
                // flage=flage+1;
                count=count+1;

                // break;
            }
            
        }
        System.out.println("My key value is[3]time apper:"+count);
        // }
        // if(flage==1)
        // System.out.println("number is found");
        // else
        // System.out.println("number is not found");
    }
    // The program is search and count in array
    
}
