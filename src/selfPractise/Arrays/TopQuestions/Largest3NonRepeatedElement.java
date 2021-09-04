package selfPractise.Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Largest3NonRepeatedElement {
    private static void findLargestThree(int[] array, int n){
        Arrays.sort(array);
        int count=1;
        int temp = 0;
        for(int i=n-1;i>=0;i--){
            if(count<4){
                if(temp!= array[i]) {
                    System.out.print(array[i]+" ");
                    temp=array[i];
                    count++;
                }
            }
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
            Largest3NonRepeatedElement largest3NonRepeatedElement =
                    new Largest3NonRepeatedElement();
            largest3NonRepeatedElement.findLargestThree(array, numberOfElement);
            System.out.println();
        }
    }
}
