package DSA.Topicwise.LinkedList.SinglyLL;

public class Deletions {
    static void main() {
        int[] arr = {10, 20, 30, 40, 50}; // size:  5
        //int[] arr = {10, 20, 30, 40, 50}; // size:  5

        // converting array into ll
        Node head = Basics.covertArrToLL(arr);

        // delete operations
        // 1. delete head
        //Node output = deleteHead(head);

        // 2. delete tail
        //Node output = deleteTail(head);

        // 3. delete node at position k
        // 3.a smarter (own) approach that simply stops at k-1 position
        //Node output = deletePosA1(head, 2);

        // 3.b using strivers prev node approach
        //Node output = deletePosA2(head, 6);

        // 4. delete node with value "val"
        Node output = deleteVal(head, 50);

        Basics.traverseLL(output);
    }

    private static Node deleteHead(Node head) {
        // simply move head to next
        head = head.next;
        return head;
    }

    private static Node deleteTail(Node head) {
        Node curr = head;

        // edge case
        // 1. when ll has one elem
        if (curr.next == null) {
            curr = null;
            return curr;
        }

        while (curr.next.next != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

        curr.next = null;

        return head;
    }

    private static Node deletePosA1(Node head, int k) {

        Node curr = head;
        int posTracker = 1;

        // edge case
        // 1. ll has one elem and k is 1
        // 2. ll is empty
        if (head == null || (head.next == null)) {
            return null;
        }

        while (curr != null & posTracker + 1 != k) {
            System.out.println(curr.data + " " + posTracker);
            posTracker++;
            curr = curr.next;
        }

        // remove head
        if (k == 1) {
            System.out.println("head");
            head = head.next;
        } else {  // remove other pos
            curr.next = curr.next.next;
            System.out.println("non-head");
        }

        return head;
    }

    private static Node deletePosA2(Node head, int k) {
        // edge cases
        // if head is empty (or) LL has only one element, return null
        if (head == null || head.next == null)
            return null;

        if (k == 1) {
            head = head.next;
            return head;
        }

        Node curr = head;
        int currNodePos = 1;
        Node prev = null;

        while (curr != null) {
            if (currNodePos == k) {
                prev.next = prev.next.next;
                break;
            }
            currNodePos++;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }

    private static Node deleteVal(Node head, int X) {
        // if LL is empty
        if (head == null)
            return null;

        // if element to be removed is the head node's value. then move head to next.
        if (head.data == X) {
            head = head.next;
            return head;
        }

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            // move if node's value doesn't match
            if (curr.data == X) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
