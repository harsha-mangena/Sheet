package LinkedList;

class Solution {
    public Node reverseKGroup(Node head, int k) {
        //Edge Cases
        
        if(head==null || head.next==null || k==1)
            return head;
        
        Node temp = head;
        int sz = 0;
    
        while(temp != null){
            sz++;
            temp = temp.next;
        }
    
        if(sz < k){
            return head;
        }
        
        Node previous=null, toNext=null, current=head;
        
        int count=0;
        
        while(current!=null && count<k){
            toNext=current.next;
            current.next=previous;
            previous=current;
            current=toNext;
            count+=1;
        }
        
        if(toNext!=null){
            head.next = reverseKGroup(toNext, k);
        }
        
        return previous;
    }
}