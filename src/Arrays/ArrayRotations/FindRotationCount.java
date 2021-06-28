package Arrays.ArrayRotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Consider an array of distinct numbers sorted in increasing order.
The array has been rotated (clockwise) k number of times.
Given such an array, find the value of k.
 */
public class FindRotationCount {
    void rotationCountInBigOofN(int[] array, int sizeOfArray){
        int i=0, result = -1;
        for(i=0;i<sizeOfArray-1;i++){
            if(array[i]> array[i+1])
                result = i;
        }
        if(result!= -1)
            System.out.println("the count of rotation in BigO(n) is "+ result+1);
        else
            System.out.println(("no rotation is there, so "+0+" rotations"));
    }
    int rotationCountInLogN(int[] array, int low, int high){
        if(low>high)
            return 0;
        if(low==high)
            return low;
        int mid = low + (high-low)/2;
        if(mid <high && array[mid]>array[mid+1])
            return mid+1;
        if(mid>low && array[mid]< array[mid-1])
            return mid;
        if(array[high]>array[mid])
            rotationCountInLogN(array, low, mid-1);
        return  rotationCountInLogN(array, mid+1, high);

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
            FindRotationCount findRotationCount = new FindRotationCount();
            findRotationCount.rotationCountInBigOofN(array, numberOfElement);
            int resultOfLogN = findRotationCount.rotationCountInLogN
                    (array, 0, numberOfElement-1);
            System.out.println("result Of LogN is "+resultOfLogN);
        }
    }
}


