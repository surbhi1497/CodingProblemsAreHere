package selfPractise.Arrays.ArrayRotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickMultiLeftRotations {
    void findRotations(int[] array, int sizeOfArray, int noOfRotation, int[] tempArray){
        int start = noOfRotation%sizeOfArray;
        for(int i=start;i<start+sizeOfArray;i++){
            System.out.print(tempArray[i]+" ");
        }
        System.out.println();
    }
    void preprocess(int[] array, int size, int[] tempArray){
        for(int i=0;i<size;i++){
            tempArray[i] = tempArray[i+size] = array[i];
        }
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter number of times left rotation needed ");
            int leftRotationTimes = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++)
                array[i] = Integer.parseInt(temp[i]);
            QuickMultiLeftRotations quickMultiLeftRotations =
                    new QuickMultiLeftRotations();
            int[] tempArray = new int[2*numberOfElement];
            quickMultiLeftRotations.preprocess(array, numberOfElement, tempArray);
            quickMultiLeftRotations.findRotations(array, numberOfElement, leftRotationTimes, tempArray);



        }
    }


}
