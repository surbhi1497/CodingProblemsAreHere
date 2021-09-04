package selfPractise.Arrays.ArrayRotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
An array consisting of N integers is given.
There are several Right Circular Rotations of range[L..R] that we perform.
After performing these rotations, we need to find element at a given index.
 */
public class ElementAtIndexAfterNRotations {
    int findElementAtIndex(int[] array, int sizeOfArray,int[][] indices, int index, int rotation){
        for(int i=rotation-1;i>=0;i--){
            int left = indices[i][0];
            int right = indices[i][1];
            if (left <= index && right >= index) {
                if (index == left)
                    index = right;
                else
                    index--;
            }
        }
        return array[index];

        }

    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for(int t=0;t<testNumber;t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the number of rotations ");
            int rotationCount = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the indices of rotations ");
            int[][] indices = new int[rotationCount][2];
            for(int i=0;i<rotationCount;i++) {
                String[] temp = bufferedReader.readLine().split(",");
                indices[i][0] = Integer.parseInt(temp[0]);
                indices[i][1] = Integer.parseInt(temp[1]);
            }
            System.out.println("Enter the desired index :");
            int desiredIndex = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            ElementAtIndexAfterNRotations elementAtIndexAfterNRotations =
                    new ElementAtIndexAfterNRotations();
            int element = elementAtIndexAfterNRotations.findElementAtIndex(array, numberOfElement, indices, desiredIndex, rotationCount);
            System.out.println("the element is "+element);
        }
    }
}
