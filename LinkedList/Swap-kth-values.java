package LinkedList;

class Solution {
    public Node swapNodes(Node head, int k) {
        
        //Edge Case
        if(head==null || k==0){
            return head;
        }
        
        Node first=head, slow=head, fast=head;
        
        for(int i=1; i<k; i++){
            first=first.next;
            fast=fast.next;
        }
        
        fast=fast.next;
        
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        
        int temp = slow.value;
        slow.value = first.value;
        first.value=temp;
        
        return head;
        
    }
}
