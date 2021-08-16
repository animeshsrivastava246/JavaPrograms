//package Recursions;
public class GameTheory {
    public static void main(String[] args) {
        int x[] = {1,5,7,3,2,4};
        System.out.println(coinMax(x, 0, x.length-1));
    }
    static int coinMax(int a[], int start, int end){
        if(start+1 == end) return Math.max(a[start], a[end]);
        return Math.max(a[start]+Math.min(coinMax(a,start+2,end) ,coinMax(a,start+1,end-1)),a[end]+Math.min(coinMax(a,start+1,end-1), coinMax(a, start, end-2)));
    }
}