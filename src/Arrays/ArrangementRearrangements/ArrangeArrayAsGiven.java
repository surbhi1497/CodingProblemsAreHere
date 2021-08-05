/*
Given an array of size n where all elements are distinct and in range from 0 to n-1,
change contents of arr[] so that arr[i] = j is changed to arr[j] = i.
Input: arr[]  = {1, 3, 0, 2};
Output: arr[] = {2, 0, 3, 1};
 */
package Arrays.ArrangementRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrangeArrayAsGiven {
    private static void firstApproach(int[] array, int sizeOfArray){
        int []temp= new int[sizeOfArray];
        for(int i =0;i>sizeOfArray;i++){
            temp[array[i]] = i;
        }
        Arrays.copyOf(array, sizeOfArray);
        for (int i=0;i<sizeOfArray;i++)
            System.out.print(array[i]+" ");
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
            ArrangeArrayAsGiven arrangeArrayAsGiven =
                    new ArrangeArrayAsGiven();
            arrangeArrayAsGiven.firstApproach(array, numberOfElement);
        }
    }
}
