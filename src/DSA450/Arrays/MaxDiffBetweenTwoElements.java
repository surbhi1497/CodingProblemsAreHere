package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxDiffBetweenTwoElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of testcases : ");
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while (t-- > 0) {
            System.out.println("enter number of elements : ");
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            System.out.println("enter the elements ");
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            MaxDiffBetweenTwoElements maxDiffBetweenTwoElements = new MaxDiffBetweenTwoElements();
            System.out.println(maxDiffBetweenTwoElements.maxDiffMethod1(arr, n));
            System.out.println(maxDiffBetweenTwoElements.maxDiffMethod2(arr, n));
        }
    }

    private int maxDiffMethod2(int[] arr, int n) {
        int max_diff = -1;
        int max_element = arr[n-1];
        for(int i =n-2;i>=0;i--){
            if(max_element<arr[i])
                max_element = arr[i];
            else{
                int diff = max_element - arr[i];
                if(max_diff<diff)
                    max_diff = diff;
            }
        }
        return max_diff;

    }

    private int maxDiffMethod1(int[] arr, int n) {
        int max_diff = arr[1] - arr[0], min_element = arr[0];
        int i;
        for(i=1;i<n;i++){
            if(arr[i]-min_element>max_diff)
                max_diff = arr[i] - min_element;
            if(arr[i]<min_element)
                min_element = arr[i];
        }
        return max_diff;

    }
}
