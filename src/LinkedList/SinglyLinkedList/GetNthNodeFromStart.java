package LinkedList.SinglyLinkedList;

public class GetNthNodeFromStart extends Node{
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
        GetNthNodeFromStart getNthNodeFromStart = new GetNthNodeFromStart();
        getNthNodeFromStart.push(2);
        getNthNodeFromStart.push(3);
        getNthNodeFromStart.push(6);
        getNthNodeFromStart.push(1);
        getNthNodeFromStart.push(4);
        getNthNodeFromStart.push(5);
        getNthNodeFromStart.printList();
        System.out.println(getNthNodeFromStart.getNthNode(3));
        System.out.println(getNthNodeFromStart.getNthNode(1));
        System.out.println(getNthNodeFromStart.getNthNode(4));

    }
}
