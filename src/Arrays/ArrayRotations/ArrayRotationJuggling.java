package Arrays.ArrayRotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Instead of moving one by one, divide the array in different sets
where number of sets is equal to GCD of n and d and move the elements within sets.
If GCD is 1 as is for the above example array (n = 7 and d =2),
then elements will be moved within one set only, we just start with temp = arr[0]
and keep moving arr[I+d] to arr[I] and finally store temp at the right place.
Time complexity : O(n)
Auxiliary Space : O(1)
 */
public class ArrayRotationJuggling {
    void rotateArray(int[] array, int sizeOfArray, int position){
        // if position>=sizeOfArray
        position = position % sizeOfArray;
        int gcd = findGCD(sizeOfArray, position);
        int i, j, k, temp;
        for(i=0;i<gcd;i++){
            temp = array[i];
            j = i;
            while(true){
                k = j + position;
                if(k>=sizeOfArray)
                    k = k - sizeOfArray;
                if(k==i)
                    break;
                array[j] = array[k];
                j = k;

            }
            array[j] = temp;
        }
    }

    int findGCD(int a, int b){
        if(b==0)
            return a;
        return findGCD(b, a%b);

    }

    void printIt(int[] array, int sizeOfArray){
        System.out.println("the result is : ");
        for(int i=0;i<sizeOfArray;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for(int t=0;t<testNumber;t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the position till wants the array to be rotated ");
            int position = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
            ArrayRotationJuggling arrayRotationJuggling = new ArrayRotationJuggling();
            arrayRotationJuggling.rotateArray(array, numberOfElement, position);
            arrayRotationJuggling.printIt(array, numberOfElement);
        }
    }
}
