package selfPractise.Arrays.TopQuestions;
import java.util.*;
import java.io.*;
public class LongestConsecutiveSubsequence {

        static class FastReader{
            BufferedReader br;
            StringTokenizer st;

            public FastReader(){
                br = new BufferedReader(new InputStreamReader(System.in));
            }

            String next(){
                while (st == null || !st.hasMoreElements()){
                    try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); }
                }
                return st.nextToken();
            }

            String nextLine(){
                String str = "";
                try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); }
                return str;
            }

            Integer nextInt(){
                return Integer.parseInt(next());
            }
        }

        public static void main(String args[])
        {
            FastReader sc = new FastReader();
            PrintWriter out = new PrintWriter(System.out);
            int t = sc.nextInt();

            while(t>0)
            {
                int n = sc.nextInt();
                int a[] = new int[n];

                for(int i=0; i<n; i++)
                    a[i] = sc.nextInt();
                out.println(new LongestConsecutiveSubsequence().findLongestConseqSubseq(a, n));
                t--;
            }
            out.flush();
        }



        static int findLongestConseqSubseq(int arr[], int n)
        {
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int i=0;i<n;i++)
                hs.add(arr[i]);
            int longestSubsequence = 0, ele=0;
            for(int i=0;i<hs.size();i++){
                if(!hs.contains(arr[i]-1)){
                    int j = arr[i];
                    while (hs.contains(j))
                        j++;
                    if (longestSubsequence < j - arr[i])
                        longestSubsequence = j - arr[i];
                }
            }
            return longestSubsequence;

            // add your code here
        }

}
