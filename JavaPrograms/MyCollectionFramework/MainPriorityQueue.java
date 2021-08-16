package MyCollectionFramework;

import java.util.PriorityQueue;
public class MainPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<String> pq = new PriorityQueue<>();
        // pq.add("Lemon");
        // pq.add("Banana");
        // pq.add("Orange");
        // pq.add("Apple");
        // System.out.println(pq);
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        // System.out.println(pq.remove());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(5);
        pq.add(27);
        pq.add(2);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
    }
}
