package Arrays;
/*
An array is given , find if a+b+c+d=target exist, target is the value we want the 4 digits to sum upto.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] array, int target){
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        int sizeOfArray = array.length;
        if(array == null || sizeOfArray < 4)
            return result;
        Arrays.sort(array);
        int max = array[sizeOfArray-1];
        if(4 * array[0] > target || 4 * max < target)
            return result;
        int i,z;
        for(i = 0;i < sizeOfArray;i++){
            z = array[i];
            //avoid duplicates
            if(i>0 && z==array[i-1])
                continue;
            // z is too small
            if(z+3 * max <target)
                continue;
            // z is too large
            if(4*z>target)
                break;
            if(4*z==target){
                if(i+3<sizeOfArray && array[i+3]==z)
                    result.add(Arrays.asList(z,z,z,z));
                break;
            }
            threeSumForFourSum(array, target-z,i+1,sizeOfArray-1,result, z);
        }

        return result;
    }

    public static void threeSumForFourSum(int[] array, int target, int low, int high,
                                          ArrayList<List<Integer>> fourSumList, int z1){
        if(low+1 >= high)
            return;
        int max = array[high];
        if(3*array[low]>target || 3*max<target)
            return;
        int i,z;
        for(i=low;i<high-1;i++){
            z=array[i];
            //avoid duplicate
            if(i>low && z==array[i-1])
                continue;
            // z is too small
            if(z+2 * max <target)
                continue;
            // z is too large
            if(3*z>target)
                break;
            if(3*z==target){
                if(i+1<high && array[i+2]==z)
                    fourSumList.add(Arrays.asList(z1,z,z,z));
                break;
            }
            twoSumForFourSum(array, target-z,i+1,high-1,fourSumList, z1, z);
        }
    }
    public static void twoSumForFourSum(int[] array, int target, int low, int high,
                                        ArrayList<List<Integer>> fourSumList, int z1, int z2){
        if(low>=high)
            return;
        if(2*array[low]>target || 2*array[high]<target)
            return;
        int i=low,j=high,sum,x;
        while (i<j){
            sum= array[i]+array[j];
            if(sum==target){
                fourSumList.add(Arrays.asList(z1,z2,array[i],array[j]));
                x=array[i];
                while (++i<j && x==array[i]);
                    //avoid duplicate
                x=array[j];
                while(i<--j && x==array[j]);
                //avoid duplicate


            }
            if(sum<target)
                i++;
            if(sum>target)
                j--;
        }
        return;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of test cases ");
        int testNumber = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter number of elements in array ");
        int numberOfElement = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter the elements of array ");
        String[] temp = bufferedReader.readLine().split(" ");
        System.out.println("Enter the desired output ");
        int desiredOutput = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[numberOfElement];
        for (int i = 0; i < numberOfElement; i++) {
            array[i] = Integer.parseInt(temp[i]);
        }
        System.out.println(fourSum(array,desiredOutput));
    }
}
