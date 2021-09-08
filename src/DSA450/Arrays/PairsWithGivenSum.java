/*
Given an array of N integers, and an integer K,
find the number of pairs of elements in the array whose sum is equal to K.
Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2

 */
package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PairsWithGivenSum {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine().trim());
            while (tc-- > 0) {
                String[] inputLine;
                inputLine = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int k = Integer.parseInt(inputLine[1]);
                int[] arr = new int[n];
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                int ans = new PairsWithGivenSum().getPairsCount(arr, n, k);
                System.out.println("count of pairs is "+ans);
            }
        }

        int getPairsCount(int[] arr, int n, int k) {
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for(int i=0;i<n;i++)
            {
                int rem = k - arr[i];
                if(hm.containsKey(rem)){
                    int count = hm.get(rem);
                    for(int j=0;j<count;j++)
                        System.out.print("("+rem+", "+arr[i]+")");
                }
                if(!hm.containsKey(arr[i]))
                    hm.put(arr[i],0);

                hm.put(arr[i], hm.get(arr[i])+1);
            }
            int pseudo_count=0;
            for(int i=0;i<n;i++){
                if(hm.get(k-arr[i])!=null)
                    pseudo_count = pseudo_count + hm.get(k-arr[i]);
                if((k-arr[i])==arr[i])
                    pseudo_count--;

            }
            return pseudo_count/2;
            // code here
        }
    }


