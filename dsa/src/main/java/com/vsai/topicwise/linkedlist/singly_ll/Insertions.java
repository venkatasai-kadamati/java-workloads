package com.vsai.topicwise.linkedlist.singly_ll;

public class Insertions {
    static void main() {
        int[] arr = {10, 20, 30, 40, 50}; // size:  5
        //int[] arr = {10, 20, 30, 40, 50}; // size:  5

        // proper way of converting array into ll
        Node head = Basics.covertArrToLL(arr);


        // delete operations
        // 1. insert at head
        //Node output = insertAtHead(head, 100);

        // 2. insert at tail
        //Node output = insertAtTail(head, 100);

        // 3. insert at pos K
        //Node output = insertPos(head, 100, 2);

        // 4. insert before value X
        Node output = insertVal(head, 100, 20);
        Basics.traverseLL(output);

    }

    private static Node insertVal(Node head, int X, int val) {
        // if LL is empty
        if (head == null) {
            return new Node(X);
        }

        // iterate
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data == val) {
                Node newNode = new Node(X);
                Node temp = curr.next;
                curr.next = newNode;
                newNode.next = temp;
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    private static Node insertPos(Node head, int X, int K) {
        // if ll is empty
        if (head == null) {
            // newNode itself is head now
            return new Node(X);
        }

        // insert at head
        if (K == 1) {
            Node newNode = new Node(X);
            newNode.next = head;
            head = newNode;
            return head;
        }
        // use a counter to keep track and when counter == k. then insert node
        int currPos = 1;
        Node curr = head;
        Node prev = null;

        // traverse till the end (linear search)
        while (curr != null) {
            if (currPos == K) {
                Node newNode = new Node(X);
                prev.next = newNode;
                newNode.next = curr;
                break;
            }
            currPos++;
            prev = curr;  // old curr will be prev
            curr = curr.next; // move forward

        }
        return head;
    }

    private static Node insertAtHead(Node head, int X) {
        // if LL is empty
        if (head == null) {
            head = new Node(X);
            return head;
        }

        Node newNode = new Node(X);
        newNode.next = head;
        head = newNode;

        return head;
    }

    private static Node insertAtTail(Node head, int X) {
        // if ll is empty
        if (head == null) {
            return new Node(X);
        }

        Node curr = head;

        // traverse till last node
        while (curr.next != null) {
            // stop completely at the last available node
            curr = curr.next;
        }

        Node newNode = new Node(X);
        // connect last node to newNode
        curr.next = newNode;

        return head;
    }
}
