package MyCollectionFramework;

/* Sliding Window Maximum LEETCODE
You are given an array of integers nums,
there is a sliding window of size k which is moving from the very left of the array to the very right.
You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window. :
Example 1:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 
Example 2:
Input: nums = [1], k = 1
Output: [1]

Example 3:
Input: nums = [1,-1], k = 1
Output: [1,-1]

Example 4:
Input: nums = [9,11], k = 2
Output: [11]

Example 5:
Input: nums = [4,-2], k = 2
Output: [4]
*/
import java.util.Deque;
import java.util.*;
public class SlidingWindowMax {
    public static void main(String[] args) {
        Solution soln = new Solution();
        int a[] = {4,3,1,2,5,3,4,7,1,9},k=4;
        int ans[] = soln.maxSlidingWindow(a, k);
        for(int x: ans)
            System.out.print(x+" ");
    }
    static class Solution{
        public int[] maxSlidingWindow(int[] a, int k){
            int n = a.length;
            if(n<=1)
                return a;
            Deque<Integer> dq = new LinkedList<>();
            int ans[] = new int[n-k+1];
            int i=0;
            for(;i<k;i++){
                while(!dq.isEmpty() && a[dq.peekLast()]<=a[i])
                    dq.removeLast();
                dq.addLast(i);
            }
            for(;i<n;i++){
                ans[i-k] = a[dq.peekFirst()];
                while(!dq.isEmpty() && dq.peekFirst()<=i-k)
                    dq.removeFirst();
                while(!dq.isEmpty() && a[dq.peekLast()]<=a[i])
                    dq.removeLast();
                dq.addLast(i);
            }
            ans[i-k]=a[dq.peekFirst()];
            return ans;
        }
    }
}