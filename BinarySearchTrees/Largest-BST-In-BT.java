package BinarySearchTrees;


/**
 * Solution from Striver SDE Sheet.
 */
class NodeValue {
    public int maxNode, minNode, maxSize;
    
    NodeValue(int minNode, int maxNode, int maxSize) {
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.maxSize = maxSize;
    }
};
class Solution {
    private NodeValue largestBSTSubtreeHelper(Node root) {
        // An empty tree is a BST of size 0.
        if (root == null) {
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        
        // Get values from left and right subtree of current tree.
        NodeValue left = largestBSTSubtreeHelper(root.left);
        NodeValue right = largestBSTSubtreeHelper(root.right);
        
        // Current node is greater than max in left AND smaller than min in right, it is a BST.
        if (left.maxNode < root.value && root.value < right.minNode) {
            // It is a BST.
            return new NodeValue(Math.min(root.value, left.minNode), Math.max(root.value, right.maxNode), 
                                left.maxSize + right.maxSize + 1);
        }
        
        // Otherwise, return [-inf, inf] so that parent can't be valid BST
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 
                            Math.max(left.maxSize, right.maxSize));
    }
    
    public int largestBSTSubtree(Node root) {
        return largestBSTSubtreeHelper(root).maxSize;
    }
}