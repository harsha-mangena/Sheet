package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Traversal Order -> Left, Root, Right.
 */
class InorderTravsersal {
    
    /***
     * inOrder Traversal Using Stack.
     * @param node
     * @return
     */
    public List<Integer> inOrderTraversalUsingStack(Node node){

        List<Integer> result = new ArrayList<Integer>();

        //Edge Case
        if(node == null) return result;

        Stack<Node> s = new Stack<Node>();
        Node curr = node;

        while(!s.isEmpty() || curr!=null){
            //Reaching a node its left.
            while (curr != null) {
                //Pushing a node into the stack.
                s.push(curr);
                curr = curr.left;
            }
  
            // Current must be NULL at this point
            curr = s.pop();
  
            result.add(curr.value);
  
            //Now we have to visit its right sub tree.
            curr = curr.right;
        }
        return result;
    }

    public List<Integer> inOrderTraversalsUsingRecursion(Node node){
        List<Integer> result = new ArrayList<Integer>();

        //Edge case
        if(node==null) return result;

        inOrderHelper(node, result);

        return result;
    }

    private void inOrderHelper(Node node, List<Integer> result) {

        //Edge Case
        if(node==null) return;

        //Left sub tree
        inOrderHelper(node.left, result);

        //Adding into List
        result.add(node.value);

        //Right Sub Tree
        inOrderHelper(node.right, result);
    }
}
