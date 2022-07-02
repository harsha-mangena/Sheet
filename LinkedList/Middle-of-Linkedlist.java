package LinkedList;

class MiddleOfLinkedlist {
    private int getCount(Node node){
        int count=0;
        while(node!=null){
            count ++;
            node = node.next;
        }
        return count;
    }

    public Node getMiddleNode(Node node){
        //Edge Case
        if(node==null || node.next==null) return node;

        int middleIndex = getCount(node)/2 +1;
        int count=0;
        while(node!=null){
            count+=1;
            if(count==middleIndex){
                break;
            }

            else{
                node=node.next;
            }
        }
        return node;
    }

    /**
     * Efficient approach.
     * Using fast and slow pointers.
     * The concept of fast and slow pointers will be quite useful in many cases.
     * Example LinkedList = 1->2->3->4. output = 3->4.
     * fast = 1, slow = 1
     * Move fast by 2(i.e fast = fast.next.next) and slow by 1(i.e slow = slow.next);
     * By the time fast is null, then slow will be at middle. 
     */
    public Node middleOfLinkedList(Node node){
        //Edge case
        if(node==null || node.next==null) return node;

        Node slow=node, fast=node;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    /**
     * Delete middle node of Linked list
     * Example -> 1->2->3->4->5.
     * O|P -> 1->2->4->5
     * Intution as the middle of linked list, along with that here we maintain another node called Prev to store the previous node at each node.
     * At last while fast==null, slow is at middle, then we update the previous.next with slow.next, thus skipping the middle element.
     */
    public Node DeleteMiddleOfLinkedList(Node node){
        //Edge cases
        /**
         * If LinkedList has only one element, then we will delete that, so we will return null. 
         */
        if(node==null || node.next==null) return null;

        Node slow=node, fast=node, dummy=node, previous=null;

        while(fast!=null && fast.next!=null){
            previous=slow;
            fast=fast.next.next;
            slow=slow.next;
        }

        previous.next = slow.next;

        return dummy;
    }
}
