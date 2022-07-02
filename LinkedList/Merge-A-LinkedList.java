package LinkedList;

class MergeALinkedList{
    
    public Node mergeNodesWithSpace(Node node1, Node node2){
        //Edge Case
        if(node1 == null && node2==null){
            return null;
        }

        if(node1==null) return node2;

        if(node2==null) return node1;

        Node output = new Node(-1);
        Node dummy=output;

        while(node1!=null && node2!=null){
            if(node1.value <= node2.value){
                output.next=node1;
                node1=node1.next;
            }

            else{
                output.next=node2;
                node2=node2.next;
            }

            output = output.next;
        }
        return dummy.next;
    }
}
