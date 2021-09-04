package selfPractise.Arrays.TopQuestions;
import java.lang.*;
import java.io.*;

public class MinimumNumberOfJump {
        public static void main (String[] args) throws IOException
        {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            while(t-- > 0){
                int size = Integer.parseInt(br.readLine());
                String[] arrStr = ((String)br.readLine()).split("\\s+");
                int[] arr= new int[size];
                for(int i = 0;i<size;i++){
                    arr[i] = Integer.parseInt(arrStr[i]);
                }
                System.out.println(new MinimumNumberOfJump().minJumps(arr));
            }
        }

        static int minJumps(int[] arr){
            if(arr.length==1)
                return 0;
            int jump = 0, curr = 0, future=0;
            for(int i=0;i<arr.length;i++){
                future = Math.max(future, i+arr[i]);
                if(i==curr){
                    jump++;
                    curr = future;
                }
                if(curr>=arr.length-1)
                    break;
            }
            if(curr<arr.length-1)
                return -1;
            return jump;
            // your code here
        }

}
