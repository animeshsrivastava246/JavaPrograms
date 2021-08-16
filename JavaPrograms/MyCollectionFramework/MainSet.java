package MyCollectionFramework;

//import java.util.HashSet;
///import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
/*import java.util.TreeSet;*/

public class MainSet {
    public static void main(String[] args) {/*
        //Set<String> fruits = new HashSet<>();
        ///Set<String> fruits = new LinkedHashSet<>();
        Set<String> fruits = new TreeSet<>();
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Banana");
        //System.out.println(fruits.add("Orange"));
        //System.out.println(fruits.add("Apple"));
        System.out.println(fruits);*/

         
        Set<Integer> x = new HashSet<>();
        x.add(5);
        x.add(51);
        x.add(15);
        Set<Integer> y = new HashSet<>();
        //y.add(50);
        //y.add(510);
        y.add(15);
        System.out.println(y.containsAll(x));
        //x.addAll(y);
        //System.out.println(x);
        //x.retainAll(y);
        //System.out.println(x);
    }
}