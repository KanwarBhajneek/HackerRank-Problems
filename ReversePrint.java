
void ReversePrint(Node head) {
    Node prev=null;
    Node curr=null;
    Node next=head;
    while(next!=null){
        curr=next;
        next=next.next;
        curr.next=prev;
        prev=curr;
    }
    while(prev!=null){
        System.out.println(prev.data);
        prev=prev.next;
    }

}
