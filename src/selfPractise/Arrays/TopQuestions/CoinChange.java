package selfPractise.Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CoinChange {
    private long findCoinChange(int[] arr, int n, int k){
        long[] table = new long[k+1];
        Arrays.fill(table, 0);
        table[0] = 1;
        for(int i=0;i<n;i++){
            for (int j=arr[i]; j<=k; j++)
                table[j] += table[j-arr[i]];
        }
        return table[k];
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine().trim());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter the number of coins ");
            int number = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            int[] arr = new int[number];
            String[] str = bufferedReader.readLine().trim().split(" ");
            for (int i = 0; i < number; i++)
                arr[i] = Integer.parseInt(str[i]);
            System.out.println("Enter the value of amount ");
            int amount = Integer.parseInt(bufferedReader.readLine());
            CoinChange coinChange = new CoinChange();
            System.out.println(coinChange.findCoinChange(arr, number, amount));


        }
    }
}
