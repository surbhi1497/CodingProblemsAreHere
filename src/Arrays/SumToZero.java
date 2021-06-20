package Arrays;
/*
Given an array of size n integers, are there three elements a,b,c in array that a+b+c=0?
Find all unique triplets in array.
Time complexity : O(n)
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumToZero {
    public static void sumToZero(int[] array, int arraySize){
        Arrays.sort(array);
        List<List<Integer>> tempList = new LinkedList<>();
        for(int i=0;i<array.length-2;i++){
            if(i==0 || (i>0 && array[i] != array[i-1])){
                int low = i+1, high = array.length-1, sum = 0 - array[i];
                while(low<high){
                    if(array[low] + array[high] == sum){
                        tempList.add(Arrays.asList(array[i], array[low], array[high]));
                        while(low<high && array[low] == array[low+1]){
                            low++;
                        }
                        while(low<high && array[high] == array[high-1]){
                            high--;
                        }
                        low++;
                        high--;
                    }
                    else if(array[low] + array[high] < sum)
                        low++;
                    else
                        high--;
                }
            }
        }

            System.out.println(tempList);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for(int t=0;t<testNumber;t++) {
        System.out.println("Enter number of elements in array ");
        int numberOfElement = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the elements of array ");
        String[] temp = bufferedReader.readLine().split(" ");
        int[] array = new int[numberOfElement];
        for (int i = 0; i < numberOfElement; i++) {
            array[i] = Integer.parseInt(temp[i]);
        }

        sumToZero(array, numberOfElement);
    }
    }
}
