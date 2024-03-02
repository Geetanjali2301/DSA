import java.util.Scanner;

public class QUEUE {
    static int[] Queue = new int[5];
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {
        int choice;
        boolean f = true;
        while (f == true) {
            System.out.println("\nQueue operations");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display");
            System.out.print("Enter the Choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    enqueue();
                    break;
                }
                case 2: {
                    dequeue();
                    break;
                }
                case 3: {
                    display();
                    break;
                }
                default: {
                    System.out.println("Enter the valid choice");
                    f = false;
                }
            }
        }
    }

    public static void enqueue() {
        int x;
        if (rear == 4) {
            System.out.println("Queue is overflow");
        } else {
            if (front == -1 && rear == -1)
                front = rear = 0;
            else
                rear++;
            System.out.print("Enter the value to insert: ");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            Queue[rear] = x;
        }
    }

    public static void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is underflow");
        } else {
            System.out.println("The dequeue element is " + Queue[front]);
            if (front == rear)
                front = rear = -1;
            else
                front++;
        }
    }

    public static void display() {
        int i;
        if (rear == -1) {
            System.out.println("The Queue is empty");
        } else {
            System.out.print("The Queue is: ");
            for (i = front; i <= rear; i++) {
                System.out.print(Queue[i] + " ");
            }
        }
    }
}


