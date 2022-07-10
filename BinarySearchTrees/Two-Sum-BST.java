package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

class TwoSumBST {

    private void inOrderHelper(Node node, List<Integer> values){
        if(node == null) return ;

        inOrderHelper(node.left, values);
        values.add(node.value);
        inOrderHelper(node.right, values);
    }

    public boolean isTwoSum(Node node, int target){
        if(node==null) return false;

        List<Integer> values = new ArrayList<Integer>();
        inOrderHelper(node, values);

        return twoSum(values, target);
    }

    private boolean twoSum(List<Integer> values, int target) {
        int i=0, j=values.size()-1;

        while(i<j){

            if(values.get(i)+values.get(j) == target) return true;

            if(values.get(i)+values.get(j) < target) i += 1;

            else if(values.get(i)+values.get(j) > target) j -= 1;

        }
        return false;
    }
    
}

