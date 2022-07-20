package Backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void combinationHelper(int n, int start, int k, List<Integer> current, List<List<Integer>> output){

        if(k==0){
            output.add(new ArrayList<>(current));
            return;
        }
        
        for(int i=start; i<=n; i++){

            current.add(i);
            combinationHelper(n, i+1, k-1, current, output);
            current.remove(current.size()-1);

        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> output = new ArrayList<>();
         combinationHelper(n, 1, k, new ArrayList<Integer>(), output);
        return output;
    }
}
