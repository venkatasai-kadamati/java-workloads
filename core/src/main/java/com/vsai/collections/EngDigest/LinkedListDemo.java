package Core.CollectionTopic.EngDigest;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // Adding elements to the linkedlist
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ll.addFirst(5);
        ll.addLast(50);


        // Displaying the linkedlist
        System.out.println("linkedlist: " + ll);

        // Accessing elements
        System.out.println("First Element: " + ll.getFirst());
        System.out.println("Last Element: " + ll.getLast());
        System.out.println("Element at index 2: " + ll.get(2));

        // Removing elements
        System.out.println("Removing first element: " + ll.removeFirst());
        System.out.println("Removing last element: " + ll.removeLast());
        System.out.println("Removing element at index 1: " + ll.remove(1));
        ll.removeIf((e) -> e > 30);

        System.out.println("linkedlist: " + ll);

        // removeAll method
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant", "Lion"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println("Animals after removal: " + animals);

        // clear method
        animals.clear();
        System.out.println("Animals after clearing: " + animals);
    }
}
