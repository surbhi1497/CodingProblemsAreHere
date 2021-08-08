package Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class AllSubArrayWithZeroSum {
    static class Pair{
        int startIndex, endIndex;
        Pair(int a, int b){
            startIndex = a;
            endIndex = b;
        }

    }
    private static ArrayList<Pair> findAllSubArrays(int[] array, int size) {
        HashMap<Integer, ArrayList<Integer>> hm =
                new HashMap<>();
        ArrayList<Pair> output = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
            if (sum == 0)
                output.add(new Pair(0, i));
                ArrayList<Integer> temp = new ArrayList<>();
                if (hm.containsKey(sum)) {
                    temp = hm.get(sum);
                    for (int y = 0; y < temp.size(); y++)
                        output.add(new Pair(temp.get(y) + 1, i));
                }
                temp.add(i);
                hm.put(sum, temp);

            }
            return output;

    }

    static void print(ArrayList<Pair> out)
    {
        for (int i = 0; i < out.size(); i++)
        {
            Pair p = out.get(i);
            System.out.println("Subarray found from Index "
                    + p.startIndex + " to " + p.endIndex);
        }
    }

    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine().trim());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().trim().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            AllSubArrayWithZeroSum allSubArrayWithZeroSum =
                    new AllSubArrayWithZeroSum();
            ArrayList<Pair> output = allSubArrayWithZeroSum.findAllSubArrays(array, numberOfElement);
            if(output.size()==0)
                System.out.println("No such sub-arrays");
            else
                print(output);
        }
    }
}
