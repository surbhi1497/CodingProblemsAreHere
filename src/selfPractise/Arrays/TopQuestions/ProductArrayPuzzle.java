package selfPractise.Arrays.TopQuestions;
import java.io.*;
import java.util.*;
public class ProductArrayPuzzle {
        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0){
                int n = sc.nextInt();
                int[] array = new int[n];
                for (int i=0; i<n ; i++ ) {
                    array[i] = sc.nextInt();
                }
                ProductArrayPuzzle ob = new ProductArrayPuzzle();
                long[] ans = new long[n];
                ans = ob.productExceptSelf(array, n);

                for (int i = 0; i < n; i++) {
                    System.out.print(ans[i]+" ");
                }
                System.out.println();
                t--;
            }
        }

        public static long[] productExceptSelf(int nums[], int n)
        {
            long[] result = new long[n];
            long product = 1;
            int zeroCount = 0;
            for(int i=0;i<n;i++){
                if(nums[i]==0)
                    zeroCount++;
                else
                    product = product * nums[i];
            }
            for(int i=0;i<n;i++){
                if(zeroCount > 1)
                    result[i] = 0;
                else if(zeroCount == 0)
                    result[i] = product/nums[i];
                else if(nums[i]==0)
                    result[i] = product;
            }
            return result;
            // code here
        }
    }



