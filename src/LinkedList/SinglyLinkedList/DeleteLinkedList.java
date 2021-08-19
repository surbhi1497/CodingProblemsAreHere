package LinkedList.SinglyLinkedList;

public class DeleteLinkedList extends Node{
    Node head;

    void deleteList(){
        head = null;
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        if(head==null){
            System.out.println("list is null");
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }


    public static void main(String[] args){
        DeleteLinkedList deleteLinkedList =
                new DeleteLinkedList();
        deleteLinkedList.push(1);
        deleteLinkedList.push(2);
        deleteLinkedList.push(3);
        deleteLinkedList.push(4);
        deleteLinkedList.push(5);


        System.out.println("the linked list looks like " );
        deleteLinkedList.printList();

        deleteLinkedList.deleteList();
        deleteLinkedList.printList();
    }
}
