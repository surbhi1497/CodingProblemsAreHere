package selfPractise.Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoveNegativesToFrontWithoutOrder {
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            MoveNegativesToFrontWithoutOrder moveNegativesToFrontWithoutOrder =
                    new MoveNegativesToFrontWithoutOrder();
            moveNegativesToFrontWithoutOrder.reArrange(array, numberOfElement);
            moveNegativesToFrontWithoutOrder.printList(array, numberOfElement);
        }
    }

    private void printList(int[] array, int numberOfElement) {
        for (int i=0;i<numberOfElement;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    private void reArrange(int[] array, int numberOfElement) {
        int left = 0, right = numberOfElement-1;
        while(left<=right){
            if(array[left]>0 && array[right]>0){
                right--;
            }
            else if(array[left]<0 && array[right]<0){
                left++;
            }
            else if(array[left]>0 && array[right]<0){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
            else{
                left++;
                right--;
            }
        }
    }
}
