import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        System.out.println("sum of "+n+" is "+ sum(n));
        sc.close();
    }

    public static long sum(int n){
        if(n==1)
        return 1;
        else
        return n+sum(n-1);

    }
    
}
    
