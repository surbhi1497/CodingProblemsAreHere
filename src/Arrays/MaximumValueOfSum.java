package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array, only rotation operation is allowed on array.
 We can rotate the array as many times as we want.
 Return the maximum possible summation of i*arr[i]
 */
public class MaximumValueOfSum {
    void findTheSum(int[] array, int sizeOfArray){
        int sum=0, maxSum = 0;
        for(int i=0;i<sizeOfArray;i++)
            sum = sum + array[i] * i;
        maxSum = sum;
        for(int i=0;i<sizeOfArray-1;i++){
            sum = calculateTheSum(array, sizeOfArray);
            if(sum>maxSum)
                maxSum=sum;
        }
        System.out.println("the maximum sum is "+maxSum);
    }
    int calculateTheSum(int[] array, int sizeOfArray){
        int temp = array[0];
        int tempSum = 0,i=0;
        for(i=0;i<sizeOfArray-1;i++) {
            array[i] = array[i + 1];
            tempSum = tempSum + array[i] * i;
        }
        array[i] = temp;
        tempSum = tempSum + array[i] * i;
        return tempSum;


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
            MaximumValueOfSum maximumValueOfSum = new MaximumValueOfSum();
                    maximumValueOfSum.findTheSum(array, numberOfElement);
        }
    }
}
