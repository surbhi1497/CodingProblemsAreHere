package LinkedList.SinglyLinkedList;

public class GetNthNodeFromLast extends Node{
    Node head;

     int getNthNodeFromLast(Node h, int n, int i){
        if(h==null)
            return -1;
        if(++i == n)
            return h.data;
        return getNthNodeFromLast(h.next, n,  i);

    }

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

    public static void main(String[] args) {
        GetNthNodeFromLast getNthNodeFromLast = new GetNthNodeFromLast();
        getNthNodeFromLast.push(2);
        getNthNodeFromLast.push(1);
        getNthNodeFromLast.push(3);
        getNthNodeFromLast.push(5);
        getNthNodeFromLast.push(4);
        getNthNodeFromLast.push(7);
        getNthNodeFromLast.push(6);
        getNthNodeFromLast.printList();
        System.out.print(getNthNodeFromLast.getNthNodeFromLast(getNthNodeFromLast.head, 3,0));
        System.out.print(getNthNodeFromLast.getNthNodeFromLast(getNthNodeFromLast.head, 2,0));
        System.out.print(getNthNodeFromLast.getNthNodeFromLast(getNthNodeFromLast.head, 1,0));
    }
}
