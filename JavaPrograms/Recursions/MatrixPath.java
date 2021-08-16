//package Recursions;
import java.util.Scanner;
public class MatrixPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(count(n, m));
        sc.close();
    }
    static int count(int n, int m){
        if(n==1||m==1) return 1;
        return count(n-1,m)+count(n,m-1);
    }    
}
