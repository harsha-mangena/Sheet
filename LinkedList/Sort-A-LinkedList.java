package LinkedList;

class SortALinkedList {
    
    public Node SortBinaryList(Node A) {
        //Edge Case
        if(A==null || A.next==null){
            return A;
        }
        
        Node evenOne = new Node(-1);
        Node evenDummy = evenOne;
        Node oddOne = new Node(-1);
        Node oddDummy = oddOne;
        
        while(A!=null){
            if(A.value==1){
                evenOne.next = A;
                evenOne = evenOne.next;
            }
            else{
                oddOne.next=A;
                oddOne = oddOne.next;
            }
            
            A = A.next;
        }
        
        evenOne.next=null;
        oddOne.next=evenDummy.next;
        
        return oddDummy.next; 
    }
}
