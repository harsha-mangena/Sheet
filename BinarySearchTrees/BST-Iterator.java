package BinarySearchTrees;

import java.util.Stack;

class BSTIterator {

    private Stack<Node> store = new Stack<Node>();

    public BSTIterator(Node node){
        pushAllNode(node);
    }

    /***
     * This will return if we have next node return true.
     * @return
     */
    public boolean hasNext() {
        return !store.isEmpty();
    }

    public int next() {
        Node tmpNode = store.pop();
        pushAllNode(tmpNode.right);
        return tmpNode.value;
    }

    /***
     * This Method pushses all nodes that are left in the tree.
     * While popped the left node, if popped node has right, we will call the pushAll.
     * @param node
     */

    private void pushAllNode(Node node) {
        while(node != null){
            store.push(node);
            node=node.left;
        }
    }

    
}
