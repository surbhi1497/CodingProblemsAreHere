/*
Given an array arr[] and size of array is n and one another key x, and give you a segment size k.
The task is to find that the key x present in every segment of size k in arr[].
Input :
arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25}
x = 23
k = 5
Output :Yes
There are three segments and last segment is not full {21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}.
23 is present all window.
Input :arr[] = { 5, 8, 7, 12, 14, 3, 9}
x = 8
k = 2
Output : No
 */
package Arrays.TopQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyPresentInEverySegment {
    private static boolean findIfKeyPresentInSegment(int[] array, int segment, int key){
        int i=0, count=0, N=array.length;
        boolean flag = false;
        for (i = 0; i < N; i = i + segment) {
            for (int j = 0; j < segment; j++) {
                if (i + j < N && array[i + j] == key)
                    break;

                if (j == key)
                    return false;
                if (i + j >= N)
                    return false;
            }
        }
        if (i >= N)
            return true;
        else
            return flag;
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
            System.out.println("Enter the size of segment ");
            int segmentSize = Integer.parseInt(bufferedReader.readLine().trim());
            System.out.println("Enter the value of key ");
            int keyValue = Integer.parseInt(bufferedReader.readLine().trim());
            KeyPresentInEverySegment keyPresentInEverySegment =
                    new KeyPresentInEverySegment();
            boolean flag = keyPresentInEverySegment.findIfKeyPresentInSegment(array, segmentSize, keyValue);
            if(flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }


}
