package LinkedList.SinglyLinkedList;

public class LinkedListDeletion extends LinkedList{
    public Node deleteGivenKey(int key){
        LinkedList.Node temp = head, prev = null;
        if(temp!=null && temp.data==key){
            head = head.next;
            return head;
        }
        while(temp!=null && temp.data!=key){
            prev = temp;
            temp = temp.next;
        }
        if(temp==null)
            return null;
        prev.next = temp.next;
        return head;

    }

    public Node deleteKeyAtPosition(int position){
        if(head==null)
            return null;
        Node temp = head;
        if(position==0) {
            head = temp.next;
            return head;
        }
        for(int i=0;temp!=null && i<position-1;i++){
            temp = temp.next;
        }
        if(temp==null || temp.next==null)
            return null;
        Node node = temp.next.next;
        temp.next = node;
        return head;
    }

    public Node deleteNodeAtLast(){
        Node temp = head;
        if(head==null){
            return null;
        }
        if(temp.next == null){
            temp.next = head;
            return head;
        }
        Node prev = temp;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }

    public Node deleteStartNode(){
        Node temp = head;
        if(temp==null)
            return null;
        if(temp.next==null){
            temp.next = head;
            return head;
        }
        temp = head.next;
        head = temp;
        return head;
    }

    public void printList(){
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args){
        new LinkedListInsertion().pushIntoLL();
        LinkedListDeletion linkedListDeletion =
                new LinkedListDeletion();
        linkedListDeletion.deleteGivenKey(3);
        linkedListDeletion.deleteStartNode();
        linkedListDeletion.deleteKeyAtPosition(3);
        linkedListDeletion.deleteNodeAtLast();
        linkedListDeletion.printList();
    }
}
