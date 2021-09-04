package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReArrangePositiveNegativeWithoutExtraSpace {
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
            ReArrangePositiveNegativeWithoutExtraSpace reArrangePositiveNegativeWithoutExtraSpace =
                    new ReArrangePositiveNegativeWithoutExtraSpace();
            reArrangePositiveNegativeWithoutExtraSpace.reArrange(array, 0, numberOfElement-1);
            reArrangePositiveNegativeWithoutExtraSpace.printList(array, numberOfElement);
        }
    }

    private void printList(int[] array, int numberOfElement) {
        for (int i=0;i<numberOfElement;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    private void reArrange(int[] array, int l, int r) {
        int mid = l + (r - l) / 2;
        if (l < r) {
            reArrange(array, l ,mid);
            reArrange(array, mid+1, r);
            merge(array, l, mid, r);
        }
    }

    private void merge(int[] array, int l, int mid, int r) {
        int i, j, k;
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(i=0;i<n1;i++)
            arr1[i] = array[l+i];
        for(j=0;j<n2;j++)
            arr2[j] = array[mid+j+1];
        i=0;
        j=0;
        k=l;
        while(i<n1 && arr1[i]<0)
            array[k++] = arr1[i++];
        while(j<n2 && arr2[j]<0)
            array[k++] = arr2[j++];
        while(i<n1)
            array[k++] = arr1[i++];
        while (j<n2)
            array[k++] = arr2[j++];
    }
}
