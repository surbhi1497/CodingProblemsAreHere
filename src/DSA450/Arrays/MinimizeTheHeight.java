package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimizeTheHeight {
        public static void main(String[] args) throws Exception {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine().trim());
            while (tc-- > 0) {
                String[] inputLine;
                inputLine = br.readLine().trim().split(" ");
                int k = Integer.parseInt(inputLine[0]);
                inputLine = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int[] arr = new int[n];
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(inputLine[i]);
                }

                int ans = new MinimizeTheHeight().getMinDiff(arr, n, k);
                System.out.println(ans);
            }
        }
        int getMinDiff(int[] arr, int n, int k) {
            if(n==1)
                return 0;
            Arrays.sort(arr);
            for(int i=0;i<n;i++)
                arr[i] = arr[i] + k;
            int ans = arr[n-1] - arr[0];
            int small;
            int big;

            for(int i=n-1;i>=0;i--){
                arr[i] = arr[i] - 2*k;
                if(arr[i]<0)
                    break;
                if(i>0)
                    big = Math.max(arr[n-1], arr[i-1]);
                else
                    big = arr[n-1];
                small = Math.min(arr[0], arr[i]);
                ans = Math.min(ans, big-small);

            }

            return ans;


            // code here
        }
    }


