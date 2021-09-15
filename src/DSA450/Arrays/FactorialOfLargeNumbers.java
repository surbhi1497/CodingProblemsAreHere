package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

class Node{
    int data;
    Node prev;
    Node(int d){
        data = d;
        prev = null;
        }
        }

public class FactorialOfLargeNumbers {

    private static ArrayList<Integer> findFactorial(int number){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        for(int i=2;i<=number;i++){
            multiply(i, al);
        }
        Collections.reverse(al);
        return al;
    }

    private static void multiply(int x, ArrayList<Integer> al){
        int carry = 0;
        int product = 1;
        for(int i=0;i!=al.size();i++){
            int temp = al.get(i);
            product = al.get(i)*x+carry;
            temp = product%10;
            al.remove(i);
            al.add(i, temp);
            carry = product/10;
        }
        while(carry!=0){
            al.add(carry%10);
            carry/=10;
        }
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine().trim());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter the number ");
            int number = Integer.parseInt(bufferedReader.readLine());
            FactorialOfLargeNumbers factorialOfLargeNumbers = new FactorialOfLargeNumbers();
            System.out.println("using likedlist in O(1) space : ");
            Node tail = new Node(1);
            for(int i=2;i<=number;i++)
                factorialOfLargeNumbers.factorialWithLinkedList(tail,number);
            factorialOfLargeNumbers.print(tail);
            System.out.println();
            System.out.println("using arraylist : ");
            ArrayList<Integer> result = factorialOfLargeNumbers.findFactorial(number);
            for(Integer ans : result)
                System.out.print(ans);
            System.out.println();
            System.out.println("using BigInteger : ");
            System.out.println(factorialOfLargeNumbers.usingBigInteger(number));
            System.out.println();
        }
    }

    private BigInteger usingBigInteger(int number) {
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=number;i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    private void print(Node tail) {
        if(tail==null)
            return;
        print(tail.prev);
        System.out.print(tail.data);
    }

    private void factorialWithLinkedList(Node tail, int number) {
        Node temp = tail;
        Node prevNode = null;
        int carry = 0, data=0;
        while(tail!=null){
            data = tail.data*number+carry;
            tail.data = data%10;
            carry = data/10;
            prevNode = tail;
            tail = tail.prev;
        }
        while (carry!=0){
            Node n = new Node(carry%10);
            prevNode.prev = n;
            carry = carry/10;
            prevNode = prevNode.prev;
        }
    }

}
