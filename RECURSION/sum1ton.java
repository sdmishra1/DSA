import java.util.Scanner;

public class sum1ton {
    // static int sum=0;
    public static void sum(int n,int x){
        if(n==0) {
            System.out.println(x);
            return ;
        }
        //int sum=0;
        sum(n-1,x+n);
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        //System.out.println("sum of n number is:"+sum(n,0));
        sum(n,0);
        sc.close();
    }
    
}
