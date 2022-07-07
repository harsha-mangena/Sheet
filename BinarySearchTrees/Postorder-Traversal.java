package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

class PostorderTraversal {


    public List<Integer> getPreorder(Node node){
        
        List<Integer> output = new ArrayList<Integer>();

        //Edge Case
        if(node==null)  return output;

        postOrderHelper(node, output);

        return output;

    }

    private void postOrderHelper(Node node, List<Integer> output) {

        if(node==null) return ;

        postOrderHelper(node.left, output);
        postOrderHelper(node.right, output);
        output.add(node.value);
    }
    
}
