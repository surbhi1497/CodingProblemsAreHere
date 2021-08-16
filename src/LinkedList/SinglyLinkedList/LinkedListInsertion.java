package LinkedList.SinglyLinkedList;

public class LinkedListInsertion extends LinkedList{
    public Node addNodeAtFirst(int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node addNodeAfterGivenNode(Node prev_node, int new_data){
        if(prev_node==null)
            return null;
        Node newNode = new Node(new_data);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
        return head;
    }

    public Node addNodeAtLast(int new_data){
        Node newNode = new Node(new_data);
        if(head==null){
            head = new Node(new_data);
            return head;
        }
        newNode.next = null;
        Node last = head;
        while(last.next!=null)
            last = last.next;
        last.next = newNode;
        return head;
    }

    public void printList(){
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void pushIntoLL(){
        LinkedListInsertion linkedListInsertion =
                new LinkedListInsertion();
        LinkedList linkedList = new LinkedList();
        linkedListInsertion.addNodeAtFirst(2);
        linkedListInsertion.addNodeAtLast(5);
        linkedListInsertion.addNodeAfterGivenNode(linkedList.head,  3);
        linkedListInsertion.addNodeAfterGivenNode(linkedList.head.next, 4);
        linkedListInsertion.addNodeAtLast(6);
        linkedListInsertion.addNodeAtFirst(1);

    }

    public static void main(String[] args){
        LinkedListInsertion linkedListInsertion =
                new LinkedListInsertion();
        linkedListInsertion.pushIntoLL();
        linkedListInsertion.printList();
    }
}
