package MyCollectionFramework;

import java.util.*;
public class MyLinkedList {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
        // ll.add(23);
        // ll.add(123);
        // ll.add(3);
        //System.out.println(ll);
        timeDiff(ll);
        timeDiff(al);
    }
    static void timeDiff(List<Integer> list){
        long initTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            //list.add(i*i);
            list.add(0,i*i);
        }
        long finTime = System.currentTimeMillis();
        System.out.println(list.getClass().getName()+"-->"+(finTime-initTime));
    }
}