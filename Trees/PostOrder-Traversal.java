package Trees;

import java.util.ArrayList;
import java.util.List;

class postOrderTraversal {
    
    public List<Integer> postOrderTraversalUsingRecursionn(Node node){
        //Edge Case
        if(node==null) return new ArrayList<Integer>();

        List<Integer> result = new ArrayList<Integer>();

        postOrderHelper(node, result);

        return result;
    }

    private void postOrderHelper(Node node, List<Integer> result) {
        //Base Case
        if(node==null) return;

        //Left Sub Tree
        postOrderHelper(node.left, result);

        //Right Sub Tree
        postOrderHelper(node.right, result);

        //Adding to  List
        result.add(node.value);
    }
}
