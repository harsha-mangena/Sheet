package LinkedList;

class EvenOddLinkedList {

    public Node EvenOddLinkedListWithIndexWithSpace(Node node){

        if(node==null || node.next==null) return node;
        Node evenValuedList = new Node(-1);
        Node evenDummy =  evenValuedList;
        Node oddValuedList = new Node(-1);
        Node oddDummy = oddValuedList;

        int count=0;
        while(node!=null){
            count+=1;
            if(count%2==0){
                evenValuedList.next = node;
                evenValuedList = evenValuedList.next;
            }
            else if(count%2==1){
                oddValuedList.next = node;
                oddValuedList = oddValuedList.next;
            }
            node = node.next;
        }

        evenValuedList.next = null;;
        oddValuedList.next = evenDummy.next;
        
        return oddDummy.next;
    }
    
    public Node EvenOddSegregate(Node node){
        //Edge Case
        if(node==null || node.next==null) return node;

        Node evenValuedList = new Node(-1);
        Node evenDummy =  evenValuedList;
        Node oddValuedList = new Node(-1);
        Node oddDummy = oddValuedList;

        while(node!=null){
            if(node.value%2==0){
                evenValuedList.next = node;
                evenValuedList = evenValuedList.next;
            }

            else if(node.value%2 == 1){
                oddValuedList = node;
                oddValuedList = oddValuedList.next;
            }

            node = node.next;
        }

        oddValuedList.next = null;
        evenValuedList.next = oddDummy;

        return evenDummy;

    } 
}
