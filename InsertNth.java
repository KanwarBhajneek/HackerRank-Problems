/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   
    Node h=head;
    Node node = new Node();
    node.data=data;
    if(head==null){
        return node;
    }
    if(position==0){
        node.next=head;
        return node;
    }
    int temp=0;
    while(temp!=(position-1) && h.next!=null){
        h=h.next;
        temp++;    
    } 
    node.next=h.next;
    h.next=node;
    return head;
}

