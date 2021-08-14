package Arrays.TopQuestions;
import java.io.*;
import java.util.*;
public class MissingAndRepeatingElement {
        public static void main(String[] args) throws Exception {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                String[] str = br.readLine().split(" ");

                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(str[i]);
                }

                int[] ans = new MissingAndRepeatingElement().findTwoElement(a, n);
                System.out.println(ans[0] + " " + ans[1]);
            }
        }


        int[] findTwoElement(int arr[], int n) {
            int[] array = new int[2];
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int i=0;i<n;i++){
                if(hs.contains(arr[i]))
                    array[0] = arr[i];
                else
                    hs.add(arr[i]);
            }
            for(int i=1;i<=n;i++){
                if(!hs.contains(i)){
                    array[1] = i;
                    break;
                }
            }

            // code here
            return array;
        }

}
