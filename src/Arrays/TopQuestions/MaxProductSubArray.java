package Arrays.TopQuestions;
import java.io.*;
import java.util.*;
public class MaxProductSubArray {

        public static void main(String[] args) throws Exception {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine());
            while (tc-- > 0) {
                int n = Integer.parseInt(br.readLine());
                int[] arr = new int[n];
                String[] inputLine = br.readLine().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(inputLine[i]);
                }

                System.out.println(new MaxProductSubArray().maxProduct(arr, n));
            }
        }
        long maxProduct(int[] arr, int n) {
            if(n==1)
                return arr[0];

            long curr_max_prod=arr[0], curr_min_prod=arr[0],
                    prev_max_prod=arr[0], prev_min_prod=arr[0],
                    ans = arr[0];

            for(int i=1;i<n;i++){
                if(arr[i]<0){
                    long temp = curr_max_prod;
                    curr_max_prod = curr_min_prod;
                    curr_min_prod = temp;
                }

                curr_max_prod = Math.max(curr_max_prod*arr[i],arr[i]);
                curr_min_prod = Math.min(curr_min_prod*arr[i], arr[i]);
                ans = Math.max(ans, curr_max_prod);


            }
            return ans;
            // code here
        }

}
