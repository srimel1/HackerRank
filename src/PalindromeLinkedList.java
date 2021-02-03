import java.util.Stack;

public class PalindromeLinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverse(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
    }

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp=temp.next;
        }
        return count;

    }


    public static void main(String args[])
    {
        /* Start with the empty list */

        push(20);
        push(4);
        push(20);


        System.out.println("Given linked list");
        print();

        head = reverse(head);

        System.out.println("Reversed Linked list");
        print();
        System.out.println(isPal(head));


    }
    static boolean isPal(Node head){
        Node temp = head;
        boolean flag = true;
        Stack<Integer> stack = new Stack<>();
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        while(head != null){
            int i = stack.pop();
            if (head.data == i) {
                flag = true;
            }else{
                flag = false;
                break;
            }
            head = head.next;
        }
        return flag;
    }
}
