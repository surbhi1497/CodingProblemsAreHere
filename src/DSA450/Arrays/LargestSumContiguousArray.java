package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestSumContiguousArray {

        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                //size of array
                int n = Integer.parseInt(br.readLine().trim());
                int arr[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");

                //adding elements
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }

                LargestSumContiguousArray obj = new LargestSumContiguousArray();

                //calling maxSubarraySum() function
                System.out.println(obj.maxSubarraySum(arr, n));
            }
        }

        int maxSubarraySum(int arr[], int n){
            int sum=0, temp=Integer.MIN_VALUE, start=0, end=0, s=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(temp<sum) {
                    temp = sum;
                    start = s;
                    end = i;
                }
                if(sum<0) {
                    sum = 0;
                    s = i + 1;
                }
            }
            System.out.println("starting index is "+start);
            System.out.println("ending index is "+end);
            return temp;
            // Your code here

        }

    }



