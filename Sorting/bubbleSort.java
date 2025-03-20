public class bubbleSort {
    public static void print(int []arr){
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr={10,9,7,-2,-3};
        int n=arr.length;
        boolean flag=true;
        print(arr);
        //basic bubble sort or bubblesort1
        // for(int x=1;x<=n-1;x++){
        //     for(int i=0;i<n-1;i++){
        //         if(arr[i]>arr[i+1]){
        //             int temp=arr[i];
        //             arr[i]=arr[i+1];
        //             arr[i+1]=temp;
        //         }
        //     }
        // }

        //bubblesort2--more optimized as inside each passes we are decreasing the no of times the swapping takes place

        // for(int x=1;x<=n-1;x++){
        //     for(int i=0;i<n-1-x;i++){//in thuis line 
        //         if(arr[i]>arr[i+1]){
        //             int temp=arr[i];
        //             arr[i]=arr[i+1];
        //             arr[i+1]=temp;
        //         }
        //     }
        // }

        //optimized bubble sort--in this after each pass we check if an array is sorted or not .If then break..
        
        for(int x=1;x<=n-1;x++){
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        print(arr);
    }

    
}
