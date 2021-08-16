package MyCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class MyQ {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(24);
        q.add(132);
        q.add(122);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.element());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.poll());
    }
}
