/*
Given an array of n positive integers and a number k.
Find the minimum number of swaps required to bring all the numbers less than or equal to k
together.
 */
package Arrays.ArrangementRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinSwapToReArrange {
    private static void firstApproach(int[] array, int k, int numberOfElements){
        int countOfElementsLessThanKis = 0;
        for(int i=0;i<numberOfElements;i++)
            if(array[i]<=k)
                countOfElementsLessThanKis++;
        int numberOfSwaps = 0;
        int unwantedElements = 0;
        for(int i=0;i<countOfElementsLessThanKis;i++)
                if (array[i] > k)
                    ++unwantedElements;
            numberOfSwaps = unwantedElements;
            for (int i = 0, j = countOfElementsLessThanKis; j < numberOfElements; ++i, ++j) {
                if (array[i] > k)
                    --unwantedElements;
                if (array[j] > k)
                    ++unwantedElements;
                numberOfSwaps = Math.min(numberOfSwaps, unwantedElements);
            }
            System.out.println(numberOfSwaps);
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
            System.out.println("Enter the value of k");
            int k = Integer.parseInt(bufferedReader.readLine());
            MinSwapToReArrange minSwapToReArrange =
                    new MinSwapToReArrange();
            minSwapToReArrange.firstApproach(array, k, numberOfElement);

        }
    }
}
