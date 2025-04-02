class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class deleteMiddleNode {
    public static Node convertArrToLL(int arr[]) {
        Node head;
        if (arr.length == 0) {
            head = null;
            return head;
        }
        head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            current = newNode;
        }
        return head;
    }
    public static void PrintLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node brute(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int mid = count / 2;
        temp = head;
        while (temp != null) {
            mid--;
            if (mid == 0) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node optimal(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow=head;
        Node fast=head;
        fast=head.next.next;
        while (fast.next!=null&& fast!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
            slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 8};
        Node head = convertArrToLL(arr);
        //head = brute(head);
        head=optimal(head);
        PrintLL(head);
    }
}
