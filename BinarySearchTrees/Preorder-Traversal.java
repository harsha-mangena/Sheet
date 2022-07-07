package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

class PreorderTraversal {
    

    public List<Integer> getPreorder(Node node){
        
        List<Integer> output = new ArrayList<Integer>();

        //Edge Case
        if(node==null)  return output;

        preOrderHelper(node, output);

        return output;

    }

    private void preOrderHelper(Node node, List<Integer> output) {

        if(node==null) return ;

        output.add(node.value);
        preOrderHelper(node.left, output);
        preOrderHelper(node.right, output);
    }
}
