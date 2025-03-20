public class pip {
    public static void pipi(int n){
        if(n==0) return;
        System.out.println(n);
        pipi(n-1);
        System.out.println(n);
        pipi(n-1);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        pipi(1 );
    }
    
}
