package Arrays;
/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    public static void twoSum(int[] array, int sizeOfArray, int target){
        int[] arr = new int[2];
        Map<Integer, Integer> tempMap = new HashMap<>();
        for(int i=0;i<sizeOfArray;i++){
            Integer value = tempMap.get(target - array[i]);
            if(value == null){
                tempMap.put(array[i], i);
            }
            else{
                arr[0] = value;
                arr[1] = i;
                break;
            }
        }
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter number of elements in array ");
        int numberOfElement = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the elements of array ");
        String[] temp = bufferedReader.readLine().split(" ");
        System.out.println("Enter the desired output ");
        int desiredOutput = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[numberOfElement];
        for(int i=0;i<numberOfElement;i++){
            array[i] = Integer.parseInt(temp[i]);
        }
        twoSum(array, numberOfElement, desiredOutput);


    }

}
