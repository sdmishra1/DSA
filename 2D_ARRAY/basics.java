import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][4];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
            
        // }
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int m=arr.length; // to evaluate total; number of rows
        int n=arr[0].length;//to evaluate total number of columns

        System.out.println(m);
        System.out.println(n);
        sc.close();


    }
    
}
