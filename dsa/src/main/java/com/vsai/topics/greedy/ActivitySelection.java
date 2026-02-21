package com.vsai.topics.greedy;

public class ActivitySelection {
    public static void main(String[] args) {
        // lets have 2 arr's : start + finish
        int[] start = {0, 3, 1, 5, 5, 8};
        int[] finish = {6, 4, 2, 9, 7, 9};

        int output = countPossibleActivities(start, finish);
        System.out.println("Possible Activities: " + output);
    }

    static int countPossibleActivities(int[] start, int[] finish) {
        // Greedy Approach
        // 1. sort by finish

        return 1;
    }
}
