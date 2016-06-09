// Cycle Detection

boolean hasCycle(Node head) {
    if(head==null){
        return false;
    }
    Node slow=head;
    Node fast=head;
    boolean output=false;
    while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){
            output=true;
            break;
        }
    }
    return output;
}
