package LinkedList.SinglyLinkedList;

public class SearchAnyNode extends Node{
    Node head;
    boolean searchNodeIteratively(Node head, int searchKey){
        Node temp = head;
        for(;temp!=null;temp=temp.next){
            if(temp.data==searchKey)
                return true;
        }
        return false;
    }

    boolean searchNodeRecursively(Node head, int searchKey){
        if(head==null)
            return false;
        if(head.data ==searchKey)
            return true;
        return searchNodeRecursively(head.next, searchKey);
    }

    void pushToList(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;

    }

    public static void main(String[] args){
        SearchAnyNode searchAnyNode = new SearchAnyNode();
        searchAnyNode.pushToList(2);
        searchAnyNode.pushToList(3);
        searchAnyNode.pushToList(4);
        searchAnyNode.pushToList(5);
        searchAnyNode.pushToList(6);
        int searchKey1 = 5;
        int searchKey2 = 1;
        System.out.println(searchAnyNode.searchNodeIteratively(searchAnyNode.head,searchKey1));
        System.out.println(searchAnyNode.searchNodeRecursively(searchAnyNode.head, searchKey1));
        System.out.println(searchAnyNode.searchNodeIteratively(searchAnyNode.head, searchKey2));
        System.out.println(searchAnyNode.searchNodeRecursively(searchAnyNode.head, searchKey2));
    }
}
