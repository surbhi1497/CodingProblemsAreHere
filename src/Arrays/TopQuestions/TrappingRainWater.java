package Arrays.TopQuestions;
import java.io.*;
import java.util.*;
import java.lang.*;
public class TrappingRainWater {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while (t-- > 0) {

            //size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            TrappingRainWater trappingRainWater = new TrappingRainWater();
            System.out.println(trappingRainWater.naiveTrappingWater(arr, n));
            System.out.println(trappingRainWater.betterTrappingWater(arr, n));
        }
    }

    static int naiveTrappingWater(int arr[], int n) {
        int water = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(arr[j], left);
            int right = arr[i];
            for (int j = i + 1; j < n; j++)
                right = Math.max(arr[j], right);
            water = water + Math.min(left, right) - arr[i];

        }
        return water;

        // Your code here

    }

    static int betterTrappingWater(int arr[], int n) {
        int water = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        for (int i = 1; i < n - 1; i++) {
            water = water + Math.min(left[i], right[i]) - arr[i];

        }
        return water;
    }
}


