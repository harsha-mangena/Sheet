package Backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public static void combinationSumHelper(int start, int k, int target, List<Integer> current, List<List<Integer>> output){
        if(k==0 && target==0){
            output.add(new ArrayList<>(current));
            return ;
        }
        
        for(int i=start; i<=9; i++){
            current.add(i);
            combinationSumHelper(i+1, k-1, target-i, current, output);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> output = new ArrayList<>();
        combinationSumHelper(1, k, n, new ArrayList<Integer>(), output);
        return output;
        
    }
}
