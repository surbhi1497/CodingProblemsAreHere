package selfPractise.Arrays.TopQuestions;
import java.io.*;
import java.util.*;
public class PlusOneToArray {
        public static void main(String args[]) throws IOException {
            BufferedReader read =
                    new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                int N = Integer.parseInt(read.readLine());

                String S[] = read.readLine().split(" ");

                ArrayList<Integer> arr = new ArrayList<>();

                for(int i=0 ; i<N ; i++)
                    arr.add(Integer.parseInt(S[i]));

                PlusOneToArray ob = new PlusOneToArray();
                ArrayList<Integer> res = ob.increment(arr,N);

                for(int i=0; i<res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            }
        }
        static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
            for(int i=N-1;i>=0;i--){
                if(arr.get(i) == 9){
                    arr.set(i,0);
                }
                else{
                    arr.set(i, arr.get(i)+1);
                    return arr;
                }
            }
            arr.add(0);
            arr.set(0,1);
            return arr;

        }
    }

