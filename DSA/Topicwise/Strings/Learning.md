### 1. To iterate using a for-each on String we need to convert it into a character array using toCharArray() method.

```java
//for (Character ch : s.toCharArray()) {
//    System.out.println(ch);
//}
```

----

- `for-each` works only on **arrays** or **Iterable** types (e.g., List, Set).
- `String` is **not Iterable**, so `for(Character ch : str)` ❌ doesn’t compile.

---

- `String` is a **value type**, not a collection — it represents immutable text, not a data container.
- Java’s `Iterable` interface is meant for **collections with iteration state**, which `String` doesn’t expose.
- Adding `Iterable<Character>` would create **auto-boxing overhead** (char → Character) on every iteration.

### 2. 