package LinkedList.SinglyLinkedList;

public class FindMiddleOfList extends Node{
    Node head;
    void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    int middleOfList(Node head){
        Node temp = head;
        Node node = head;
        while(temp!=null && temp.next!=null){
            temp = temp.next.next;
            node = node.next;
        }
        return node.data;
    }

    public static void main(String[] args){
        FindMiddleOfList findMiddleOfList = new FindMiddleOfList();
        findMiddleOfList.push(2);
        findMiddleOfList.push(3);
        findMiddleOfList.push(4);
        findMiddleOfList.push(5);
        findMiddleOfList.push(6);
        findMiddleOfList.push(7);
        findMiddleOfList.push(8);
        findMiddleOfList.printList();
        System.out.println(findMiddleOfList.middleOfList(findMiddleOfList.head));
    }
}
