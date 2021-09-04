package selfPractise.LinkedList.CircularLinkedList;

public class CircularLinkedListTraversal{
    static class Node
    {
        int data;
        Node next;
    };

    static Node push(Node head, int data){
        Node node = new Node();
        node.data = data;
        Node temp = head;
        node.next = head;
        if(head==null){
            head = node;
            head.next = head;
        }
        else{
            while (temp.next!=head){
                temp = temp.next;
            }
            temp.next = node;
        }
        return head;
    }

    static void printList(Node head)
    {
        Node temp = head;
        if (head != null)
        {
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
        }
    }

    public static void main(String args[])
    {
        Node head = null;
        head = push(head, 12);
        head = push(head, 56);
        head = push(head, 2);
        head = push(head, 11);

        System.out.println("Contents of Circular " +
                "Linked List:");
        printList(head);
    }
}
