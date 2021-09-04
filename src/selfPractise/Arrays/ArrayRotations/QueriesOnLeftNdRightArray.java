package selfPractise.Arrays.ArrayRotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array A of N integers. There are three types of commands:


1 x : Right Circular Shift the array x times. If an array is a[0], a[1], …., a[n – 1],
then after one right circular shift the array will become a[n – 1], a[0], a[1], …., a[n – 2].

2 y : Left Circular Shift the array y times. If an array is a[0], a[1], …., a[n – 1],
then after one left circular shift the array will become a[1], …., a[n – 2], a[n – 1], a[0].

3 l r : Print the sum of all integers in the subarray a[l…r] (l and r inclusive).
Given Q queries, the task is to execute each query.
 */
public class QueriesOnLeftNdRightArray {
    private void solveQueriesWithLeftRotation(int[] array, int times){
        for(int t=0;t<times;t++){
            int temp = array[0];
            int i=0;
            for(i=0;i<array.length-1;i++)
                array[i] = array[i+1];
            array[i] = temp;
        }
        System.out.println("after left rotation the result is ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();

    }

    private void solveQueriesWithRightRotation(int[] array, int times) {
        for(int t=0;t<times;t++){
            int temp = array[array.length-1];
            int i=array.length-1;
            for(i=array.length-1;i>0;i--)
                array[i] = array[i-1];
            array[i] = temp;
        }
        System.out.println("after right rotation the result is ");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    private void solveQueriesWithSumOfArrays(int[] array, int a, int b) {
        int sum=0;
        for(int i=a;i<b;i++)
            sum+=array[i];
        System.out.println("the sum of sub-array of (a,b) is "+sum);
    }

    public static void main(String arg[]) throws IOException {
        QueriesOnLeftNdRightArray quickMultiLeftRotations =
                new QueriesOnLeftNdRightArray();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        for (int t = 0; t < testNumber; t++) {
            System.out.println("Enter number of elements in array ");
            int numberOfElement = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the elements of array ");
            String[] temp = bufferedReader.readLine().split(" ");
            int[] array = new int[numberOfElement];
            for (int i = 0; i < numberOfElement; i++)
                array[i] = Integer.parseInt(temp[i]);
            System.out.println("Enter number of queries comma separated ");
            int queryNumber = Integer.parseInt(bufferedReader.readLine());
            int[][] query = new int[queryNumber][3];
            int q=0;
            for(int i=0;i<queryNumber;i++){
                String[] queryTemp = bufferedReader.readLine().split(",");
                q = Integer.parseInt(queryTemp[0]);
                if(q==1){
                    query[i][0] = 1;
                    query[i][1] = Integer.parseInt(queryTemp[1]);
                }
                else if(q==2){
                    query[i][0] = 2;
                    query[i][1] = Integer.parseInt(queryTemp[1]);
                }
                else{
                    query[i][0] = 3;
                    query[i][1] = Integer.parseInt(queryTemp[1]);
                    query[i][2] = Integer.parseInt(queryTemp[2]);
                }
                if(query[i][0]==1)
                    quickMultiLeftRotations.solveQueriesWithRightRotation(array, query[i][1]);
                else if(query[i][0]==2)
                    quickMultiLeftRotations.solveQueriesWithLeftRotation(array, query[i][1]);
                else
                    quickMultiLeftRotations.solveQueriesWithSumOfArrays(array, query[i][1], query[i][2]);
            }


        }
    }




}
