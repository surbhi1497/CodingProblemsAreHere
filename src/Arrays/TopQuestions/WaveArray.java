package Arrays.TopQuestions;
import java.io.*;
import java.util.*;
public class WaveArray {
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases

            while(t-->0)
            {
                int n = Integer.parseInt(br.readLine().trim());// taking size of array
                int arr[] = new int[n]; // declaring array of size n
                String inputLine[] = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++){
                    arr[i]=Integer.parseInt(inputLine[i]); // input elements of array
                }
                WaveArray waveArray = new WaveArray();

                waveArray.convertToWave(arr, n);

                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < n; i++)
                    sb.append(arr[i] + " ");

                System.out.println(sb); // print array
            }
        }
        public static void convertToWave(int arr[], int n){
            if(n%2==1){
                for(int i=0;i<n-1;){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    i = i + 2;
                }
            }
            else{
                for(int i=0;i<n;){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    i = i + 2;
                }
            }

            // Your code here

        }

    }