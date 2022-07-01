package LinkedList;

class PalindromeLinkedlist {
    private Node reverse(Node node){
        //Edge Case
        if(node==null || node.next==null){
            return node;
        }
        Node previous=null, toNext=null;
        while(node != null){
            toNext = node.next;
            node.next = previous;
            previous = node;
            node = toNext;
        }
        return previous;
    } 

    public boolean isPalindrome(Node node){
        //Edge Cases
        if(node==null) return false;

        if(node.next==null) return true;

        Node slow=node, fast=node;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==null){
                slow = reverse(slow);
            }
        }

        while(node!=null && slow!=null){
            if(node.value != slow.value){
                return false;
            }
            node = node.next;
            slow = slow.next;
        }
        return true;
    } 
}
