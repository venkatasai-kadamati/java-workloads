package com.vsai.concepts.subarrays;

import java.util.ArrayList;
import java.util.List;

public class Iterative {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3);

        List<List<Integer>> output = genSubarrays(list);
        System.out.println(output);
    }

    private static List<List<Integer>> genSubarrays(List<Integer> arr) {

        int n = arr.size();
        List<List<Integer>> result = new ArrayList<>();

        // start index
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();

            // end index
            for (int j = i; j < n; j++) {
                temp.add(arr.get(j));          // continuous add
                result.add(new ArrayList<>(temp));
            }
        }

        return result;
    }
}