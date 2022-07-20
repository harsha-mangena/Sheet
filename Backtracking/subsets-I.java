package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Explanation:
------------
*) In general we can create a subset  by either taking the element or not
            For Example : arr = [1,2], subsets of arr = [], [1], [2], [1,2], except subset [1,2] for all other subsets we are either including the element
                          or not.
         *) So we will back-track for each element after including in the currentSet by removing it later.
            Like -> Recursion for Including
                        currentSet.add(arr[i])
                        function(i+1, currentSet)
                 -> Back-tracking for Not-Including
                        currentSet.remove(arr[i])
                        function(i+1, currentSet)
 */

class Solution {
    public static void subSetHelper(int[] nums, int index, int n, List<Integer> currentSubSet, List<List<Integer>> output){
        if(index== n){
            output.add(new ArrayList<>(currentSubSet));
            return;
        }
        
        //Including
        currentSubSet.add(nums[index]);
        subSetHelper(nums, index+1, n, currentSubSet, output);
        
        //Not Including
        currentSubSet.remove(currentSubSet.size()-1);
        subSetHelper(nums, index+1, n, currentSubSet, output);
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        //Edge Case
        if(nums.length==0){
            return new ArrayList<>();
        }
        
        List<List<Integer>> output = new ArrayList<>();
        subSetHelper(nums, 0, nums.length, new ArrayList<Integer>(), output);
        return output;
    }
}