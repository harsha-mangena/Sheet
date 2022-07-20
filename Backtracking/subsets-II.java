package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void SubSetHelper(int[] nums, int index, List<List<Integer>> output, List<Integer> current){
        output.add(new ArrayList<>(current));
        
        for(int i = index; i<nums.length; i++){
            if(i > index && nums[i] == nums[i-1]) continue;
            current.add(nums[i]);
            SubSetHelper(nums, i+1, output, current);
            current.remove(current.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums.length==0) return new ArrayList<>();
        
        Arrays.sort(nums);
        
        List<List<Integer>> output = new ArrayList<>();
        
        SubSetHelper(nums, 0, output, new ArrayList<Integer>());
        
        return output;
    }
}
