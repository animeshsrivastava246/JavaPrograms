//package Recursions;
import java.util.Scanner;
public class PowersetString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        Powerset("abc");
    }
    static void PowerSet(String s, int i, String cur){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        PowerSet(s, i+1, cur+s.charAt(i));
        PowerSet(s, i+1, cur);
    }
    static void Powerset(String s){
        PowerSet(s, 0, "");
    }
}