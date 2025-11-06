package com.vsai.topicwise.Arrays;
// Intersection of two arrays is the set of elements that are present in both arrays.

// arr1 = {1, 2, 3, 4} and arr2 = {3, 4, 5, 6} will have intersection {3, 4}.

import java.util.ArrayList;

public class Intersection0f2Arrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        System.out.println(bruteForce(arr1, arr2));
    }

    public static ArrayList<Integer> bruteForce(int[] arr1, int[] arr2) {
        ArrayList<Integer> finalIntersectionArr = new ArrayList<>();

        for (int k : arr1) {
            for (int i : arr2) {
                if (i == k) {
                    // if (finalIntersectionArr.get(arr1) )
                    finalIntersectionArr.add(k);
                }
            }

        }
        return finalIntersectionArr;
    }
}
