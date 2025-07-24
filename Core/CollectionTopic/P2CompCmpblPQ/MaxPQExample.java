package Core.CollectionTopic.P2CompCmpblPQ;

import java.util.PriorityQueue;

// Only difference b/w min and max PQ is that in maxPQ we pass a comparator during construction
class MaxPQExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b - a);

        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        // ** printing the priorityQueue
        //maxPQ.forEach((val) -> System.out.println(val));
        //maxPQ.forEach(System.out::println);
        for (int poppedVal : maxPQ) {
            //int poppedVal = maxPQ.poll();
            System.out.println(poppedVal);
        }

        // ** remove the top element from PQ and print
        while (!maxPQ.isEmpty()) {
            System.out.println("remove from top: " + maxPQ.poll());
        }
    }
}
