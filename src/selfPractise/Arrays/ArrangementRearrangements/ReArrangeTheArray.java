package selfPractise.Arrays.ArrangementRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array of elements of length N, ranging from 0 to N – 1.
All elements may not be present in the array.
If the element is not present then there will be -1 present in the array.
Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 */
public class ReArrangeTheArray {
    int[] reArrange(int[] array, int size){
        for(int i=0;i<size;i++){
            if(array[i]!=-1 && array[i]!=i){
                int y = array[i];
                while(array[y]!=-1 && array[y]!=y){
                    int x = array[y];
                    array[y] = y;
                    y=x;
                }
                array[y]=y;
                if(array[i]!=i)
                    array[i] = -1;
            }
        }
        return array;
    }
    public static void main(String arg[]) throws IOException {
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
            ReArrangeTheArray reArrangeTheArray =
                    new ReArrangeTheArray();
            int[] result = reArrangeTheArray.reArrange(array, numberOfElement);
            for(int i=0;i<numberOfElement;i++)
                System.out.print(result[i]+" ");
            System.out.println();
        }

        }
}
