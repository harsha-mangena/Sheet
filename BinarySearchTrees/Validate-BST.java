package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

class ValidateBST {

    /***
     * Method for getting values from BST.
     * @param node
     * @param values
     */
    private void getValues(Node node, List<Integer> values){
        if(node==null) return;

        getValues(node.left, values);
        values.add(node.value);
        getValues(node.right, values);
    }

    /***
     * Method for checking all the values in BST.
     * @param node
     * @return
     */
    public boolean isValidBST(Node node){

        if(node==null) return true;
        
        List<Integer> values = new ArrayList<>();
        getValues(node, values);

        // for(int i=1; i<values.size(); i++){
        //     if(values.get(i-1) >= values.get(i)){
        //         return false;
        //     }
        // }
        // return true;

        return isValidHelper(node, Long.MIN_VALUE, Long.MIN_VALUE);
    }

    /***
     * Method for Valid BST Helper
     * @param node
     * @param minValue
     * @param maxValue
     * @return
     */

    private boolean isValidHelper(Node node, long minValue, long maxValue){
        if(node==null) return true;

        if(minValue >= node.value || node.value >= maxValue) return false;
        
        boolean leftTree = isValidHelper(node.left, minValue, node.value);
        boolean rightTree = isValidHelper(node.right, node.value, maxValue);

        return leftTree && rightTree;
    }
}
