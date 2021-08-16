//package Recursions;
import java.util.Scanner;
public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(JosP(n,k));
        sc.close();
    }
    static int JosP(int n,int k){
        if(n==1)return 0;
        return (JosP(n-1,k)+k)%n;
        //[ JosP(n,k) = (JosP(n-1,k)+k)%n ]
    }
}
/*
JosP(5,3)   ↑3
    ↓   ↑3
(JosP(4,3)+3)%5
    ↓   ↑0
(JosP(3,3)+3)%4
    ↓   ↑1
(JosP(2,3)+3)%3
    ↓   ↑1
(JosP(1,3)+3)%2
    ↓   ↑
    0   0   */