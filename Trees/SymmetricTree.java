package Trees;

/**
 * A tree is called symmetric if it is Mirror.
 * I.e a root.left == root.right and a root.right == root.left.
 */
public class SymmetricTree {

    private boolean isMirror(Node root1, Node root2){
        //If Both nodes are null, we will return true.
        if(root1==null && root2==null) return true;

        //If either of them is null, we will return false
        if(root1==null || root2==null) return false;

        if(root1.value != root2.value) return false;

        //Left and Right visiting
        boolean leftVisit = isMirror(root1.left, root2.right);
        
        //Right and Left visiting
        boolean rightVisit = isMirror(root1.right, root2.left);

        return leftVisit && rightVisit;

    }

    public Boolean isSymmetric(Node node){
        //Edge Case
        if(node==null) return true;

        //Only one node
        if(node.left==null && node.right==null) return true;

        return isMirror(node.left, node.right);
    }
    
}
