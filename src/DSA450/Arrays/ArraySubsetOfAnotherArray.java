package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class ArraySubsetOfAnotherArray {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0)
            {
                StringTokenizer stt = new StringTokenizer(br.readLine());

                long n = Long.parseLong(stt.nextToken());
                long m = Long.parseLong(stt.nextToken());
                long a1[] = new long[(int)(n)];
                long a2[] = new long[(int)(m)];


                String inputLine[] = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    a1[i] = Long.parseLong(inputLine[i]);
                }
                String inputLine1[] = br.readLine().trim().split(" ");
                for (int i = 0; i < m; i++) {
                    a2[i] = Long.parseLong(inputLine1[i]);
                }
                ArraySubsetOfAnotherArray arraySubsetOfAnotherArray
                         = new ArraySubsetOfAnotherArray();

                System.out.println(arraySubsetOfAnotherArray.isSubset( a1, a2, n, m));
                System.out.println(arraySubsetOfAnotherArray.anotherApproach( a1, a2, n, m));


            }
        }

    private String anotherApproach(long[] a1, long[] a2, long n, long m) {
            Map<Long, Integer> hm = new HashMap<>();
            for(int i=0;i<n;i++){
                if(!hm.containsKey(a1[i]))
                hm.put(a1[i], 1);
                else
                    hm.put(a1[i],hm.get(a1[i])+1 );
            }
            boolean flag = true;
            for(int i=0;i<m;i++){
                if(!hm.containsKey(a2[i])){
                    flag = false;
                    break;
                }
                else
                {
                    hm.put(a2[i],hm.get(a2[i])-1);
                    if(hm.get(a2[i])==0)
                        hm.remove(a2[i]);
                }
            }
        if(flag)
            return "Yes";
        return "No";

    }

    public String isSubset( long a1[], long a2[], long n, long m) {
            HashSet<Long> hs = new HashSet<Long>();
            for(int i=0;i<n;i++)
                hs.add(a1[i]);
            boolean flag = true;
            for(int i=0;i<m;i++){
                if(!hs.contains(a2[i])){
                    flag = false;
                    break;
                }
            }
            if(flag)
                return "Yes";
            return "No";

        }


}
