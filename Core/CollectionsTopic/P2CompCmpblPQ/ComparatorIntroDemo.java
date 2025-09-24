package Core.CollectionTopic.P2CompCmpblPQ;

import java.util.Arrays;

public class ComparatorIntroDemo {
    public static void main(String[] args) {
        Integer[] arr = {17, 3, 5, 1, 10};
        Arrays.sort(arr, (Integer val1, Integer val2) -> val2 - val1);

        System.out.println("========== printing the ============");
        System.out.println(Arrays.toString(arr));
    }
}
