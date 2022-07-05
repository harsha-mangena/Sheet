package Trees;


/**
 * Check if the given BT's are same or not.
 */
public class SameTree {
    
    public boolean isSame(Node root1, Node root2){
        //Cases
        //If both are null we return true
        if(root1==null && root2==null) return true;

        //If one is null && another is not, then both are not same right.
        if(root1==null || root2==null) return false;

        //If both values are not equal then they are not same tree's.
        if(root1.value != root2.value) return false;

        //Call for Left SubTree
        boolean forLeft = isSame(root1.left, root2.left);

        //call for right SubTree
        boolean forRight = isSame(root1.right, root2.right);

        return forLeft && forRight;
    }
}
