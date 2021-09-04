package selfPractise.Arrays.TopQuestions;
import java.io.*;

public class SumPairClosestToX {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine().trim());
            while (tc-- > 0) {
                String[] inputLine;
                inputLine = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int x = Integer.parseInt(inputLine[1]);
                int[] arr = new int[n];
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                SumPairClosestToX sumPairClosestToX = new SumPairClosestToX();
                int ans[] = sumPairClosestToX.sumClosest(arr, x);
                for (Integer val: ans)
                    System.out.print(val+" ");
                System.out.println();
            }
        }

        int[] sumClosest(int[] arr, int x) {
            int[] array = new int[2];
            int i=0, j=arr.length-1;
            int a=0, b=0;
            int temp = 0, diff = Integer.MAX_VALUE;
            while(j>i){
                if(Math.abs(arr[i]+arr[j] -x)<diff){
                    a=i;
                    b=j;
                    diff = Math.abs(arr[i]+arr[j] -x);
                }
                if((arr[i]+arr[j])>x)
                    j--;
                else
                    i++;


            }
            array[0] = arr[a];
            array[1] = arr[b];
            return array;
            // code here
        }

}
