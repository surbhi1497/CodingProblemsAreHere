package DSA450.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnionAndIntersectionOfArray {
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter number of elements in first array ");
            int numberOfElement1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array1 = new int[numberOfElement1];
            for (int i = 0; i < numberOfElement1; i++) {
                array1[i] = Integer.parseInt(temp[i]);
            }
            System.out.println("Enter number of elements in first array ");
            int numberOfElement2 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            temp = bufferedReader.readLine().split(" ");
            int[] array2 = new int[numberOfElement2];
            for (int i = 0; i < numberOfElement2; i++) {
                array2[i] = Integer.parseInt(temp[i]);
            }
            UnionAndIntersectionOfArray unionAndIntersectionOfArray =
                    new UnionAndIntersectionOfArray();
            unionAndIntersectionOfArray.findUnion(array1, array2, numberOfElement1, numberOfElement2);
            unionAndIntersectionOfArray.findIntersection(array1, array2, numberOfElement1, numberOfElement2);
        }
    }

    private void findIntersection(int[] array1, int[] array2,  int numberOfElement1, int numberOfElement2) {

    }

    private void findUnion(int[] array1, int[] array2, int numberOfElement1, int numberOfElement2) {

    }
}
