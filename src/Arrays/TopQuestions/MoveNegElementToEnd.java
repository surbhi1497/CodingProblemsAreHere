package Arrays.TopQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

public class MoveNegElementToEnd {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input the number of testcases ");
            int t =
                    Integer.parseInt(br.readLine().trim()); // Inputting the testcases
            while(t-->0)
            {
                System.out.println("Input the number of elements ");
                int n = Integer.parseInt(br.readLine().trim());
                int a[] = new int[(int)(n)];
                System.out.println("Input the elements of array ");
                String inputLine[] = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(inputLine[i]);
                }

                Solution obj = new Solution();
                obj.segregateElements(a, n);

                for(int i=0;i<n;i++)
                    System.out.print(a[i]+" ");

                System.out.println();
            }
        }
    }
// } Driver Code Ends


//User function Template for Java

    class Solution {

        public void segregateElements(int arr[], int n)
        {
            int[] temp = new int[n];

            int j=0;
            for(int i=0;i<n;i++){
                if(arr[i]>=0){
                    temp[j] = arr[i];
                    j++;
                }

            }
            for(int i=0;i<n;i++){
                if(arr[i]<0){
                    temp[j] = arr[i];
                    j++;
                }

            }

            for(int i=0;i<n;i++)
                //System.out.print("array is "+temp[i]);
                arr[i] =temp[i];
            // Your code goes here
        }
    }

