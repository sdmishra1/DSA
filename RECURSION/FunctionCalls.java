public class FunctionCalls {
    public static void mango(){
        System.out.println("hi, I am inside mango");
    }
    public static void banana(){
        mango();
        System.out.println("hi,I am in banana");
        
    } 
    public static void apple(){
        banana();
        System.out.println("hi,I am in apple");
        mango();
    }
    public static void main(String[] args) {
        System.out.println("hi,I am in main method");
        apple();
    }

    
    
}
