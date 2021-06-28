package Arrays.ArrayRotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
we rotate an ascending order sorted array at some pivot unknown to you beforehand.
So for instance, 1 2 3 4 5 might become 3 4 5 1 2.
Devise a way to find an element in the rotated array in O(log n) time.
-The idea is to find the pivot point, divide the array in two sub-arrays and perform binary search.
-The main idea for finding pivot is – for a sorted (in increasing order) and pivoted array,
pivot element is the only element for which next element to it is smaller than it.
-Using the above statement and binary search pivot can be found.
-After the pivot is found out divide the array in two sub-arrays.
-Now the individual sub – arrays are sorted so the element can be searched using Binary Search.
 */
public class SearchInSortedAndRotatedArray {
    int searchInArray(int[] array, int sizeOfArray, int element) {
        int pivot = findPivotInArray(array, sizeOfArray);
        if(array[pivot] == element)
            return pivot;
        if(array[pivot] > element)
            return searchHere(array, pivot+1, sizeOfArray, element);
        else
            return searchHere(array, 0, pivot+1, element);
    }

     int searchHere(int[] array, int start, int end, int element) {
        int i=0;
        for(i=start;i<end;i++)
            if(array[i]==element)
                return i;

            return 0;
    }

    int findPivotInArray(int[] array, int size){
        int pivot = 0;
        for(int i=0;i<size;i++){
            if(array[i]>array[i+1]){
                pivot = i;
                break;
            }

        }
        return pivot;
    }

    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the element you want to search ");
            int element = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            SearchInSortedAndRotatedArray searchInSortedAndRotatedArray = new SearchInSortedAndRotatedArray();
            System.out.println(searchInSortedAndRotatedArray.searchInArray(array, numberOfElement, element));

        }

    }
}