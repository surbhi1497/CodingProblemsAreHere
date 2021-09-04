package selfPractise.LinkedList.SinglyLinkedList;
import java.util.*;

public class IntersectionPoint {
        Node head = null;
        Node tail = null;

        public void addToTheLast(Node node)
        {

            if (head == null) {
                head = node;
                tail = head;
            } else {
                tail.next=node;
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



        /* Driver program to test above functions */
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();

            while(t>0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int n3 = sc.nextInt();
               IntersectionPoint llist1 = new IntersectionPoint();
                IntersectionPoint llist2 = new IntersectionPoint();
                IntersectionPoint llist3 = new IntersectionPoint();

                int a1=sc.nextInt();
                Node head1= new Node(a1);
                Node tail1= head1;

                for (int i = 1; i < n1; i++)
                {
                    int a = sc.nextInt();
                    tail1.next = (new Node(a));
                    tail1= tail1.next;
                }


                int b1=sc.nextInt();
                Node head2 = new Node(b1);
                Node tail2 = head2;
                for (int i = 1; i < n2; i++)
                {
                    int b = sc.nextInt();
                    tail2.next = (new Node(b));
                    tail2= tail2.next;
                }

                int c1=sc.nextInt();
                Node head3= new Node(c1);
                tail1.next = head3;
                tail2.next = head3;
                Node tail3=head3;
                for (int i = 1; i < n3; i++)
                {
                    int c = sc.nextInt();
                    tail3.next = (new Node(c));
                    tail3= tail3.next;
                }

                Intersect obj = new Intersect();
                System.out.println(obj.intersectPoint(head1, head2));
                t--;
            }
        }
    }

    class Intersect
    {
        //Function to find intersection point in Y shaped Linked Lists.
        int intersectPoint(Node head1, Node head2)
        {
            Node node1 = head1;
            Node node2 = head2;
            HashSet<Node> hs = new HashSet<Node>();
            while(node1!=null){
                hs.add(node1);
                node1 = node1.next;
            }
            while(node2!=null){
                if(hs.contains(node2))
                    return node2.data;
                node2 = node2.next;
            }
            return -1;
        }
    }




