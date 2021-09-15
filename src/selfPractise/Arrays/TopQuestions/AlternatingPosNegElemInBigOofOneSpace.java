package selfPractise.Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlternatingPosNegElemInBigOofOneSpace {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of test cases : ");
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            System.out.println("enter number of elements of array : ");
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            System.out.println("enter the elements : ");
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            AlternatingPosNegElemInBigOofOneSpace.reArrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    private static void reArrange(int[] arr, int n) {
        int i=0, j =n-1;
        while(j>i){
            while(i<=n-1 && arr[i]>0)
                i += 1;
            while (j>=0 && arr[j]<0)
                j -= 1;
            if(i<j)
                swap(arr, i, j);
        }
        if(i==0 || i==n)
            return;
        int k=0;
        while(k<n && i<n){
            swap(arr, k, i);
            i += 1;
            k += 2;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
