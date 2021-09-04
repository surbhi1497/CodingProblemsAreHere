package selfPractise.Arrays.ArrayRotations;
/*
Given an array that is sorted and then rotated around an unknown point.
Find if the array has a pair with a given sum ‘x’, if yes then count also of such pairs.
It may be assumed that all elements in the array are distinct.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPairWithSumInSortedAndRotatedArray {
    int pairWithSumInSortedAndRotatedArray(int[] array, int sizeOfArray, int sumOfPair){
        int pivot = findPivot(array, sizeOfArray);
        int largestElementIndex = pivot;
        int smallestElementIndex = (pivot+1)%sizeOfArray;
        int count = findPairHere(array,largestElementIndex, smallestElementIndex, sumOfPair);
        if(count>0)
            return count;
        return 0;

    }
    int findPairHere(int[] array, int largestElementIndex, int smallestElementIndex, int sumOfPair){
        int sizeOfArray = array.length;
        int countOfPairs = 0;
        while(largestElementIndex!=smallestElementIndex){
            if(array[largestElementIndex] + array[smallestElementIndex] == sumOfPair)
                countOfPairs++;
                //return true;
            if(array[largestElementIndex] + array[smallestElementIndex] < sumOfPair)
                smallestElementIndex = (smallestElementIndex+1)%sizeOfArray;
            else
                largestElementIndex = (sizeOfArray + largestElementIndex-1)%sizeOfArray;
        }
        return countOfPairs;

    }
    int findPivot(int[] array, int sizeOfArray){
         for(int i=0;i<sizeOfArray-1;i++){
             if(array[i]>array[i+1])
                 return i;
         }
         return -1;
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for(int t=0;t<testNumber;t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the sum of pair you want ");
            int sumOfPair = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            FindPairWithSumInSortedAndRotatedArray findPairWithSumInSortedAndRotatedArray =
                    new FindPairWithSumInSortedAndRotatedArray();
            int countOfPair = findPairWithSumInSortedAndRotatedArray.pairWithSumInSortedAndRotatedArray(array, numberOfElement, sumOfPair);
            if(countOfPair>0)
            System.out.println("Yes pair exist and such pairs are "+countOfPair);
            else
                System.out.println("No sorry pair does not exist");
        }
    }
}
