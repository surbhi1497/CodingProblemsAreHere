package selfPractise.Arrays.ArrayRotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
rotate(arr[], d, n)
  reverse(arr[], 1, d) ;
  reverse(arr[], d + 1, n);
  reverse(arr[], 1, n);
Let AB are the two parts of the input array
where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is :
Reverse A to get ArB, where Ar is reverse of A.
Reverse B to get ArBr, where Br is reverse of B.
Reverse all to get (ArBr) r = BA.
 */
public class ReversalArrayRotation {
    void rotateArray(int[] array, int sizeOfArray, int position) {
        if(position==0)
            return;
        position = position % sizeOfArray;
            reverseArray(array, 0, position-1);
            reverseArray(array, position, sizeOfArray-1);
            reverseArray(array, 0, sizeOfArray-1);

    }

    void reverseArray(int[] arr, int start, int end){
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    void printIt(int[] array, int size) {
        System.out.println("the result is : ");
        for(int i=0;i<size;i++)
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
            System.out.println("Enter the position till wants the array to be rotated ");
            int position = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            ReversalArrayRotation reversalArrayRotation = new ReversalArrayRotation();
            reversalArrayRotation.rotateArray(array, numberOfElement, position);
            reversalArrayRotation.printIt(array, numberOfElement);
        }
    }
}