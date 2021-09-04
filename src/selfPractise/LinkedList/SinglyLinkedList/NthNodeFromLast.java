package selfPractise.LinkedList.SinglyLinkedList;

public class NthNodeFromLast extends Node{
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
        NthNodeFromLast nthNodeFromLast = new NthNodeFromLast();
        nthNodeFromLast.push(2);
        nthNodeFromLast.push(1);
        nthNodeFromLast.push(3);
        nthNodeFromLast.push(5);
        nthNodeFromLast.push(4);
        nthNodeFromLast.push(7);
        nthNodeFromLast.push(6);
        nthNodeFromLast.printList();
        System.out.print(nthNodeFromLast.getNthNodeFromLast(nthNodeFromLast.head, 3,0));
        System.out.print(nthNodeFromLast.getNthNodeFromLast(nthNodeFromLast.head, 2,0));
        System.out.print(nthNodeFromLast.getNthNodeFromLast(nthNodeFromLast.head, 1,0));
    }
}
