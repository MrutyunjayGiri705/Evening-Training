package Day8;

public class arrrever1 {

	public static void main(String[] args) {
		
		        int arr[]={50,40,30,40,50};
		        int i=0,j;
		        int length=arr.length;
		        j=length-1;
		        int temp;
		        while (i<j) {
		         temp= arr[j];
		         arr[i]=arr[j];
		         arr[i]=temp;
		         i++;
		         j--;

		            
		        }
		        for(int k=0;k<length;k++)
		        System.out.println(arr[k]);
		    }
		    
		}

	
		// TODO Auto-generated method stub


