1. In simple words a lambda expression is simple way to create & define an instance of functional interface.

2. Different ways to creating & defining an instance of functional interface: 
    1. Option 1 is to create a dedicated class that implements the interface
       - Idea: Directly have a interface as reference to the class object created
       - ex: Interface obj = new class();
       - Problem: Why create a dedicated class for just one method implementation, makes less scalable
   2. Option 2 is to create an anonymous inner class
      - idea: instead of creating a new class. lets just have a inner class that gets the work done
      - problem: why rewrite details of method name & interface name when its already known through the interface reference.
   3. Option 3 is to create a lambda function
      - idea: lets just define the function to be overridden
3. To know more about about lambda's we need to understand functional interface
 - Simply they are defined using @FunctionalInterface annotation
 - These are the ones that have only 1 abstract method strictly.

4. In lambda expressions we can omit both the types and return keyword.
```java
// full typed
(int a, int b) -> { return a + b;};

// omitted
(a,b) -> a+b;
```
5. A lambda expression needs functional interface definitely.
6. More Important details on Lambda
   1. instance variable can be accessed and modified in our lambda's. In simple words any variable that belongs to the class can be easily used and modified
   2. lambda's can hold multiple statements 
   3. the variables inside a lambda can be both used and modified.
   3. any local variable outside lambda's should either be final or unchanging. Simply put, the variables defined within methods.

7. Think lambdas as inner classes. They work similarly like what they access and what they can modify.
8. Time for some intermediate concept: Method referencing
   1. Introduced in java 8. we can reference a method without running it. It is best used with functional interfaces and lambda expressions.
   2. We can reference anything method including the constructor.
      - For constructor method reference, just use "class::new"
      - For static method reference, just use "class::method"
      - For non-static method reference, just use "obj::method"
9. The idea of method reference is super simple. Just mimic/assume behaviour of existing methods.