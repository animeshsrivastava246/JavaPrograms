package MyCollectionFramework;

import java.util.ArrayDeque;
public class MainArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(7);
        ad.add(9);
        ad.add(91);
        ad.addFirst(19);
        ad.addLast(10);
        ad.removeFirst();
        System.out.println(ad);
    }
}
