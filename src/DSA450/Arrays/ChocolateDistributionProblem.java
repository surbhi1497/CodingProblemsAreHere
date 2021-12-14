package DSA450.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of test cases");
        int test = scanner.nextInt();
        while (test-- > 0) {
            System.out.println("enter number of people to distribute chocolates to");
            int ppl = scanner.nextInt();
            System.out.println("enter number of elements of array");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("enter elements of array");
            for(int i=0;i<size;i++){
                array[i] = scanner.nextInt();
            }
            System.out.println("the minimnum difference is "+findMinDifference(array, ppl, size));

        }
    }

    private static int findMinDifference(int[] array, int ppl, int size) {
        if(ppl==0 || size==0)
            return 0;
        if(ppl>size)
            return -1;
        Arrays.sort(array);
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i+ppl-1<size;i++){
            if(min_diff>(array[i+ppl-1]-array[i]))
                min_diff = array[i+ppl-1] - array[i];
        }
        return min_diff;
    }
}
