package BinarySearchTrees;

class LCAInBST {
    public Node getLCA(Node root, Node p, Node q){
        if(root==null) return null;

        if(root.value < p.value && root.value < q.value){
            //Root goes to right
            return getLCA(root.right, p, q);
        }

        else if(root.value > p.value && root.value > q.value){
            //Root goes to Left
            return getLCA(root.left, p, q);
        }

        //If this is first split, return root;
        return root;
    }
}
