Node Delete(Node head, int position) {
    Node h=head;
    if(head==null){
        return null;
    }
    if(position==0){
        Node temp=head.next;
        head=null;
        return temp;
    }
    
    int i=0;
    while(i!=(position-1) && head.next!=null){
        head=head.next;
        i++;
    }
    
    if(head.next.next!=null){
        head.next = head.next.next;
    }else{
        head.next=null;
    }    
    return h;
}