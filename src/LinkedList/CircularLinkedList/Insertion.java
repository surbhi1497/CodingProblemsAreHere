package LinkedList.CircularLinkedList;


/*
1. Insertion in empty list
2. Insertion at beginning
3. Insertion at end
4. Insertion in the between the list
 */
public class Insertion {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    static Node head;

    public Node addToEmpty(Node head, int data){
        if(head!=null)
            return head;
        if(head==null){
            Node node = new Node(data);
            node = node.next;
            head = node;
        }
        return head;
    }

    public Node addToBeginning(Node head, int data){
        if(head==null)
            return addToEmpty(head, data);
        Node node = new Node(data);
        node.next = head.next;
        head.next = node;
        return head;
    }
    public Node addToEnd(Node end, int data){
        if(head == null)
            return addToEmpty(head, data);
        Node node = new Node(data);
        node.next = head.next;
        head.next = node;
        head = node;
        return head;
    }
    public Node addAfter(Node head, int data1, int data2 ){
        if(head==null)
            return addToEnd(head, data2);
        Node temp = head;
        Node node = new Node(data2);
        if(head.data==data1)
        {
            head.next = node;
            node.next = head;
            return head;
        }
        while(temp.data!=data1){
            temp.next = temp;
        }
        node.next = temp.next;
        temp.next = node;
        return head;
    }

    public void printList(Node head){
        Node temp = head;
        if(head!=null){
            do{
                System.out.println(temp.data);
                temp = temp.next;
            }
            while(temp!=null);
        }
    }

    public static void main(String[] args){
        Insertion insertion = new Insertion();
        head = null;
        head = insertion.addToEmpty(head, 1);
        head = insertion.addToBeginning(head, 2);
        head = insertion.addToBeginning(head, 3);
        head = insertion.addAfter(head, 2, 4);
        head = insertion.addAfter(head, 3, 5);
        head = insertion.addToEnd(head, 6);
        head = insertion.addToEnd(head, 7);

        insertion.printList(head);

    }

}
