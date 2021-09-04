package selfPractise.Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AllPossibleCombinationsOfRElements {
    private void possibleCombinations(int[] arr, int n, int r){
        int[] data = new int[r];
        Arrays.sort(arr);
        combinationUtils(arr, data, 0, n-1,0, r);
    }
    private void combinationUtils(int[] arr, int[] data, int start, int end, int index, int r){
        if(r==index) {
            printIt(data, r);
            return;
        }

        for(int i=start;i<=end && (end-i+1>=r-index);i++) {
            data[index] = arr[i];
            combinationUtils(arr, data, i+1,end, index+1, r);
            if (i<end && (arr[i] == arr[i + 1]))
                i = i + 1;
        }
    }

    private void printIt(int[] data, int r){
        for(int i=0;i<r;i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine().trim());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter the number of elements ");
            int number = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            int[] arr = new int[number];
            String[] str = bufferedReader.readLine().trim().split(" ");
            for (int i = 0; i < number; i++)
                arr[i] = Integer.parseInt(str[i]);
            System.out.println("Enter the value of r ");
            int r = Integer.parseInt(bufferedReader.readLine());
            AllPossibleCombinationsOfRElements allPossibleCombinationsOfRElements =
                    new AllPossibleCombinationsOfRElements();
            allPossibleCombinationsOfRElements.possibleCombinations(arr, number, r);
            System.out.println();
        }
    }
}
