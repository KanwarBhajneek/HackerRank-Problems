/*
Sample Input

1 -> 1 -> 3 -> 3 -> 5 -> 6 -> NULL
NULL

Sample Output

1 -> 3 -> 5 -> 6 -> NULL
NULL
*/

Node RemoveDuplicates(Node head) { 
    if(head==null){
        return null;
    }
    Node temp=head;
    while(temp!=null&& temp.next!=null){
        if(temp.data==temp.next.data ){
            temp.next=temp.next.next;
        }else{
            temp=temp.next;    
        }
    }
    return head;
}
