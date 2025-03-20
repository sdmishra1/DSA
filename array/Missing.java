
// Time Complexity = O(n)
// Space Complexity = O(1)

import java.util.Scanner;

public class Missing{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();

        int[]arr=new int[n-1];
       

        int xorAll=0,xorArr = 0;

        for(int i=1;i<=n;i++){
            xorAll^=i;
        }
        System.out.println("enter the array elements:");

        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
            xorArr^=arr[i];
        }

       System.out.println("missing number is:"+(xorAll^xorArr));
//         // int arr[]={1,2,5,6,7,4};
//         // int n = arr.length;
//         // int Sum_of_n = ((n+1)*(n+2))/2;
//         // int sum=0;

//         // for(int i=0;i<n;i++){
//         //     sum+=arr[i];
//         // }

//         // int number = Sum_of_n-sum;

//         // System.out.println(number);
             sc.close();

     }
 }

//Time Complexcity =O(n)
//Space Complexcity = O(1)



