package Core.CollectionTopic.P2CompCmpblPQ;

// minimum priority queue example

import java.util.PriorityQueue;

class MinPQExample {
    public static void main(String[] args) {
        // ! min pq, used to solve problems of min heap.
        // priority queue stores data as a heap, and the order of storage is either natural ordering or based on comparator defined during construction.
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        // ** printing the priorityQueue
        //minPQ.forEach((val) -> System.out.println(val));
        //minPQ.forEach(System.out::println);
        for (int val : minPQ) {
            System.out.println(val);
        }

        System.out.println("============ Poll/Remove Operation ===========");
        // ** remove the top element from PQ and print
        while (!minPQ.isEmpty()) {
            System.out.println("removing from top: " + minPQ.poll());
        }
    }
}
