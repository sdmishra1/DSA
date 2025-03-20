import java.util.Scanner;

public class powern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the power:");
        int n=sc.nextInt();
        System.out.println("the 2 power of "+n+" is "+power(n));
        sc.close();
    }

    public static long power(int n){
        if(n==1)
        return 2;
        else
        return 2*power(n-1);

    }
    
}
