package Arrays.TopQuestions;
import java.io.*;
import java.util.*;
public class StockBuyAndSell {
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                int n = Integer.parseInt(br.readLine().trim());
                int A[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++){
                    A[i] = Integer.parseInt(inputLine[i]);
                }
                int p = 0;
                for(int i=0; i<n-1; i++)
                    p += Math.max(0,A[i+1]-A[i]);

                StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
                ArrayList<ArrayList<Integer> > ans = stockBuyAndSell.stockBuySell(A, n);
                if(ans.size()==0)
                    System.out.print("No Profit");
                else{
                    int c=0;
                    for(int i=0; i<ans.size(); i++)
                        c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];

                    if(c==p)
                        System.out.print(1);
                    else
                        System.out.print(0);
                }System.out.println();
            }
        }

        //Function to find the days of buying and selling stock for max profit.
        ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
            ArrayList<ArrayList<Integer>> al =
                    new ArrayList<ArrayList<Integer>>();

            int i=0;
            while(i<n-1){
                ArrayList<Integer> interval = new ArrayList<Integer>();
                while((i<n-1) && (arr[i]>=arr[i+1]))
                    i++;
                if(i==n-1)
                    break;
                interval.add(i++);
                while((i<n) && (arr[i-1]<=arr[i]))
                    i++;
                interval.add(i-1);
                al.add(interval);
            }

            return al;


            // code here
        }
    }


