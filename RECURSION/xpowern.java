import java.util.Scanner;
//time complexcity is    O(logn)  efficient......

public class xpowern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int x = sc.nextInt();

        System.out.println("enter the power:");
        int n = sc.nextInt();

        System.out.println("the " + x + " power of " + n + " is " + power2(x, n));
        sc.close();
    }

    // public static long power(int x,int n){
    // if(n==0)
    // return 1;
    // else
    // return x*power(x,n-1);

    // }

    public static long power2(int x, int n) {
        if (n == 0)
            return 1;
        long ans = power2(x, n / 2);
        if (n % 2 == 0)
            return ans * ans;
        else
            return x * ans * ans;

    }

}
