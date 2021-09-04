/*
Given an array A of n elements, sort the array according to the following relations :

A[i] >= A[i-1]
, if i is even.

A[i] <= A[i-1]
, if i is odd.
 */

package selfPractise.Arrays.ArrangementRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeEvenPositionedAreGreaterThanOdd {
    private static void arrangeTheArray(int[] array, int sizeOfArray){
        int temp=0;
        for(int i=1;i<sizeOfArray;i++){
            if(i%2==0) {
                if (array[i] > array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            else{
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
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
            ArrangeEvenPositionedAreGreaterThanOdd arrangeEvenPositionedAreGreaterThanOdd =
                    new ArrangeEvenPositionedAreGreaterThanOdd();
            arrangeEvenPositionedAreGreaterThanOdd.arrangeTheArray(array, numberOfElement);
            arrangeEvenPositionedAreGreaterThanOdd.printArray(array, numberOfElement);



        }

    }
}
