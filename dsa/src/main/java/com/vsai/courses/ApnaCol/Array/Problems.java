package com.vsai.courses.ApnaCol.Array;

import java.util.ArrayList;
import java.util.List;

public class Problems {
    public static void main(String[] args) {
        // int[] arr = {2, 4, 6, 8, 10};
        int[] arr = {1, -2, 6, -1, 3};

        // ! question 1: pairs in an array
        // to find total pairs: n*(n-1)/2
        // printPairs(arr);

        // ! question 2: print subarrays
        // to find total subarrays: n*(n+1)/2
        // printSubarrays(arr);

        // ! question 3: maximum subarray sum
        // ? brute force - using 3 loops
        maxSubarraySumBrute(arr);

        // ? better - using a prefix sum
        // maxSubarraySumBetter(arr);
    }

    // func: Brute - largest subarry in a given array
    public static void maxSubarraySumBrute(int[] arr){
        int maxSubarray = Integer.MIN_VALUE;
        for(int i =0 ; i < arr.length; i++){
            int start = i;
            for(int j= i; j < arr.length; j++){
                int end = j;
                int currSum = 0;
                for(int k = start; k <= end; k++){
                    currSum += arr[k];
                    maxSubarray = Math.max(maxSubarray, currSum);
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("Maximum Subarray Length: " + maxSubarray);
    }

    // func: Better - largest subarry in a given array
    public static void maxSubarraySumBetter(int[] arr){
        // idea: create a prefix sum array
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
    }

    // func: print subarrays in a given array
    public static void printSubarrays(int[] arr){
        List<List<Integer>> subarrayList = new ArrayList<>();


        for(int i = 0 ; i < arr.length; i++){
            // curr - 2 4 6 8 10
            List<Integer> currList = new ArrayList<>();
            for(int j = i ; j < arr.length; j++){
                // curr - 2 4 6 8 10
                currList.add(arr[j]);
                subarrayList.add(new ArrayList<>(currList));
            }
        }
        System.out.println(subarrayList);

        // ** an alternative solution is to use 3 loops i (start), j (end), k (iterate)
    }

    // func: print pairs available in given array
    // tc: O(n2)
    public static void printPairs(int[] arr){
        int totalPairs = 0;
        for(int p1 = 0; p1 < arr.length; p1++){
            for(int p2 = p1 + 1; p2 < arr.length; p2++){
                System.out.print("(" + arr[p1] + ","+ arr[p2] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs available: "+ totalPairs);
    }
}
