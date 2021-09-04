package selfPractise.LinkedList.SinglyLinkedList;

public class LengthOfLoop {
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

    int getLoopLength(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null || slow!=null || fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
               return countLength(slow);
        }
        return 0;
    }

    int countLength(Node node){
        int count = 1;
        Node temp = node;
        while(temp.next != node){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args){
        LengthOfLoop lengthOfLoop = new LengthOfLoop();
        lengthOfLoop.push(2);
        lengthOfLoop.push(3);
        lengthOfLoop.push(4);
        lengthOfLoop.push(6);
        lengthOfLoop.push(1);
        lengthOfLoop.push(5);
        lengthOfLoop.push(7);
        lengthOfLoop.head.next.next.next.next = lengthOfLoop.head;
        System.out.println(lengthOfLoop.getLoopLength(lengthOfLoop.head));

    }


}
