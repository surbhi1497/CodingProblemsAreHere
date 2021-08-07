package Arrays.TopQuestions;
import java.util.*;
public class CommonElementInThreeSortedArray {
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int n3 = sc.nextInt();

                int A[] = new int[n1];
                int B[] = new int[n2];
                int C[] = new int[n3];

                for (int i = 0;i < n1;i++)
                {
                    A[i] = sc.nextInt();
                }
                for (int i = 0;i < n2;i++)
                {
                    B[i] = sc.nextInt();
                }
                for (int i = 0;i < n3;i++)
                {
                    C[i] = sc.nextInt();
                }

                CommonElementInThreeSortedArray commonElementInThreeSortedArray =
                        new CommonElementInThreeSortedArray();
                ArrayList<Integer> res = commonElementInThreeSortedArray.
                        commonElements(A, B, C, n1, n2, n3);
                if (res.size() == 0)
                {
                    System.out.print(-1);
                }
                else
                {
                    for (int i = 0;i < res.size();i++)
                    {
                        System.out.print(res.get(i) + " ");
                    }
                }
                System.out.println();
            }
        }


        ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
        {
            // code here
            ArrayList<Integer> al = new ArrayList<>();
            HashSet<Integer> hsA = new HashSet<Integer>();
            HashSet<Integer> hsB = new HashSet<Integer>();
            HashSet<Integer> hsC = new HashSet<Integer>();

            for(int i=0;i<n1;i++){
                hsA.add(A[i]);
            }

            for(int i=0;i<n2;i++){
                if(hsA.contains(B[i]))
                    hsB.add(B[i]);
            }

            for(int i=0;i<n3;i++){
                if(hsB.contains(C[i]))
                    hsC.add(C[i]);
            }

            Set<Integer> set = new TreeSet<Integer>(hsC);;
            al.addAll(set);
            return al;
        }
    }

