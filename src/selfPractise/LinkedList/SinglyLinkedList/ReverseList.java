package selfPractise.LinkedList.SinglyLinkedList;

public class ReverseList {
    Node head;
    Node reverseList(Node node){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    void printList()
    {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args){
        ReverseList reverseList = new ReverseList();
        reverseList.push(1);
        reverseList.push(2);
        reverseList.push(3);
        reverseList.push(4);
        reverseList.push(5);
        reverseList.push(6);
        reverseList.printList();
        reverseList.reverseList(reverseList.head);
        reverseList.printList();
    }

}
