package Arrays.ArrangementRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
An array contains both positive and negative numbers in random order.
Rearrange the array elements so that positive and negative numbers are placed alternatively
in O(n) time and O(1) extra space.
 */
public class ReArrangePositiveAndNegativeElements {
    private static void arrangeElements(int[] arr, int sizeOfElements){
        int i = -1, temp = 0;
        for (int j = 0; j < sizeOfElements; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Now all positive numbers are at end and negative numbers at
        // the beginning of array. Initialize indexes for starting point
        // of positive and negative numbers to be swapped
        int pos = i+1, neg = 0;

        // Increment the negative index by 2 and positive index by 1, i.e.,
        // swap every alternate negative number with next positive number
        while (pos < sizeOfElements && neg < pos && arr[neg] < 0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
    }

    // A utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
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
            ReArrangePositiveAndNegativeElements reArrangePositiveAndNegativeElements =
                    new ReArrangePositiveAndNegativeElements();
            reArrangePositiveAndNegativeElements.arrangeElements(array, numberOfElement);
            reArrangePositiveAndNegativeElements.printArray(array, numberOfElement);
        }
    }
}

