package LinkedList.SinglyLinkedList;

import java.util.HashSet;

public class DetectLoop {
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

    boolean detectLoop(Node head){
        HashSet<Node> hs = new HashSet<>();
        while(head!=null){
            if(hs.contains(head))
                return false;
            hs.add(head);
        }
        return true;
    }

    public static void main(String[] args){
        DetectLoop detectLoop = new DetectLoop();
        detectLoop.push(2);
        detectLoop.push(1);
        detectLoop.push(3);
        detectLoop.push(4);
        detectLoop.push(5);
        detectLoop.push(6);
        detectLoop.push(7);
        detectLoop.head.next.next.next.next = detectLoop.head;
        //detectLoop.printList();
        System.out.println(detectLoop.detectLoop(detectLoop.head));

    }

}
