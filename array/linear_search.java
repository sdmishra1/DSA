import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n =sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter the targeted element:");
        int target = sc.nextInt();
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                flag=true;
                break;
            }
        }

        if(flag==true)
            System.out.println("found");
        else
            System.out.println("not found");


    sc.close();



    }   
}
