package BinarySearchTrees;

class FloorInBST {
    
    public int getFloorValue(Node node, int key){
        int floor = -1;
        if(node==null) return floor;

        while(node!=null){
            if(node.value == key){
                floor = node.value;
                return floor; 
            }

            if(key < node.value){
                floor = node.value;
                node = node.right;
            }

            else{
                node = node.left;
            }
        }

        return floor;
    }
}
