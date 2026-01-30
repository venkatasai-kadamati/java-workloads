package com.vsai.topics.recursion.subseq;

import java.util.ArrayList;
import java.util.List;

public class GenAllSubSequences {
    public static void main(String[] args) {
        System.out.println("starting sub-sequence recursive problem");
        int[] arr = {10, 20, 30};
        int n = arr.length;

        // arr: [10, 20, 30]
        // subsequences possible: [], [10], [20], [30], [10,20], [10,20,30], [20,30]

        // generate sub-sequences
        // idea: start from empty and then move to next and while doing that - we have 2 options -> either take or ignore.

        List<Integer> result = new ArrayList<>();
        genSubSeq(0, result, arr, n);
    }

    static void genSubSeq(int index, List<Integer> result, int[] arr, int n){
        // base case
        if(index >= n){
            // print & return
            System.out.println(result);
            return;
        }

        // take -> wear the item
        result.add(arr[index]);
        // move ahead after taking -> goal is to decide the next item choice
        genSubSeq(index+1, result, arr, n); // think as just picking the dress to try.

        // not take
        // first remove the current worn dress/item
        result.removeLast();
        // check for the next items
        genSubSeq(index +1, result, arr, n);

    }
}
