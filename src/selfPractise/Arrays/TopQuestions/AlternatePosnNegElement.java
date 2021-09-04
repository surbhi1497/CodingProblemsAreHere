package selfPractise.Arrays.TopQuestions;

import java.util.*;
import java.io.*;
public class AlternatePosnNegElement {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine().trim());
            while (tc-- > 0) {
                String[] inputLine;
                int n = Integer.parseInt(br.readLine().trim());
                int[] arr = new int[n];
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(inputLine[i]);
                }

                AlternatePosnNegElement.rearrange(arr, n);
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

        static void rearrange(int arr[], int n) {
            // code here
            ArrayList<Integer> pos = new ArrayList<Integer>();
            ArrayList<Integer> neg = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                if(arr[i]>=0)
                    pos.add(arr[i]);
                else
                    neg.add(arr[i]);

            }
            System.out.println("pos "+pos);
            System.out.println("neg "+neg);
            for(int i=0,j=0,k=0;i<n;){
                if(j<pos.size())
                    arr[i++] = pos.get(j++);
                if(k<neg.size())
                    arr[i++] = neg.get(k++);
            }

        }

}
