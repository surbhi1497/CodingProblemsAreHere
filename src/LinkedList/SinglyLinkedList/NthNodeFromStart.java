package LinkedList.SinglyLinkedList;

public class NthNodeFromStart extends Node{
    Node head;
    int getNthNode(int n){
        Node temp = head;
        int count=0;
        while(temp!=null){
            if(count==n)
                return temp.data;
            count++;
            temp = temp.next;

        }
        return -1;
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

    public static void main(String[] args){
        NthNodeFromStart nthNodeFromStart = new NthNodeFromStart();
        nthNodeFromStart.push(2);
        nthNodeFromStart.push(3);
        nthNodeFromStart.push(6);
        nthNodeFromStart.push(1);
        nthNodeFromStart.push(4);
        nthNodeFromStart.push(5);
        nthNodeFromStart.printList();
        System.out.println(nthNodeFromStart.getNthNode(3));
        System.out.println(nthNodeFromStart.getNthNode(1));
        System.out.println(nthNodeFromStart.getNthNode(4));

    }
}
