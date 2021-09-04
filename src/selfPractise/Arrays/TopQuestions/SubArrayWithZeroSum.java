package selfPractise.Arrays.TopQuestions;
import java.util.*;
import java.lang.*;

public class SubArrayWithZeroSum {
        public static void main (String[] args) {
            //code
            //code

            //taking input using class Scanner
            Scanner scan = new Scanner(System.in);

            //taking total number of testcases
            int t = scan.nextInt();
            while(t>0)
            {
                //taking total count of elements
                int n = scan.nextInt() ;

                //Declaring and Initializing an array of size n
                int arr[] = new int[n];

                //adding elements to the array
                for(int i = 0; i<n;i++)
                {
                    arr[i] = scan.nextInt();
                }

                t--;

                //calling the method findSum
                //and print "YES" or "NO" based on the result
                System.out.println(new SubArrayWithZeroSum().findsum(arr,n)==true?"Yes":"No");
            }
        }


        static boolean findsum(int arr[],int n)
        {
            int sum=0;
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(arr[i]==0 || sum==0 || hs.contains(sum))
                    return true;
                hs.add(sum);
            }
            return false;

            //Your code here
        }

}
