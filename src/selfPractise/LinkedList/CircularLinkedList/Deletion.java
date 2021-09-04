package selfPractise.LinkedList.CircularLinkedList;

public class Deletion {
    static class Node{
        int data;
        Node next;
    }
    static Node head;

    void deletion(Node head, int data){
        if(head==null)
            return;
        Node curr = head, prev = new Node();
        while(curr.data!=data){
            if(curr.next == head) {
                System.out.println("no match found ");
                break;
            }

        }
        //if(curr==head && curr.next == head)
          //  head

    }
    public static void main(String[] args) {
        Deletion deletion = new Deletion();




    }
}
