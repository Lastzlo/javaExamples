package tasks.leetcode.findingPairsWithACertainSum;

import java.util.HashMap;

/**
 * FindSumPairs2 use HashMap
 *
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */

/*Intuitive
    Please note that nums1.length <= 1000 and nums2.length <= 10^5 and count function can be called at most 1000 times. So if we do 1 loop to traverse elements in nums1 then we can pass this problem.
    In constructor, we use HashMap to count frequencies of elements in nums2 array.
    In count method, we traverse each element a in nums1 and check if we found b where a + b = tot => b = tot - a
    This problem is similar to: 1. Two Sum

Complexity
    Time:
    Constructor: O(nums2.length)
    Add: O(1)
    Count: O(nums1.length)
    Space: O(nums2.length)*/
public class FindSumPairs2 {
    private int[] nums1;
    private int[] nums2;

    private HashMap<Integer, Integer> freq = new HashMap<>();

    public FindSumPairs2(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        //First, indexing nums2 in Map
        for (int number : nums2) {
            increaseFreq(number, 1);
        }
    }

    private void increaseFreq(int key, int inc) {
        // freq.getOrDefault(key, 0) that returns 0 if doesn't found key in Map,
        // else it returns value to which the key
        freq.put(key, freq.getOrDefault(key, 0) + inc);
    }

    public void add(int index, int val) {
        increaseFreq(nums2[index], -1); // Remove old one
        nums2[index] += val;
        increaseFreq(nums2[index], 1);  // Count new one
    }

    public int count(int tot) {
        int count = 0;

        for (int a : nums1) {
            count += freq.getOrDefault((tot - a), 0); // a + b = tot -> b = tot - a
        }

        return count;
    }


}