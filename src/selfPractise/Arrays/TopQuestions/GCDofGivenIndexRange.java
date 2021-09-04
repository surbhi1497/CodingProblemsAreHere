package selfPractise.Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDofGivenIndexRange {
    private void findGCDofRange(int[] array, int size, int[][] indices, int indexCount){
            for(int i=0;i<indexCount;i++){
                int start = indices[i][0], end = indices[i][1];
                int gcd = findGCD(array, start, end);
                System.out.println("GCD of indices "+indices[i][0]+" and "+indices[i][1]+
                        "is :"+ gcd);
            }
    }

    private int findGCD(int[] array, int start, int end){
        int result = array[start];
        for(int i=start;i<end;i++){
            result = calculateGCD(result, array[i+1]);
        }
        return result;
    }

    private int calculateGCD(int a, int b){
            if (b == 0)
                return a;
            return calculateGCD(b, a % b);
        }


    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine().trim());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter the number of elements of array ");
            int number = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            int[] arr = new int[number];
            String[] str = bufferedReader.readLine().trim().split(" ");
            for (int i = 0; i < number; i++)
                arr[i] = Integer.parseInt(str[i]);
            System.out.println("Enter the number of pairs of indices ");
            int numberOfIndex = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of index range ");
            int[][] indices = new int[numberOfIndex][2];
            for(int i=0;i<numberOfIndex;i++) {
                str = bufferedReader.readLine().trim().split(" ,");
                indices[i][0] = Integer.parseInt(str[0]);
                indices[i][1] = Integer.parseInt(str[1]);
            }
            GCDofGivenIndexRange gcDofGivenIndexRange =
                    new GCDofGivenIndexRange();
            gcDofGivenIndexRange.findGCDofRange(arr, number, indices, numberOfIndex);
        }
    }
}
