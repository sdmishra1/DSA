import java.util.Arrays;

public class sortNoOfZeroesANDOnes {
    public static void main(String[] args) {
        //time complexcity = O(n)
        //Space complexcity =O(1)

        //using two pass method
        int []arr={1,0,1,0,1,1,1,0,0,0,0,1};
        int n=arr.length;

        // int NoOfZeroes=0,NoofOnes=0;

        // for(int i=0;i<n;i++){
        //     if(arr[i]==0) NoOfZeroes++;
        //     else NoofOnes++;
        // }

        // for(int i=0;i<NoOfZeroes;i++){
        //     arr[i]=0;
        // }
        // for(int i=NoOfZeroes;i<n;i++){
        //     arr[i]=1;
        // }
        // System.out.println(Arrays.toString(arr));


        //using single pass method

        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0)i++;
            if(arr[j]==1)j--;
            if(arr[i]==1 &&arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
    
}
