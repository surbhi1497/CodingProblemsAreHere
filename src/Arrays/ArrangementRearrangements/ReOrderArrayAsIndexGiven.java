/*
Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]”
according to given index array.
 Input:  arr[]   = [10, 11, 12];
        index[] = [1, 0, 2];
Output: arr[]   = [11, 10, 12]
        index[] = [0,  1,  2]
 */
package Arrays.ArrangementRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReOrderArrayAsIndexGiven {

    private static void firstApproach(int[] array, int[] index, int numberOfElement){
        HashMap<Integer, Integer> hashMap = new HashMap<>(numberOfElement);
        for(int i=0;i<numberOfElement;i++){
            hashMap.put(index[i], array[i]);
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        treeMap.putAll(hashMap);
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet())
            System.out.print(entry.getValue()+" ");
        System.out.println();
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet())
            System.out.print(entry.getKey()+" ");
        System.out.println();
    }

    private static void secondApproach(int[] array, int[] index, int numberOfElement){
        int temp[] = new int[numberOfElement];
        for (int i=0; i<numberOfElement; i++)
            temp[index[i]] = array[i];
        for (int i=0; i<numberOfElement; i++)
        {
            array[i]   = temp[i];
            index[i] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(index));
    }

    private static void thirdApproach(int[] array, int[] index, int numberOfElement){
        for (int i=0; i<numberOfElement; i++) {
            while (index[i] != i) {
                int oldTargetI = index[index[i]];
                char oldTargetE = (char) array[index[i]];
                array[index[i]] = array[i];
                index[index[i]] = index[i];
                index[i] = oldTargetI;
                array[i] = oldTargetE;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(index));
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter number of elements in array and index array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            System.out.println("Enter the elements of index array ");
            temp = bufferedReader.readLine().split(" ");
            int[] index = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                index[i] = Integer.parseInt(temp[i]);
            }
            ReOrderArrayAsIndexGiven reOrderArrayAsIndexGiven =
                    new ReOrderArrayAsIndexGiven();
            reOrderArrayAsIndexGiven.firstApproach(array, index, numberOfElement);
            reOrderArrayAsIndexGiven.secondApproach(array, index, numberOfElement);
            reOrderArrayAsIndexGiven.thirdApproach(array, index, numberOfElement);

        }
    }
}
