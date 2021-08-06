package Arrays.TopQuestions;
import java.io.*;
import java.util.*;
public class DuplicatesInArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = sc.nextInt();
                DuplicatesInArray duplicatesInArray=
                        new DuplicatesInArray();
                ArrayList<Integer> ans = duplicatesInArray.duplicates(a, n);
                for (Integer val : ans) System.out.print(val + " ");
                System.out.println();
            }
        }

        public static ArrayList<Integer> duplicates(int arr[], int n) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            int c=1;
            for(int i=0;i<n;i++){
                int ele = arr[i]%n;
                arr[ele] = arr[ele] + n;
                if(arr[ele]/n ==2){
                    al.add(ele);
                    c=0;
                }
            }
            if(al.size()==0)
                al.add(-1);
            return al;
            // code here
        }
    }


