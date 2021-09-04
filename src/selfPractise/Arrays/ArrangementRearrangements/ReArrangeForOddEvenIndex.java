package selfPractise.Arrays.ArrangementRearrangements;
/*Given an array of n elements.
Our task is to write a program to rearrange the array such that elements at even positions are greater
 than all elements before it and elements at odd positions are less than all elements before it.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReArrangeForOddEvenIndex {
    void reArrange(int[] array, int size){
        Arrays.sort(array);
        int[] temp = new int[size];
        int evenPos = size/2;
        int oddPos = size - evenPos;
        int j = oddPos - 1;

        for (int i = 0; i < size; i += 2) {
            temp[i] = array[j];
            j--;
        }

        j = oddPos;
        for (int i = 1; i < size; i += 2) {
            temp[i] = array[j];
            j++;
        }
        for(int i=0;i<size;i++)
            System.out.print(temp[i]+" ");
        System.out.println();

    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            ReArrangeForOddEvenIndex reArrangeForOddEvenIndex =
                    new ReArrangeForOddEvenIndex();
            reArrangeForOddEvenIndex.reArrange(array, numberOfElement);
        }
    }
}
