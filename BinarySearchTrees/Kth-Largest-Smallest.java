package BinarySearchTrees;

class KthLargestSmallest {

    /***
     * Helper Method for Traversal, Visiting Nodes Right, Node, Left
     * @param node
     * @param[] k
     * @return
     */

    private Node KthLargestHelper(Node node, int[] k){
        if(node==null) return null;

        Node rightTree = KthLargestHelper(node.right, k);

        if(rightTree!=null) return rightTree;

        k[0] -= 1;

        if(k[0]==0) return node;

        Node leftTree = KthLargestHelper(node.left, k);

        return leftTree;
    }

    /***
     * Method for K-th Largest Value in Tree.
     * @param node
     * @param k
     * @return
     */

    public int KthLargestValue(Node node, int k){

        Node output = KthLargestHelper(node, new int[]{k});
        return output.value;
    }

    /***
     * Helper Method for Traversal, Visiting Nodes Left, Node, Right.
     * @param node
     * @param k
     * @return
     */

    private Node KthSmallestHelper(Node node, int[] k){
        if(node == null) return node;

        Node leftTree = KthSmallestHelper(node.left, k);
        if(leftTree!=null) return leftTree;

        k[0] -= 1;
        
        if(k[0] == 0) return node;

        Node rigthTree = KthSmallestHelper(node.right, k);

        return rigthTree;

    }

    /**
     * Method for K-th Largest Value in Tree.
     * @param node
     * @param k
     * @return
     */

    public int KthSmallestValue(Node node, int k){
        Node output = KthSmallestHelper(node, new int[]{k});
        return output.value;
    }
    
}
