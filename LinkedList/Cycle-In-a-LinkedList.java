package LinkedList;

import java.util.HashMap;
import java.util.Map;

class CycleInLinkedList {
    /**
     * Detect a cycle in LL using Map.
     */
    public boolean DetectACycleWithSpace(Node node){
        //Edge Case
        if(node==null || node.next==null) return false;

        Map<Node, Boolean> checker = new HashMap<Node, Boolean>();

        while(node!=null){
            if(checker.containsKey(node)) return true;

            checker.put(node, true);
            node = node.next;
        }
        return false;
    }

    /**
     * Detect a cycle with space O(1).
     * Using fast and slow pointers.
     */
    public Node DetectACycleWithOutSpace(Node node){
        //Edge Case
        if(node==null || node.next==null) return node;

        Node fast=node, slow=node;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                break;
            }
        }
        return slow!=null ? slow : null;
    }

    /**
     * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
     * Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
     */

     public Node DetectCycleII(Node node){
        if(node==null || node.next==null) return node;

        Node temp = DetectACycleWithOutSpace(node);

        while(temp!=null && node!=null){
            if(temp.value == node.value){
                break;
            }
            temp=temp.next;
            node=temp.next;
        }
        return temp;
     }
}
