package Trees;

class UnivalueedTree {
    
    public boolean isUnivalueuedTree(Node node, int v){
        if(node==null) return true;

        return isUnivalueuedTreeHelper(node, node.value);
    }

    private boolean isUnivalueuedTreeHelper(Node node, int v) {

        if(node==null) return true;
        
        boolean leftSide = isUnivalueuedTreeHelper(node.left, v);
        if(v != node.value) return false;
        boolean rightSide = isUnivalueuedTreeHelper(node.right, v);
        
        return leftSide && rightSide;
    }
}
