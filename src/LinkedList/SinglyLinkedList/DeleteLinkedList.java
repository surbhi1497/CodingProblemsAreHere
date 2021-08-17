package LinkedList.SinglyLinkedList;

public class DeleteLinkedList extends LinkedList{

    void deleteList(){
        head = null;
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args){
        DeleteLinkedList deleteLinkedList =
                new DeleteLinkedList();
        deleteLinkedList.push(1);
        deleteLinkedList.push(2);
        deleteLinkedList.push(3);
        deleteLinkedList.push(4);
        deleteLinkedList.push(5);

     LinkedListInsertion linkedListInsertion = new LinkedListInsertion();
//        linkedListInsertion.pushIntoLL();
//        System.out.println("the linked list looks like " );
        linkedListInsertion.printList();

        deleteLinkedList.deleteList();
        linkedListInsertion.printList();
    }
}
