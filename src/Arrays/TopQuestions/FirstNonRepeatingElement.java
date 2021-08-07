package Arrays.TopQuestions;

import java.io.*;
import java.util.*;
public class FirstNonRepeatingElement {

        public static void main (String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int testcases = Integer.parseInt(br.readLine());

            while(testcases-- > 0){

                int n = Integer.parseInt(br.readLine());
                int arr[] = new int[n];


                String line = br.readLine();
                String[] elements = line.trim().split(" ");

                for(int index = 0;index < n; index++){
                    arr[index] = Integer.parseInt(elements[index]);
                }

                FirstNonRepeatingElement firstNonRepeatingElement =
                        new FirstNonRepeatingElement();

                System.out.println(firstNonRepeatingElement.firstNonRepeating(arr,n));

            }

        }

        public int firstNonRepeating(int arr[], int n)
        {
            LinkedHashMap<Integer, Integer> lhm =
                    new LinkedHashMap<Integer, Integer>();
            for(int i=0;i<n;i++){
                if(!lhm.containsKey(arr[i]))
                    lhm.put(arr[i], 1);
                lhm.put(arr[i], lhm.get(arr[i])+1);

            }
            System.out.println(lhm);
            for(Map.Entry<Integer, Integer> entry : lhm.entrySet()){
                if(entry.getValue()==1)
                    return entry.getKey();
            }
            // Complete the function
            return 0;
        }

    }



