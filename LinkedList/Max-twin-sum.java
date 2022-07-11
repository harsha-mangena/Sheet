package LinkedList;

class maxTwinsum {

    public static Node reverse(Node node){
        Node previous=null, toNext=null;
        while(node!=null){
            toNext = node.next;
            node.next=previous;
            previous=node;
            node=toNext;
        }
        return previous;
    }

    public int getMaxTwinsum(Node node){
        if (node==null) return 0;

        int maxValue = Integer.MIN_VALUE;
        
        Node fast = node, slow  = node;
        
        while(fast!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow = reverse(slow);
        while (node!=null && slow!=null){
            maxValue = Math.max(maxValue, node.value+slow.value);
            slow=slow.next;
            node = node.next;
        }
        return maxValue;
    }
}
    
