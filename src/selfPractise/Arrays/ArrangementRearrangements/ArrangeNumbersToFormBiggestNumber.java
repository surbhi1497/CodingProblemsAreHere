package selfPractise.Arrays.ArrangementRearrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class ArrangeNumbersToFormBiggestNumber {
    private static void formBiggestNumber(int[] array, int sizeOfArray){
        Vector<String> vector = new Vector<>();
        for(int i=0;i<sizeOfArray;i++)
            vector.add(Integer.toString(array[i]));
        Collections.sort(vector, new Comparator<String>() {
            @Override
            public int compare(String X, String Y) {
                String XY = X+Y;
                String YX = Y+X;
                return XY.compareTo(YX)>0?-1:1;
            }
        });
        Iterator it = vector.iterator();
            while(it.hasNext()) {
                System.out.print(it.next());
            }

        }

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
            ArrangeNumbersToFormBiggestNumber arrangeNumbersToFormBiggestNumber =
                    new ArrangeNumbersToFormBiggestNumber();
            arrangeNumbersToFormBiggestNumber.formBiggestNumber(array, numberOfElement);

        }
    }
        }
