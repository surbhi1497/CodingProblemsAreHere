/*
Given an array arr of integer elements, the task is to find the range and coefficient
of range of the given array where:
Range: Difference between the maximum value and the minimum value in the distribution.
Coefficient of Range: (Max – Min) / (Max + Min).
 */
package Arrays.TopQuestions;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RangeAndCoefficientOfRangeOfArray {
    private static void findRange(int[] array, int size){

        System.out.println("Range is "+(array[size-1]-array[0]));

    }
    private static void findCoefficient(int[] array, int size){
        System.out.println("The coefficient is "+(float)((array[size-1]-array[0])/(float)(array[size-1]+array[0])));
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine().trim());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().trim().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            Arrays.sort(array);
            RangeAndCoefficientOfRangeOfArray rangeAndCoefficientOfRangeOfArray =
                    new RangeAndCoefficientOfRangeOfArray();
            rangeAndCoefficientOfRangeOfArray.findRange(array, numberOfElement);
            rangeAndCoefficientOfRangeOfArray.findCoefficient(array, numberOfElement);
        }
    }
}
