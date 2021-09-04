package selfPractise.LinkedList.SinglyLinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoSortedLIst {

    static Scanner sc = new Scanner(System.in);

    public static Node inputList(int size) {
        Node head, tail;
        int val;

        val = sc.nextInt();

        head = tail = new Node(val);

        size--;

        while (size-- > 0) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        return head;
    }

    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String args[]) {

        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m;

            n = sc.nextInt();
            m = sc.nextInt();

            Node head1 = inputList(n);
            Node head2 = inputList(m);

            Sol obj = new Sol();

            Node result = obj.findIntersection(head1, head2);

            printList(result);
            System.out.println();
        }
    }
}

class Sol
{
    private static Node head;
    public static Node findIntersection(Node head1, Node head2)
    {
        HashSet<Integer> set = new HashSet<>();
        Node current = head2;
        Node temp = head1;
        Node head3=null;
        while(temp!=null){
            set.add(temp.data);
            temp=temp.next;
        }
        while(current!=null){
            if(set.contains(current.data)){
                if(head==null){
                    head= new Node(current.data);
                    head3 = head;
                }
                else if(current.data!=head3.data){
                    head3.next = new Node(current.data);
                    head3= head3.next;
                }
                current = current.next;
            }
            else{
                set.add(current.data);
                current = current.next;
            }
        }
        return head;
    }


}
