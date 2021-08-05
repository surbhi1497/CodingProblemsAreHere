/*
You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
 */
package Arrays.TopQuestions;
import java.util.*;
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
            System.out.println("Enter the string value ");
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
class Reverse
{
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

