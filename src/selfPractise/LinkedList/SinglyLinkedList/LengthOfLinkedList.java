package selfPractise.LinkedList.SinglyLinkedList;

public class LengthOfLinkedList extends Node{
    Node head;
    void push(int new_data){
        Node temp = new Node(new_data);
        temp.next = head;
        head = temp;

    }

    int getIterativeCount(){
        Node temp = head;
        int count = 0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    int recursiveCount(Node node){
        if(node == null)
            return 0;
        return 1 + recursiveCount(node.next);

    }

    int getRecursiveCount(){
        return recursiveCount(head);
    }

    public static void main(String[] args){
        LengthOfLinkedList lengthOfLinkedList =
                new LengthOfLinkedList();
        lengthOfLinkedList.push(1);
        lengthOfLinkedList.push(2);
        lengthOfLinkedList.push(3);
        lengthOfLinkedList.push(4);
        lengthOfLinkedList.push(5);
        System.out.println("iterative count is "+ lengthOfLinkedList.getIterativeCount());
        System.out.println("recursive count is "+ lengthOfLinkedList.getRecursiveCount());
    }
}
