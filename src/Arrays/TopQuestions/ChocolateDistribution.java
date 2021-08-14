package Arrays.TopQuestions;
import java.io.*;
import java.util.*;
public class ChocolateDistribution {
        public static void main (String[] args)
        {

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0)
            {
                long n = sc.nextLong();
                ArrayList<Long> arr = new ArrayList<Long>();
                for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
                long m = sc.nextLong();

                ChocolateDistribution chocolateDistribution =
                        new ChocolateDistribution();

                System.out.println(chocolateDistribution.findMinDiff(arr,n,m));
            }

        }


        public long findMinDiff (ArrayList<Long> a, long n, long m)
        {
            Collections.sort(a);
            long min_diff = Integer.MAX_VALUE;
            int i=0;
            int j = (int)m-1;
            while(j<n)
            {
                if (min_diff > (a.get(j) - a.get(i)))
                    min_diff = a.get(j) - a.get(i);
                i++;
                j++;
            }
            return min_diff;

            // your code here
        }

}
