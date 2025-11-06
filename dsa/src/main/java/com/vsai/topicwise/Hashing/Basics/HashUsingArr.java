package DSA.Topicwise.Hashing.Basics;

import java.util.Arrays;

public class HashUsingArr {
    static void main() {
        // idea: to experiment hashing, take another array to store the hashed values. This new array is called the hash table.
        int[] arr = {1, 2, 2, 3, 3, 7};

        int[] hashTable = new int[8];

        System.out.println("org arr: " + Arrays.toString(arr));

        // populate the hashTable
        for (int num : arr) {
            hashTable[num]++;
        }

        System.out.println("hash table: " + Arrays.toString(hashTable));

        String s = "sai";
        System.out.println(s.substring(1, 3));
    }
}
