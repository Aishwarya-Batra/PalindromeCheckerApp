class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    // Add character at end
    public void addLast(char data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Remove first node
    public char removeFirst() {
        if (head == null) return '\0';

        char value = head.data;
        head = head.next;
        return value;
    }

    // Remove last node
    public char removeLast() {
        if (head == null) return '\0';

        if (head.next == null) {
            char value = head.data;
            head = null;
            return value;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        char value = temp.next.data;
        temp.next = null;
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean hasOneElement() {
        return head != null && head.next == null;
    }
}

public class PalindromeCheckerapp {

    public static void main(String[] args) {

        String str = "madam";
        MyLinkedList list = new MyLinkedList();

        // Add characters to linked list
        for (int i = 0; i < str.length(); i++) {
            list.addLast(str.charAt(i));
        }

        boolean isPalindrome = true;

        while (!list.isEmpty() && !list.hasOneElement()) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}