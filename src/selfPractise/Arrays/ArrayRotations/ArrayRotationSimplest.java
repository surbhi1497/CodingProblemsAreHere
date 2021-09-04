package selfPractise.Arrays.ArrayRotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
Time complexity : O(n * d)
Auxiliary Space : O(1)
 */
public class ArrayRotationSimplest {
    public static void rotateArray(int[] array, int sizeOfArray, int position){

        for(int i=0;i<position;i++)
            rotateOneBYOne(array, sizeOfArray);
        printit(array, sizeOfArray);
    }

    public static void rotateOneBYOne(int[] array, int sizeOfArray){
        int temp = array[0];
        int i=0;
        for(i=1;i<sizeOfArray;i++){
            array[i-1] = array[i];
        }
        array[i-1] = temp;

    }

    public static void printit(int[] array, int n){
        System.out.println("the result is : ");
        for(int i=0;i<n;i++)
        System.out.print(array[i]+" ");
        System.out.println();
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for(int t=0;t<testNumber;t++) {
        System.out.println("Enter number of elements in array ");
        int numberOfElement = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the position till wants the array to be rotated ");
        int position = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the elements of array ");
        String[] temp = bufferedReader.readLine().split(" ");
        int[] array = new int[numberOfElement];
        for (int i = 0; i < numberOfElement; i++) {
            array[i] = Integer.parseInt(temp[i]);
        }

            rotateArray(array, numberOfElement, position);
        }
    }
}
