import java.util.Scanner;

public class hcf {

    public static int hcfCalc(int a,int b){
        if(b%a==0) return a;
        return hcfCalc(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(hcfCalc(a,b));
        sc.close();

    }
    
}
