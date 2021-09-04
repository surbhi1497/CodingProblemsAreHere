package selfPractise.LinkedList.SinglyLinkedList;

import java.util.Stack;

public class PalindromeList {
    Node head;
    void push(String data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.string+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean checkIfPalindrome(Node head){
        Stack<String> stack = new Stack<>();
        Node temp = head;
        while(temp!=null){
            stack.add(temp.string);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.string!= stack.pop())
                return false;
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args){
        PalindromeList palindromeList = new PalindromeList();
        palindromeList.push("A");
        palindromeList.push("B");
        palindromeList.push("C");
        palindromeList.push("C");
        palindromeList.push("B");
        palindromeList.push("A");
        palindromeList.printList();
        boolean result = palindromeList.checkIfPalindrome(palindromeList.head);
        System.out.println(result);

        PalindromeList palindromeList1 = new PalindromeList();
        palindromeList1.push("A");
        palindromeList1.push("B");
        palindromeList1.push("C");
        palindromeList1.push("D");
        palindromeList1.push("B");
        palindromeList1.push("A");
        palindromeList1.printList();
        boolean result1 = palindromeList1.checkIfPalindrome(palindromeList1.head);
        System.out.println(result1);
    }
}
