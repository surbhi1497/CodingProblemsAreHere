package selfPractise.Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ElementOccurNbyKtimes {
    void elementOccuringNbyKTimes(int[] array, int size, int k){

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<size;i++){
            if(!hm.containsKey(array[i]))
                hm.put(array[i], 1);
            hm.put(array[i], hm.get(array[i])+1);
            if(hm.get(array[i]) > size/k)
                System.out.print(array[i]+" ");
        }
        System.out.println();

    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine().trim());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter the number ");
            int number = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            int[] arr = new int[number];
            String[] str = bufferedReader.readLine().trim().split(" ,");
            for (int i = 0; i < number; i++)
                arr[i] = Integer.parseInt(str[i]);
            System.out.println("Enter the value of k ");
            int k = Integer.parseInt(bufferedReader.readLine());
            ElementOccurNbyKtimes elementOccurNbyKtimes =
                    new ElementOccurNbyKtimes();
            elementOccurNbyKtimes.elementOccuringNbyKTimes(arr, number, k);
        }
    }

}
