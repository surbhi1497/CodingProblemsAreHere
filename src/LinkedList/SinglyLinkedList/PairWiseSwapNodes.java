package LinkedList.SinglyLinkedList;

public class PairWiseSwapNodes {
    Node head;
    void printList(Node head){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void pairWiseSwap(){
        Node temp = head;
        while(temp!=null && temp.next!=null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;

        }
    }
    public static void main(String[] args){
        PairWiseSwapNodes pairWiseSwapNodes = new PairWiseSwapNodes();
        pairWiseSwapNodes.push(1);
        pairWiseSwapNodes.push(2);
        pairWiseSwapNodes.push(3);
        pairWiseSwapNodes.push(4);
        pairWiseSwapNodes.push(5);
        pairWiseSwapNodes.push(6);
        System.out.println("original list ");
        pairWiseSwapNodes.printList(pairWiseSwapNodes.head);
        pairWiseSwapNodes.pairWiseSwap();
        System.out.println("swapped list ");
        pairWiseSwapNodes.printList(pairWiseSwapNodes.head);
    }
}
