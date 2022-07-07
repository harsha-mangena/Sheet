package BinarySearchTrees;

class CeilInBST {
    
    public int getCeilValue(Node node, int key){
        int ceil = -1;
        if(node==null) return ceil;

        while(node!=null){
            if(node.value == key){
                ceil = node.value;
                return ceil;
            }

            if(key > node.value){
                ceil = node.value;
                node = node.left;
            }
            else{
                node = node.right;
            }
        }

        return ceil;
    }

}
