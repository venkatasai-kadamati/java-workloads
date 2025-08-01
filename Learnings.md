# Java Learning Notes

## 1. Java Packages
In Java, any directory with classes is a package. Never get confused (mix up) with the UI options to create package vs. directory to organize. Internally, any package created in UI (IDE) ends up as a directory in the file explorer.

## 2. Remove Method Behavior
Always remember that the standalone number in the remove method would work as an index, meaning that we need to remove the ith index element, but when passed as Integer.valueOf(3) then it means to remove the element "3"

```java
// remove using index
System.out.println(values.remove(2));

// remove using Object, remove the first occurrences of the value
System.out.println(values.remove(Integer.valueOf(3)));
```

## 3. Collection Iteration and Modification
Whenever we use any collection and try to iterate over it, ensure we separate traversal and modification. This is to avoid ConcurrentModificationException. Because when traversing, Java creates an iterator, and this iterator gets confused if we suddenly remove an element.

## 4. Array Printing
Simple statement to print an array:
```java
System.out.println(Arrays.toString(arr));
```

## 5. Collections.sort()
Collections.sort() internally does Arrays.sort()

## 6. Programming to an Interface
Program to an interface means that we in the left use the Interface as a reference, but the actual memory object is of a concrete class.
- Example: `List<Integer> list = new ArrayList<>();`
- Means that we use List as a reference and ArrayList as the actual memory
- Uses: Flexibility, encourage polymorphism.

The above pattern is super common when implementing interface and its classes.

## 7. Arrays Utility Class
Arrays.<....> - It is a utility class from java.util.Arrays, packed with static methods for working with arrays.
- Arrays.asList -> a static, generic method
- Why use asList - Concise initialization of a List in one line. Great when you need a quick, read-only or fixed-size list of constants.
- For fully mutable lists (add/remove), you can wrap it in a true ArrayList:
  ```java
  List<String> modifiable = new ArrayList<>(Arrays.asList("e","a","cab","bob"));
  ```

## 8. 