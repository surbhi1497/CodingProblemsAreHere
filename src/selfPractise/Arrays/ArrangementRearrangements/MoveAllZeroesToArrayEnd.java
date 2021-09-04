package selfPractise.Arrays.ArrangementRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array of random numbers,
Push all the zero’s of a given array to the end of the array.
 */
public class MoveAllZeroesToArrayEnd {
    private static void moveZeroesToEnd(int[] arr, int sizeOfArray) {
        int countOfZero = 0;
        for (int i = 0; i < sizeOfArray; i++)
            if (arr[i] != 0)
                arr[countOfZero++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (countOfZero < sizeOfArray)
            arr[countOfZero++] = 0;
    }

    static void inSingleTraversal(int[] arr, int sizeOfArray){
        int count = 0;
        int temp;

        // Traverse the array. If arr[i] is
        // non-zero, then swap the element at
        // index 'count' with the element at
        // index 'i'
        for (int i = 0; i < sizeOfArray; i++) {
            if ((arr[i] != 0)) {
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count = count + 1;
            }
        }
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
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
            MoveAllZeroesToArrayEnd moveAllZeroesToArrayEnd =
                    new MoveAllZeroesToArrayEnd();
            moveAllZeroesToArrayEnd.moveZeroesToEnd(array, numberOfElement);
            moveAllZeroesToArrayEnd.printArray(array, numberOfElement);
            System.out.println("in single traversal the result is ");
            moveAllZeroesToArrayEnd.inSingleTraversal(array, numberOfElement);
            moveAllZeroesToArrayEnd.printArray(array, numberOfElement);
        }
    }
}