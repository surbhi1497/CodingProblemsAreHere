package selfPractise.LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class MoveLastElementToFront {
    Node head;
    Node temp;
    public void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            temp = node;
        }
        else{
            temp.next = node;
            temp = node;
        }
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void moveLastElementToFront(){
        if(head == null || head.next == null)
            return;
        Node curr = head, prev = null;
        while(curr.next!=null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        curr.next = head;
        head = curr;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of test cases ");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.println("enter no of nodes in linked list ");
            int n = sc.nextInt();
            MoveLastElementToFront moveLastElementToFront = new MoveLastElementToFront();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            moveLastElementToFront.addToTheLast(head);
            System.out.println("enter elements of list ");
            for (int i = 1; i < n; i++) {
                a1 = sc.nextInt();
                moveLastElementToFront.addToTheLast(new Node(a1));
            }
            moveLastElementToFront.printList();
            moveLastElementToFront.moveLastElementToFront();
            moveLastElementToFront.printList();

        }
    }
}
