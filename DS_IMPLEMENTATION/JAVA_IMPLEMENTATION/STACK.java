import java.util.Scanner;

public class STACK {
    static int[] stack = new int[5];
    static int top = -1;

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        Boolean f=true;
        while (f==true) {
            System.out.println("\nStack operations");
            System.out.println("1.Push\n2.Pop\n3.Display");
            System.out.print("Enter the Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Enter the valid choice");
                    f=false;
            }
        }
    }

    public static void push() {
        int x;
        if (top >= 4) {
            System.out.println("Stack is overflow");
        } else {
            top++;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value to push: ");
            x = scanner.nextInt();
            stack[top] = x;
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
        } else {
            System.out.println("The popped element is " + stack[top]);
            top--;
        }
    }

    public static void display() {
        int i;
        if (top >= 0) {
            System.out.println("The stack is:");
            for (i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("The stack is empty");
        }
    }
}

