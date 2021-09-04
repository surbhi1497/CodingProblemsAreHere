package selfPractise.Arrays.TopQuestions;

public class MaximumIndex {
        int naiveMaxIndexDiff(int arr[], int n)
        {
            int res = 0;
            for(int i=0;i<n-1;i++){
                int j= i+1;
                while(j<n){
                    if(arr[j]>=arr[i]){
                        res = res>(j-i)?res:(j-i);
                    }
                    j++;
                }


            }
            return res;
            // Your code here

        }
    int optimalMaxIndexDiff(int arr[], int n)
    {
        int low=0, high=n-1, ans=0, max=0;
        while(low<=high){
            if(arr[low]<=arr[high]){
                ans = high-low;
                if(ans>max)
                    max=ans;
                low = low+1;
                high = n-1;
            }
            else
                high--;
        }
        return max;
        // Your code here

    }
    }

