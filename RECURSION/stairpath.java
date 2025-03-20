import java.util.Scanner;

public class stairpath {

    // public static int stair(int n){
    // if(n==1||n==2)
    // return n;
    // else
    // return stair(n-1)+stair(n-2);

    // }
    // public static void main(String[] args) {
    // Scanner sc =new Scanner(System.in);
    // System.out.println("enter the no of stairs:");
    // int n=sc.nextInt();
    // System.out.println(stair(n));
    // sc.close();
    // }

    public static int stair(int n) {
        if (n == 0)
            return 1;
        else if (n < 0)
            return 0;
        else
            return stair(n - 1) + stair(n - 3);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of stairs:");
        int n = sc.nextInt();
        System.out.println(stair(n));
        sc.close();
    }

}
