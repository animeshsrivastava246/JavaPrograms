package MyCollectionFramework;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stck = new Stack<>();
        stck.push(5);
        stck.push(51);
        stck.push(15);
        System.out.println(stck.pop());
        System.out.println(stck.peek());
    }
}