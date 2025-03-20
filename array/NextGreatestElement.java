import java.util.Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int arr[]={12,8,41,37,2,49,28,16,21};
        int n=arr.length;
        int c[]=new int[n];
        

        // for(int i=0;i<n;i++){
        //     c[i]=-1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             c[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
                 //brute force approach
        // for(int i=0;i<n;i++){
        //     int mx=Integer.MIN_VALUE;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>mx){
        //             mx=arr[j];
        //         }
        //     }
        //     c[i]=mx;
        //     c[n-1]=-1;
        
        // }


          //optimized method
          int NGE=arr[n-1];
          
          for(int i=n-1;i>=0;i--){
            c[i]=NGE;
            NGE=Math.max(NGE, arr[i]);
          }
          c[n-1]=-1;
        System.out.println(Arrays.toString(c));
    }
    
}
