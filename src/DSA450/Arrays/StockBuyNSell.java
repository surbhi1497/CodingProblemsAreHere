package DSA450.Arrays;

import selfPractise.Arrays.TopQuestions.StockBuyAndSell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Pairs{
    int start;
    int end;
}
public class StockBuyNSell {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of testcases : ");
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while (t-- > 0) {
            System.out.println("enter number of elements : ");
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            System.out.println("enter the elements ");
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            StockBuyNSell stockBuyAndSell = new StockBuyNSell();
            stockBuyAndSell.stockBuyAndSell(arr, n);

        }
    }

    public void stockBuyAndSell(int[] arr, int n) {
        if(n==1)
            return;
        int count = 0;
        List<Pairs> al = new ArrayList<>();
        int i=0;
        while(i<n-1){
            while(i<n-1 && arr[i]>=arr[i+1])
                i++;
            if(i==n-1)
                break;
            Pairs pairs = new Pairs();
            pairs.start = i++;
            while(i<n && arr[i-1]<=arr[i])
                i++;
            pairs.end = i-1;
            al.add(pairs);
            count++;
        }
        if(count==0)
            System.out.println("no possible scenerio");
        else{
            for(int x=0;x< count;x++)
                System.out.println("the possible pairs are : starting at "
                        +al.get(x).start+" and ending at "+al.get(x).end);
        }
        return;

    }
}
