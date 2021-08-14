package Arrays.TopQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;
public class AlternatingLongestSubsequence {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while (T-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                String[] S = br.readLine().split(" ");
                int[] nums = new int[n];
                for (int i = 0; i < n; i++)
                    nums[i] = Integer.parseInt(S[i]);
                AlternatingLongestSubsequence alternatingLongestSubsequence =
                        new AlternatingLongestSubsequence();
                int ans = alternatingLongestSubsequence.alternatingaMaxLength(nums);
                System.out.println(ans);
            }
        }
        public int alternatingaMaxLength(int[] arr) {
            int inc = 1, dec = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1])
                    inc = dec + 1;
                else if (arr[i] < arr[i - 1])
                    dec = inc + 1;

            }
            return Math.max(inc, dec);
            // code here
        }

}
