import java.util.Arrays;

public class rotate_an_array {

    //time complexcity O(n)
    //Space complexcity O(1)
    public static void reverse(int []arr,int i,int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

        public static void rotate(int []arr,int k){
            int n=arr.length;
            k=k%n;
            reverse(arr,0,n-k-1);
            reverse(arr,n-k,n-1);
            reverse(arr,0,n-1);

            System.out.println(Arrays.toString(arr));

        }

    
    public static void main(String[] args) {

        //Time complexcity O(n)
        //space complexcity O(n)
        int[]arr = {1,2,3,4,5,6,7};
        
        rotate(arr,3);
        //ifk>n
    //     int []rotated = new int[n];

    //     int j =0;
    //     for(int i=n-k;i<n;i++){
    //         rotated[j++] = arr[i];
            
    //     }

    //     for(int i=0;i<n-k;i++){
    //         rotated[j++]=arr[i];
    //     }

    //    for(int i=0;i<n;i++){
    //     arr[i]=rotated[i];
    //    }
    //    System.out.println(Arrays.toString(arr));
    }
    
}
