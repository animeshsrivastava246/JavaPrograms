package MyCollectionFramework;

import java.util.HashSet;
import java.util.Set;

//Given an array,find if there exist a subarray with sum=k , n<10^5
public class ZeroSumSubarray {
    public static void main(String[] args) {
        int a[] = {2,1,-3,4,2};
        int k = 0;
        boolean found = false;
        /*Brute Force[O(n^2)]
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if(sum==k){
                    found = true;
                    break;
                }
            }
            if(found) break;
        }*/

        //[O(n)]
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int element : a) {
            set.add(sum);
            sum += element;
            if(set.contains(sum-k)){
                found = true;
                break;
            }
        }
        System.out.println("Found: "+found);
    }
}