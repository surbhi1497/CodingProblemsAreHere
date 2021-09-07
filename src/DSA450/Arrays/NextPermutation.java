package DSA450.Arrays;

import java.io.*;
import java.util.*;
public class NextPermutation {

        public static void main(String args[])throws IOException
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            while(t-- > 0){
                int N = Integer.parseInt(in.readLine());
                String a[] = in.readLine().trim().split("\\s+");
                int arr[] = new int[N];
                for(int i = 0;i < N;i++)
                    arr[i] = Integer.parseInt(a[i]);

                NextPermutation ob = new NextPermutation();
                List<Integer> ans = new ArrayList<Integer>();
                ans = ob.nextPermutation(N, arr);
                StringBuilder out = new StringBuilder();
                for(int i = 0;i < N;i++)
                    out.append(ans.get(i) + " ");
                System.out.println(out);
            }
        }

        static List<Integer> nextPermutation(int N, int arr[]){
            List<Integer> list = new ArrayList<>();
            int i;
            for(i=N-1;i>0;i--){
                if(arr[i-1]<arr[i])
                    break;
            }
            if(i==0){
                for(int k=0;k<N;k++)
                    list.add(0, arr[k]);
                return list;
            }
            for(int j=i;j<N;j++)
                list.add(arr[j]);
            Collections.reverse(list);
            for(int j=i-1;j>=0;j--)
                list.add(0, arr[j]);
            for(int j=i;j<N;j++){
                if(arr[i-1] < list.get(j)){
                    Collections.swap(list, j, i-1);
                    break;
                }
            }
            return list;
            // code here
        }

}
