package Backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public static void combinationHelper(int[] nums, int start, int target, List<Integer> current, List<List<Integer>> output){
        
        if(target < 0) return;
        if(target==0){
            output.add(new ArrayList<>(current));
            return;
        }
        
        for(int i=start; i<nums.length; i++){
            current.add(nums[i]);
            combinationHelper(nums, i, target-nums[i], current, output);
            current.remove(current.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> output = new ArrayList<>();
         combinationHelper(candidates, 0,target,  new ArrayList<Integer>(), output);
        return output;
        
    }
}
