package linkedlist.doublylinkedlist;

import java.util.Scanner;

public class DoublyLinkedlistImplementation {

    public static void main(String[] args) {

        DoublyLinkedlist d1 = new DoublyLinkedlist();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Doubly Linked List Menu =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    System.out.print("Enter position: ");
                    int position = sc.nextInt();
                    d1.insert(value, position);
                    break;

                case 2:
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                    d1.delete(pos);
                    break;

                case 3:
                    System.out.println("List: ");
                    d1.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}