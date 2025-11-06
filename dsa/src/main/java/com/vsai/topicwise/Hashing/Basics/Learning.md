1. Usecase: We have existing collection like HashMap and we want to create a List of all keys present in the map.

```java
// easiest way to add all keys from map to list is using constructor
List<Character> newCh = new ArrayList<>(map.keySet());
```

```java
// bad yet agreed way using for-each loop
//for(var key :map.keySet()){
//    newCh.add(key);
//}
```

```java
// using bulk addAll()
newCh.addAll(map.keySet());
```

