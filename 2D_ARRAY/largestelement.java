import java.util.Scanner;

public class largestelement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[][]=new int[4][2];
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                if(arr[i][j]>mx){
                    mx=arr[i][j];
                }
            }

        }
        System.out.println(mx);
        sc.close();
    }
    
}
