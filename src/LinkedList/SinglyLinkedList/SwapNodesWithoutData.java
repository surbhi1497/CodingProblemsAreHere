package LinkedList.SinglyLinkedList;

public class SwapNodesWithoutData {
    Node head;
    Node tail;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    void swapNodes(int data1, int data2) {
        if (head == null) {
            return;
        }
        if (data1 == data2)
            return;

        Node prev1 = null, prev2 = null, node1 = head, node2 = head;
        while(node1!=null && node1.data!=data1){
            prev1 = node1;
            node1 = node1.next;
        }
        while(node2!=null && node2.data!=data2){
            prev2 = node2;
            node2 = node2.next;
        }
        if(node1!=null && node2!=null){
            if(prev1!=null){
                prev1.next = node2;
            }
            else{
                head = node2;
            }
            if(prev2!=null){
                prev2.next = node1;
            }
            else{
                head = node1;
            }
            Node temp = node1.next;
            node1.next = node2.next;
            node2.next = temp;
        }
        else{
            System.out.println("swapping not possible");
        }

    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SwapNodesWithoutData sList = new SwapNodesWithoutData();

        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        sList.addNode(6);
        sList.addNode(7);

        System.out.println("Original list: ");
        sList.display();

        sList.swapNodes(4, 7);
        sList.display();

        sList.swapNodes(1,4);
        sList.display();

        sList.swapNodes(8,2);
        sList.display();

    }
}
