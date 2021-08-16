package MyCollectionFramework;

//import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        // ArrayList myList = new ArrayList();
        // myList.add("Anni");
        // myList.add(23);
        // System.out.println(myList);
        // ArrayList<String> myList2 = new ArrayList<>();
        // myList2.add("Annu");
        // myList2.add("Annnnnnuuu");
        // System.out.println(myList2);
        Pairs<String,Integer> P1 = new Pairs<>("Anni", 96);
        Pairs<Boolean, Double> P2 = new Pairs<>(true, 96.8);
        P1.getInfo();
        P2.getInfo();
    }
}