
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[][]=new int[4][2];
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        //System.out.println(Arrays.toString(arr));

        for (int[] is : arr) {
            for (int x : is) {
                System.out.print(x+" ");
                
            }
            System.out.println();

            sc.close();
            
            
        }
        

    }
    
}
