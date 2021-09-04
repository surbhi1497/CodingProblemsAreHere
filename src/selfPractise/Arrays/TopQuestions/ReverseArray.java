/*
You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
 */
package selfPractise.Arrays.TopQuestions;
import java.io.*;
import java.lang.*;

public class ReverseArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of testcases ");
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            System.out.println("if u have String press 1, else press 2");
            int flag = Integer.parseInt(read.readLine());
            if(flag==1) {
                System.out.println("Enter the string value ");
                String str = read.readLine();
                System.out.println(new ReverseArray().reverseWord(str));
            }
            else if(flag==2){
                System.out.println("Enter the element values of array ");
                String[] str = read.readLine().trim().split(" ");
                int[] arr = new int[str.length];
                for(int i=0;i< str.length;i++)
                    arr[i] = Integer.parseInt(str[i]);
                int[] result = new ReverseArray().reverseArray(arr);
                for(int i=0;i<result.length;i++)
                    System.out.print(result[i]+" ");
                System.out.println();
            }
            else
                System.out.println("please press 1 or 2 only");
        }
    }

    private int[] reverseArray(int[] arr) {
        int temp;
        for(int i=0;i< arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    public static String reverseWord(String str)
    {
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        return result;
        // Reverse the string str
    }
}

