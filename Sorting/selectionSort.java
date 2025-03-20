
//this algorithm says select the lowest element present inside the array put it in its appropoiate position.
import java.util.Scanner;

public class selectionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements inside the array:");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter the elemnets of the array:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                //find out the minimum element
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j; 
                }
            }
            //swap the ith element with the mindx element
            swap(arr,i,mindx);
           
        }
        print(arr);
        sc.close();
    }

}
