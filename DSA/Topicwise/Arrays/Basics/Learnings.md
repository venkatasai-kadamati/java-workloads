### 1. We directly can't print an array.

- We need to use `Arrays.toString()` method to convert the 1d-array into a string representation.
- Similarly, for 2d-arrays, we can use `Arrays.deepToString()` method.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));    // Output: [1, 2, 3, 4, 5]

        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr2d)); // Output: [[1, 2, 3], [4, 5, 6]]
    }
}
```