import java.util.Scanner;

public class bubbledesc {
    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
       
        System.out.println("enter the no of elements of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        boolean flag=true;

        for(int x=0;x<=n-1;x++){
            for(int i=0;i<n-1-x;i++){
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        print(arr);
        sc.close();
    }
    
}
