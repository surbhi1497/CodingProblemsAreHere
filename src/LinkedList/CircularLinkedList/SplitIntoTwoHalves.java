package LinkedList.CircularLinkedList;


public class SplitIntoTwoHalves {
    static class Node
    {
        int data;
        Node next, prev;
        Node(int d){
           data = d;
           next = prev = null;
        }
    };

    static Node head, head1, head2;

    static void splitList() {
        if (head == null)
            return;
        Node fast = head;
        Node slow = head;
        while (fast.next != head && fast.next.next != head) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next.next == head)
            fast = fast.next;
        head1 = head;
        if (head.next != head)
            head2 = fast.next;
        fast.next = slow.next;
        slow.next = head;
    }

    static void printList(Node node){
        Node temp = node;
        if(node!=null) {
            do {
                System.out.println(temp.data);
                temp = temp.next;
            }
            while (temp != null);
        }
    }

    public static void main(String[] args) {
        SplitIntoTwoHalves splitIntoTwoHalves = new SplitIntoTwoHalves();

        //Created linked list will be 12->56->2->11
        splitIntoTwoHalves.head = new Node(12);
        splitIntoTwoHalves.head.next = new Node(56);
        splitIntoTwoHalves.head.next.next = new Node(2);
        splitIntoTwoHalves.head.next.next.next = new Node(11);
        splitIntoTwoHalves.head.next.next.next.next = splitIntoTwoHalves.head;

        System.out.println("Original Circular Linked list ");
        splitIntoTwoHalves.printList(head);

        // Split the list
        splitIntoTwoHalves.splitList();
        System.out.println("");
        System.out.println("First Circular List ");
        splitIntoTwoHalves.printList(head1);
        System.out.println("");
        System.out.println("Second Circular List ");
        splitIntoTwoHalves.printList(head2);

    }
    }
