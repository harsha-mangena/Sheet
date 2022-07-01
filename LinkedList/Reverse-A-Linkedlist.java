package LinkedList;

import java.util.Stack;

class ReverseALinkedlist {
    public Node reverse(Node node){
        //Edge Case
        if(node==null || node.next==null){
            return node;
        }

        /**
         * Maintain a previous, toNext pointers as we try to modify the links in b/w instead of reversing the values.
         * Intution -> For each node update the node.next with previous
         * -> Maintain a next pointer in toNext
         * update the previous with the current node.
         * move the node to next with help of toNext  
         */
        Node previous=null, toNext=null;
        while(node != null){
            toNext = node.next;
            node.next = previous;
            previous = node;
            node = toNext;
        }
        return previous;
    }   
    
    public Node reversingLinkedListValues(Node node){
        //Edge Case
        if(node==null || node.next==null){
            return node;
        }

        //Additional Node's for references
        Node dummy=node, output=node; 
        Stack<Integer> values = new Stack<Integer>();

        //Getting Values
        while(node!=null){
            values.push(node.value);
            node = node.next;
        }

        //Updating Values in Linked List
        while(values.size()>0){
            dummy.value = values.pop();
            dummy = dummy.next;
        }

        return output;
    }
}
