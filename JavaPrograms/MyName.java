import java.util.Scanner;

public class MyName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Hello "+s+", how are you??");
        sc.close();
    }
}