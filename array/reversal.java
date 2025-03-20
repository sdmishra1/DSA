public class reversal {
    public static void main(String[] args) {
        int arr[]={1,2,5,8,9,0};
        int n=arr.length;

        // for(int i=0;i<n/2;i++){
        //     int temp= arr[i];
        //     arr[i] = arr[n-i-1];
        //     arr[n-i-1] = temp;
        // }

        int i=1,j=4;
        while(i<=j){
           swap(arr,i,j);
                       i++;
                       j--;
                   }
           
                   System.out.println("reversal is:");
                   for(int k=0;k<n;k++){
                       System.out.print(arr[k]+" ");
                   }
               }
           
               public static void swap(int[] arr, int i, int j) {
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                   
               }
    
}

//Time Complexcity = O(n)
//Space Complexcity = O(1)
