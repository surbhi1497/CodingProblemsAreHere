package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

class Interval{
    int start, end;
    public Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class MergedIntervals {

    public void mergedIntervals(Interval[] array, int n){
        if(n<=0)
            return;
        Stack<Interval> stack = new Stack<>();
        Arrays.sort(array, new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        stack.push(array[0]);
        for(int i=1;i<n;i++){
            Interval top = stack.peek();
            if(top.end < array[i].start)
                stack.push(array[i]);
            if(top.end < array[i].end){
                top.end = array[i].end;
                stack.pop();
                stack.push(top);
            }
        }
        System.out.println("the merged intervals are : ");
        while(!stack.isEmpty()){
            System.out.println(stack.peek().start+" "+stack.peek().end);
            stack.pop();
        }

        stack.push(array[0]);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of test cases : ");
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while (t-- > 0) {
            System.out.println("enter size of array : ");
            int n = Integer.parseInt(br.readLine().trim());
            Interval arr[] = new Interval[n];
            System.out.println("enter elements in pair : ");
            for (int i = 0; i < n; i++) {
            String inputLine[] = br.readLine().trim().split(" ");
                arr[i] = new Interval(Integer.parseInt(inputLine[0]), Integer.parseInt(inputLine[1]));
            }
            MergedIntervals mergedIntervals = new MergedIntervals();
            mergedIntervals.mergedIntervals(arr,n);
        }


    }

}
