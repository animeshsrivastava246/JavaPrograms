package OOPs;

public class Methods {
    public static int greatest(int num1,int num2,int num3) {
        return num1>num2 ? num1>num3?num1:num3 : num2>num3?num2:num3 ;
    }
    public static void main(String args[]) {
        int x = greatest(5,6,7);
        System.out.println(x);
        greet();
    }
    public static void greet(){
        System.out.println("Hello sire!");
    }
}