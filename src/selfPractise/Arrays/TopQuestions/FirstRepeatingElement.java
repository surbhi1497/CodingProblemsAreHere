package selfPractise.Arrays.TopQuestions;
/*
Given an array arr[] of size n,
find the first repeating element. The element should occurs more than once
and the index of its first occurrence should be the smallest.
Example 1:
Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
 */
import java.util.*;
public class FirstRepeatingElement {
        public static void main (String[] args) {

            //Taking input using class Scanner
            Scanner sc=new Scanner(System.in);

            //Taking total count of testcases
            int t=sc.nextInt();

            while(t-->0)
            {
                //taking total count of elements
                int n=sc.nextInt();

                //creating a new array of size n
                int arr[]=new int[n];

                //inserting elements to the array
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
                FirstRepeatingElement firstRepeatingElement =
                        new FirstRepeatingElement();
                System.out.println(firstRepeatingElement.firstRepeated(arr,n));
            }

        }

        //Function to return the position of the first repeating element.
        public static int firstRepeated(int []arr, int n)
        {
            HashSet<Integer> hs = new HashSet<Integer>();
            int min=-1;
            for(int i=n-1;i>=0;i--){
                if(hs.contains(arr[i]))
                    min = i;
                else
                    hs.add(arr[i]);
            }
            return (min==-1)?-1:min+1;
            //Your code here
        }
    }


