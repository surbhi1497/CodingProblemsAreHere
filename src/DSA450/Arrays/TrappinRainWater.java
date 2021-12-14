package DSA450.Arrays;

import java.util.Scanner;

public class TrappinRainWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of test cases");
        int test = scanner.nextInt();
        while(test-->0) {
            System.out.println("enter number of elements in array");
            int size = scanner.nextInt();
            int[] array = new int[size];
            for(int i=0;i<size;i++){
                array[i] = scanner.nextInt();
            }
            System.out.println("the amount of trapped water is "+getTrapppedWater(array, size));
        }
    }

    private static int getTrapppedWater(int[] array, int size) {
        int[] left = new int[size];
        int[] right = new int[size];
        int max = Integer.MIN_VALUE;
        left[0] = array[0];
        for(int i =1;i<size;i++){
            left[i] = Math.max(left[i-1], array[i]);
        }
        max = Integer.MIN_VALUE;
        right[size-1] = array[size-1];
        for(int i=size-2;i>=0;i--){
            right[i] = Math.max(right[i+1], array[i]);
        }
        int totalWater = 0;
        for(int i=0;i<size;i++){
            totalWater += Math.min(left[i], right[i]) - array[i];
        }
        return totalWater;
    }
}
