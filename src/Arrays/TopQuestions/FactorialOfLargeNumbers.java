package Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

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
            ArrayList<Integer> result = factorialOfLargeNumbers.findFactorial(number);
            for(Integer ans : result)
                System.out.print(ans);
            System.out.println();
        }
    }

}
