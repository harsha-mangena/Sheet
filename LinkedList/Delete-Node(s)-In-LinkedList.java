package LinkedList;

class DeleteNodesInLinkedList {
    /**
     * Delete a node when given.
     * Basically we will not delete the node, instead we will update the node value and next with node.next's node.
     */
    public void deleteANodeWhenGive(Node node){
        node.value = node.next.value;
        node.next = node.next.next;
    }

    /**
     * Delete nodes in a linked list with given values.
     */
    public Node deleteNodesWithGivenValues(Node node, int val){

        //Edge Cases
        if(node==null) return node;

        if(node.next==null){
            if(node.value == val){
                node=null;
            }
            return node;
        }

        Node dummy = new Node(-1);
        Node output=node;
        dummy.next=node;

        while(dummy!=null && dummy.next!=null){
            if(dummy.next.value == val){
                dummy.next = dummy.next.next;
            }
            else{
                dummy=dummy.next;
            }
        }
        return output.next;
    }
}
