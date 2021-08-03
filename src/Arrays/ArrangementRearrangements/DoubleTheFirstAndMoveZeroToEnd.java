/*
For a given array of n integers and assume that ‘0’ is an invalid number and all others as a valid number.
Convert the array in such a way that if both current and next element is valid then double current value
and replace the next number with 0.
After the modification, rearrange the array such that all 0’s shifted to the end.
 */
package Arrays.ArrangementRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleTheFirstAndMoveZeroToEnd {
    private static void arrangeTheArray(int[] array, int sizeOfArray){
        for(int i=0;i<sizeOfArray-1;i++){
            if(array[i]!=0 && array[i+1]!=0){
                array[i] = array[i]*2;
                array[i+1] = 0;
            }
        }
        pushZeroesToEnd(array, sizeOfArray);

    }

    private static void pushZeroesToEnd(int[] array , int sizeOfArray){
        int countOfZero = 0;
        for(int i=0;i<sizeOfArray;i++) {
            if (array[i] != 0)
                array[countOfZero++] = array[i];
        }
        while(countOfZero<sizeOfArray){
            array[countOfZero++] = 0;

        }

    }

    private static void printArray(int[] array, int sizeOfArray){
        for(int i=0;i<sizeOfArray;i++){
            System.out.print(array[i]+" ");
        }
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
            DoubleTheFirstAndMoveZeroToEnd doubleTheFirstAndMoveZeroToEnd =
                    new DoubleTheFirstAndMoveZeroToEnd();
            doubleTheFirstAndMoveZeroToEnd.arrangeTheArray(array, numberOfElement);
            doubleTheFirstAndMoveZeroToEnd.printArray(array, numberOfElement);
        }
    }
}
