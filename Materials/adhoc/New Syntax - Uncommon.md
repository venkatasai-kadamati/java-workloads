# Uncommon Java Syntax

## 1. Arrays.asList for List Creation
```java
List<String> modifiable = new ArrayList<>(Arrays.asList("e","a","cab","bob"));
```
Note: `asList` is an uncommon but useful method for creating lists.

## 2. Getting Class Name
```java
System.out.println(list.getClass().getName());
```
Returns the fully qualified class name of the object.

## 3. Converting a List into an Array
```java
// Converting a list into an array
Object[] listToArray = list.toArray();
Integer[] listToArray1 = list.toArray(new Integer[0]);
```

## 4. 