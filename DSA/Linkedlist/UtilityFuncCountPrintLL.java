package DSA.Linkedlist;

public class UtilityFuncCountPrintLL {

    public static int countNodes(Node head) {
        Node curr = head;

        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }


    public static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
