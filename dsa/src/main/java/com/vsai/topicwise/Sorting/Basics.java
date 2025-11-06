package DSA.Topicwise.Sorting;

import java.util.Arrays;

public class Basics {
    static void main() {
        int[] arr = generateArr();
        int size = arr.length;
        // print org arr:
        System.out.println("org array: "+ Arrays.toString(arr));

        // ** Iterative based
        // 1. Selection Sort
        int[] ssArr = selectionSort(arr.clone(), size);
        System.out.println("Selection Sort Output: " + Arrays.toString(ssArr));

        // 2. Bubble Sort
        int[] bsArr = bubbleSort(arr.clone(), size);
        System.out.println("Bubble Sort Output: " + Arrays.toString(bsArr));

        // 3. Insertion Sort
        int[] inSort = insertionSort(arr.clone(), size);
        System.out.println("Insertion Sort Output: " + Arrays.toString(inSort));

        // ** Recursive based
        // 1. Merge Sort
        int msArr[] = mergeSort(arr.clone(), 0, size - 1);
        System.out.println("Merge Sort Output: " + Arrays.toString(msArr));

        // 2. Quick Sort
    }

    public static int[] mergeSort(int[] arr, int start, int end){
        if(start == end){
            return new int[]{arr[start]};
        }

        int mid = (start + end)/2;

        // call left
        mergeSort(arr, start, mid);
        // call right
        mergeSort(arr, mid + 1, end);
        // merge the final
        // merge(arr, start, mid, end);
        return arr;
    }

    public static int[] insertionSort(int[] arr, int size){
        /**
            Logic:
            1. Take an element
            2. & place it in its correct order.

            Key points:
            1. Simply keep on swapping till it can be and place in right order.
            2. The inner loop would be a while type, as we don't know iteration cnt
         */

        // Tc: O(n2) - 2 loops running from n, n-1, n-2 and so
        //     -- if the array is already sorted with no swaps required - O(n)
        // Sc: O(1) - no extra memory

        // edge
        if (arr == null || size <= 1){
            return arr;
        }

        for(int i = 1 ; i < size; i++){
            int currPtr = i;

            while(currPtr > 0){
                if(arr[currPtr] <  arr[currPtr - 1]){
                    // swap operation
                    int temp = arr[currPtr];
                    arr[currPtr] = arr[currPtr - 1];
                    arr[currPtr- 1] = temp;
                }
                currPtr--;
            }
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr, int size){
        /**
         Logic:
         1. push the maximum to last
         2. by doing adjacent swaps

         Key points:
         1. last element is already sorted, traverse till size - 1
         2. Since last element is largest ignore it in the inner loop, run till size - outer
         */

        // Tc: O(n2) - 2 loops running from n, n-1, n-2 and so
        //     -- if the array is already sorted with no swaps required - O(n)
        // Sc: O(1) - no extra memory

        // edge
        if (arr == null || size <= 1) {
            return arr;
        }

        for(int i = 0; i < size - 1; i++){
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // The check now happens AFTER the inner loop completes
            // If no swaps were made in a full pass, the array is sorted.
            if (!swapped) {
                break;
            }
        }

        return arr;
    }
    // func: implements select sort
    public static int[] selectionSort(int[] arr, int size){
        /**
            Logic:
            1. select the min/max
            2. swap and move to the next

            Key points:
            1. last element is already sorted, traverse till size - 1
            2. For arr with size n, we need n-1 steps to sort
        */

        /**
            Tc: O(n2) - we have 2 loops that run completely
                -- n, n -1, n - 2, ... 1 = n * (n + 1)/2 => n2
                -- n: full array, n-1: subarray excluding 1st element and so on.
            Sc: O(1)
         */

        // edge case
        if (size <=1 || arr == null){
            return arr;
        }

        // {13, 46, 24, 52, 20, 9}
        for(int i=0 ; i < size - 1; i++){
            // consider the current index as "min"
            int minIndex = i;

            // search "min" in the remaining array
            for(int j = i + 1; j < size; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    // func: generates test array
    static int[] generateArr(){
        /*
        * 1. easy ex: {3, 1, 2}
        * 2. better ex: {13, 46, 24, 52, 20, 9}
        * 3. edge ex: {-99, -1, -10}
        * 4. better edge ex: {-20, 16, 0, -1, 40, -1}
        **/

        int[] arr = {3, 2, 4, 1, 3};
        return arr;
    }
}
