//package Recursions;
import java.util.HashSet;
import java.util.Set;

public class Permutations {
    static Set<String> set = new HashSet<>();
        public static void main(String[] args) {
        permutation("abcc", 0);
        //permutation("abcc", 0, 3);
    }    
    static void permutation(String s, int start){
        if(start==s.length()-1){
            if(set.contains(s)) return;
            set.add(s);
            System.out.print(s+" ");
            return;
        }
        for (int i = start; i <= s.length()-1; i++) {
            s = interchangeChar(s, start, i);
            permutation(s, start+1);
            s = interchangeChar(s, start, i);
        }
    }
    // static void permutation(String s, int start, int end){
    //     if(start==end){
    //         if(set.contains(s)) return;
    //         set.add(s);
    //         System.out.print(s+" ");
    //         return;
    //     }
    //     for (int i = start; i <= end; i++) {
    //         s = interchangeChar(s, start, i);
    //         permutation(s, start+1, end);
    //         s = interchangeChar(s, start, i);
    //     }
    // }
    static String interchangeChar(String str, int a, int b){
        char arr[] = str.toCharArray();
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return String.valueOf(arr);
    }
}
