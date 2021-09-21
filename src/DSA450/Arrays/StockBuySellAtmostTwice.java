package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StockBuySellAtmostTwice {
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
            StockBuySellAtmostTwice stockBuySellAtmostTwice =
                    new StockBuySellAtmostTwice();
            stockBuySellAtmostTwice.findProfit(arr, n);
            stockBuySellAtmostTwice.anotherApproach(arr, n);
        }
    }

    private void anotherApproach(int[] arr, int n) {
        int first_buy = Integer.MIN_VALUE;
        int second_buy = Integer.MIN_VALUE;
        int first_sell = 0;
        int second_sell = 0;
        for(int i=0;i<n;i++){
            first_buy = Math.max(first_buy, -arr[i]);
            first_sell = Math.max(first_sell, first_buy+arr[i]);
            second_buy = Math.max(second_buy, first_sell - arr[i]);
            second_sell = Math.max(second_buy, second_buy+arr[i]);
        }
        System.out.println("the profit is "+second_sell);
    }

    private void findProfit(int[] arr, int n) {
        int[] profit = new int[n];
        Arrays.fill(profit, 0);
        int max_profit = arr[n-1];
        for(int i = n-2; i>=0 ;i--){
            if(max_profit<arr[i])
                max_profit = arr[i];
            profit[i] = Math.max(max_profit - arr[i], profit[i+1]);
        }
        int min_profit = arr[0];
        for(int i = 1; i<n ; i++){
            if(min_profit>arr[i])
                min_profit = arr[i];
            profit[i] = Math.max(profit[i-1], arr[i]-min_profit+profit[i] );
        }
        System.out.println("the profit is :"+profit[n-1]);

    }
}
