package LinkedList.SinglyLinkedList;

public class FindLengthOfLinkedList extends LinkedList{
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
        FindLengthOfLinkedList findLengthOfLinkedList =
                new FindLengthOfLinkedList();
        findLengthOfLinkedList.push(1);
        findLengthOfLinkedList.push(2);
        findLengthOfLinkedList.push(3);
        findLengthOfLinkedList.push(4);
        findLengthOfLinkedList.push(5);
        System.out.println("iterative count is "+findLengthOfLinkedList.getIterativeCount());
        System.out.println("recursive count is "+findLengthOfLinkedList.getRecursiveCount());
    }
}
