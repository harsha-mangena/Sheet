package LinkedList;

class RemoveDuplicatesInASortedList{
    public Node removeDuplicates(Node node){
        //Edge Case
        if(node==null || node.next==null){
            return node;
        }

        Node dummy = new Node(-1);
        dummy.next = node;

        /*
         * We have to chck for two nodes at a time, i.e node and node.next .
         * If node.val == node.next.val, then we will update the current node with next noce next value
         */
        while(node!=null && node.next!=null){
            //If both nodes are equal
            if(node.value == node.next.value){
                node.next = node.next.next;
            }
            //Else just update the current node with next one.
            else{
                node = node.next;
            }
        }
        return dummy.next;
    } 
}

