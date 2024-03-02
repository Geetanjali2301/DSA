import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;
    Node tail;

    Node createNode(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        return newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void insertBegin(int val) {
        if (head == null) {
            head = tail = createNode(val);
        } 
        else {
            Node newNode = createNode(val);
            newNode.next = head;
            head = newNode;
        }
    }

    void insertEnd(int val) {
        if (head == null) {
            head = tail = createNode(val);
        } 
        else {
            Node newNode = createNode(val);
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertPos(int val, int pos) {
        Node temp = head;
        Node newNode = createNode(val);
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteBegin() {
        if (head == null) {
            return;
        } 
        else {
            Node temp = head;
            head = temp.next;
            temp = null;
        }
    }

    void deleteEnd() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node delNode = tail;
        temp.next = null;
        tail = temp;
        delNode = null;
    }

    void deletePos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of which the element to be deleted: ");
        int pos = scanner.nextInt();
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        Node delNode = temp.next;
        temp.next = delNode.next;
        delNode = null;
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, val, pos;
        boolean flag = true;
        while (flag) {
            System.out.println("\nEnter a choice: ");
            System.out.println("1]insert at begin");
            System.out.println("2]insert at end");
            System.out.println("3]insert at position");
            System.out.println("4]display");
            System.out.println("5]delete from begin");
            System.out.println("6]delete from end");
            System.out.println("7]delete from position");
            System.out.println("8]exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert in beginning: ");
                    val = scanner.nextInt();
                    list.insertBegin(val);
                    break;
                case 2:
                    System.out.print("Enter the value to insert at end: ");
                    val = scanner.nextInt();
                    list.insertEnd(val);
                    break;
                case 3:
                    System.out.print("Enter the value and pos to insert at any position: ");
                    val = scanner.nextInt();
                    pos = scanner.nextInt();
                    list.insertPos(val, pos);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    list.deleteBegin();
                    break;
                case 6:
                    list.deleteEnd();
                    break;
                case 7:
                    list.deletePos();
                    break;
                case 8:
                    flag = false;
                    break;
            }
        }
    }
}


