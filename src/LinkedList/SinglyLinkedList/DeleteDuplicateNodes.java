package LinkedList.SinglyLinkedList;

import java.util.*;

public class DeleteDuplicateNodes {
        Node head;
        Node tail;
        public void addToTheLast(Node node)
        {
            if (head == null)
            {
                head = node;
                tail = node;
            }
            else
            {
                tail.next = node;
                tail = node;
            }
        }
        void printList()
        {
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        /* Drier program to test above functions */
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                int n = sc.nextInt();
                DeleteDuplicateNodes llist = new DeleteDuplicateNodes();
                int a1=sc.nextInt();
                Node head= new Node(a1);
                llist.addToTheLast(head);
                for (int i = 1; i < n; i++)
                {
                    int a = sc.nextInt();
                    llist.addToTheLast(new Node(a));
                }

                Implement g = new Implement();
                llist.head = g.removeDuplicates(llist.head);
                llist.printList();

                t--;
            }
        }
}
    class Implement
    {
        //Function to remove duplicates from sorted linked list.
        Node removeDuplicates(Node head)
        {
            Node temp = head;
            while(temp!=null){
                Node curr = temp;
                while(curr!=null && temp.data == curr.data){
                    curr = curr.next;
                }
                temp.next = curr;
                temp = temp.next;
                // Your code here
            }
            return head;
        }
    }


