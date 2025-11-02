package DSA.Topicwise.LinkedList.SinglyLL;

// defining node class
class Node {
    int data;
    // we are trying to point and reference to the the next node
    Node next; // pointer

    // node constructor
    Node(int _data) {
        this.data = _data;
        this.next = null;
    }
}

public class Basics {
    static void main() {
        // creating our first node (head)
        //Node head = new Node(10);

        // since head is an object, printing it directly would give us raw address
        // System.out.println(head.data); // Node@8efb846

        // ! converting our existing array into linked list
        int[] arr = {10, 20, 30, 40, 50}; // size:  5

        // idea is to point the first arr element as head. and use next to continue
        // not optimal -> just for plain learning
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next = new Node(arr[3]); // overrides the previous one

        // proper way of converting array into ll
        Node LL = covertArrToLL(arr);

        traverseLL(LL);
    }

    public static Node covertArrToLL(int[] arr) {
        // iterate on the array and populate ll
        Node head = new Node(arr[0]);

        Node curr = head;
        for (int currIdx = 1; currIdx < arr.length; currIdx++) {
            // new node
            Node newNode = new Node(arr[currIdx]);
            curr.next = newNode; // to point to next, curr.next -> newNode
            curr = newNode;
        }


        return head;
    }

    // Tc: O(N), we literally just traverse the array till end
    public static void traverseLL(Node head) {
        // traversal
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;  // to move forward write curr -> curr.next
        }
        System.out.print("null");
    }
}
