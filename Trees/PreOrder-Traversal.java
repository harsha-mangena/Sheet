package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Traversal Order -> node, Left, Right.
 */

class preOrderTraversal {


    public List<Integer> preOrderUsingStack(Node node){

        //Edge Case
        if (node == null) {
            return new ArrayList<Integer>();
        }

        Stack<Node> S = new Stack<>();

        List<Integer> result = new ArrayList<Integer>();
  
        S.add(node);
  
        result.add(node.value);
  
        // Right Sub Tree
        if (node.right != null) {
            S.add(node.right);
        }
        // Left Sub Tree
        if (node.left != null) {
            S.add(node.left);
        }
        // Iterate till Size of the Stack not equal to 1
        while (S.size() != 1) {
            // Peek element of the stack
            Node temp = S.peek();
            // pop the element from the stack
            S.pop();
  
            if (temp != null) {
                // print the pop element
                result.add(node.value);
  
                // Right Sub Tree
                if (temp.right != null) {
                    S.add(temp.right);
                }
                // Left Sub Tree
                if (temp.left != null) {
                    S.add(temp.left);
                }
            }
        }
        return result;
    }

    /**
     * inOrder Traversal Using Recursion
     * @param node
     * @return
     */
    public List<Integer> preOrderTraversalsUsingRecursion(Node node){
        List<Integer> result = new ArrayList<Integer>();

        //Edge case
        if(node==null) return result;

        preOrderHelper(node, result);

        return result;
    }

    private void preOrderHelper(Node node, List<Integer> result) {

        //Edge Case
        if(node==null) return;

        //Adding into List
        result.add(node.value);

        //Left sub tree
        preOrderHelper(node.left, result);

        //Right Sub Tree
        preOrderHelper(node.right, result);
    }
    
}
