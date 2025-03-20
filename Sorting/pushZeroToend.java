public class pushZeroToend{
    public static void print(int[] arr){
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {   //leetcode 283
        int[] arr={0,1,0,3,12};
        int n=arr.length;
        boolean flag=true;
        print(arr);
        
        for(int x=0;x<n-1;x++){
            for(int i=0;i<n-1-x;i++){
                if(arr[i]==0){
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