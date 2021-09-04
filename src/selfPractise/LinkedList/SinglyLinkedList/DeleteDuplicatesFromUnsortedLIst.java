package selfPractise.LinkedList.SinglyLinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class DeleteDuplicatesFromUnsortedLIst {
        Node head;
        Node temp;
        public void addToTheLast(Node node)
        {

            if (head == null)
            {
                head = node;
                temp = node;
            }
            else{
                temp.next = node;
                temp = node;
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
                DeleteDuplicatesFromUnsortedLIst llist = new DeleteDuplicatesFromUnsortedLIst();
                int a1=sc.nextInt();
                Node head= new Node(a1);
                llist.addToTheLast(head);
                for (int i = 1; i < n; i++)
                {
                    int a = sc.nextInt();
                    llist.addToTheLast(new Node(a));
                }
                Solution g = new Solution();
                llist.head = g.removeDuplicates(llist.head);
                llist.printList();

                t--;
            }
        }
    }

    class Solution
    {
        //Function to remove duplicates from unsorted linked list.
        public Node removeDuplicates(Node head)
        {
            Node curr = head;
            Node prev = null;
            HashSet<Integer> hs = new HashSet<>();
            while(curr!=null){
                if(hs.contains(curr.data)){
                    prev.next = curr.next;
                }
                else{
                    hs.add(curr.data);
                    prev = curr;
                }
                curr = curr.next;
            }
            return head;
            // Your code here
        }
    }


