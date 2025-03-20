import java.util.Arrays;

public class sortNoOfZeroesoneandTwo {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,2,1,0,0,1,2};
        int n=arr.length;

         //triple pass method

    //     int z=0,o=0,t=0;

    //     for(int i=0;i<n;i++){
    //         if(arr[i]==0) z++;
    //         else if(arr[i]==1) o++;
    //         else t++;
    //     }

    //     for(int i=0;i<z;i++){
    //         arr[i]=0;
    //     }

        
    //     for(int i=z;i<o+z;i++){
    //         arr[i]=1;
    //     }
    //     for(int i=o+z;i<n;i++){
    //         arr[i]=2;
    //     }

    //    System.out.println(Arrays.toString(arr));

        //single pass method

        int low=0,mid=0,high=n-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }


        }
        System.out.println(Arrays.toString(arr));

    }
    
}
