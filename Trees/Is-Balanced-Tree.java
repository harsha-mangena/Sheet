package Trees;

class BalancedTree{

    private int getHeight(Node node){
        if(node==null) return 0;

        int leftH = getHeight(node.left);
        int rightH = getHeight(node.right);

        return Math.max(leftH, rightH)+1;
    }

    public boolean isBalancedTree(Node node){
        if(node==null) return true;

        int leftSideHeight = getHeight(node.left);
        int rightSideHeight = getHeight(node.right);

        if(Math.abs(leftSideHeight-rightSideHeight) > 1) return false;

        boolean leftTree = isBalancedTree(node.left);
        boolean rightTree = isBalancedTree(node.right);

        if(! leftTree || ! rightTree) return false;

        return true;
    }


    ///EFFICIENT SOLUTION -> O(N)

    /**
     * Is Balanced Tree efficient solution by carrying the height at each node.
     */
    public boolean isBalancedEfficient(Node node){
        return isBalancedHelper(node) != -1;
    }

    private int isBalancedHelper(Node node) {
        if(node==null) return 0;

        int leftH = isBalancedHelper(node.left);
        int rightH = isBalancedHelper(node.right);

        if(leftH==-1 || rightH==-1) return -1;

        if(Math.abs(leftH-rightH) > 1) return -1;

        return Math.max(leftH, rightH)+1;
    }
    
}
