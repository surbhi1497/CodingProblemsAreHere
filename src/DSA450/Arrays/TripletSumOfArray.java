package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TripletSumOfArray {
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                String inputLine[] = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int X = Integer.parseInt(inputLine[1]);
                int A[] = new int[n];
                inputLine = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++){
                    A[i] = Integer.parseInt(inputLine[i]);
                }
                TripletSumOfArray ob=new TripletSumOfArray();
                boolean ans = ob.find3Numbers(A, n, X);
                System.out.println(ans?1:0);
            }
        }

        public static boolean find3Numbers(int arr[], int n, int target) {
            Arrays.sort(arr);
            int tempSum = 0;
            for(int i=0;i<n;i++){
                int temp = arr[i];
                int j=i+1,k=n-1;
                while(j<k){
                    int a = temp + arr[j] + arr[k];
                    if(a==target)
                        return true;
                    if(a<target)
                        j++;
                    else
                        k--;
                }
            }
            return false;

            // Your code Here

        }
    }


