import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        System.out.println("factorial of "+n+" is "+ fact(n));
        sc.close();
    }

    public static long fact(int n){
        if(n==0)
        return 1;
        else
        return n*fact(n-1);

    }
    
}
