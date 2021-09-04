package selfPractise.Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMaxElementOfArray {
    static class Pair{
        int max;
        int min;
    }
    public static void main(String args[])throws IOException
    {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases ");
    int t = Integer.parseInt(read.readLine());
        while(t-- >0)
    {
        System.out.println("Enter the element values of array ");
        String[] str = read.readLine().trim().split(" ");
        int[] arr = new int[str.length];
        for(int i=0;i< str.length;i++)
            arr[i] = Integer.parseInt(str[i]);
        Pair result = minMaxOfArray(arr);
        System.out.println("max element is "+result.max+", min element is "+result.min);
    }
}

        private static Pair minMaxOfArray(int[] arr) {
            int n = arr.length;
            Pair minMax = new Pair();
            int i = 0;
            if (n % 2 == 0) {
                if (arr[0] > arr[1]) {
                    minMax.max = arr[0];
                    minMax.min = arr[1];
                } else {
                    minMax.min = arr[0];
                    minMax.max = arr[1];
                }
                i = 2;
            } else {
                minMax.max = arr[0];
                minMax.min = arr[0];
                i = 1;
            }
            while(i<n-1){
                if(arr[i]>arr[i+1]){
                    if(minMax.max<arr[i])
                        minMax.max = arr[i];
                    if(minMax.min>arr[i+1])
                        minMax.min = arr[i+1];
                }
                else {
                    if(minMax.max<arr[i+1])
                        minMax.max = arr[i+1];
                    if(minMax.min>arr[i])
                        minMax.min = arr[i];
                }
                i = i+2;
            }
            return minMax;

        }

}
