package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

class InorderTraversal {
    
    public List<Integer> getInorder(Node node){
        
        List<Integer> output = new ArrayList<Integer>();

        //Edge Case
        if(node==null)  return output;

        inOrderHelper(node, output);

        return output;

    }

    private void inOrderHelper(Node node, List<Integer> output) {

        if(node==null) return ;

        inOrderHelper(node.left, output);
        output.add(node.value);
        inOrderHelper(node.right, output);
    }
}
