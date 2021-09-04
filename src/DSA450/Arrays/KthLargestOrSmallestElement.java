package DSA450.Arrays;

import java.util.*;

public class KthLargestOrSmallestElement {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array :");
        int[] arr = new int[n];
        int i=0;
        while(i<n){
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Enter the kth position :");
        int k = scanner.nextInt();

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for(i=0;i<n;i++){
            treeMap.put(arr[i], treeMap.getOrDefault(arr[i],0)+1);
        }

        System.out.println("kth largest element is :"+getKthLargest(treeMap, k));
        System.out.println("kth smallest element is :"+getKthSmallest(treeMap, k));
    }

    private static int getKthSmallest(TreeMap<Integer, Integer> treeMap, int k) {
        int freq=0;
        for(Map.Entry it : treeMap.entrySet()) {
            freq += (int) it.getValue();
            if (freq >= k)
                return (int) it.getKey();
        }
        return -1;
    }

    private static int getKthLargest(TreeMap<Integer, Integer> treeMap, int k) {
        int freq = 0;
        NavigableMap<Integer, Integer> nmap = treeMap.descendingMap();
        for (NavigableMap.Entry<Integer, Integer> entry : nmap.entrySet()) {
            freq += (int)entry.getValue();
            if(freq>=k)
                return (int)entry.getKey();
        }
        return -1;
    }
}

