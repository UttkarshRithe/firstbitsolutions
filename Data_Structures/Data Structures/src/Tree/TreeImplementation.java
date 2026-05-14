package Tree;

import java.util.Scanner;

public class TreeImplementation {

    public static void main(String[] args) {

        Tree t = new Tree();
        Scanner sc = new Scanner(System.in);
        int choice, ele;

        while (true) {
            System.out.println("\n===== BST MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Inorder");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    ele = sc.nextInt();
                    t.insert(ele);
                    System.out.println(ele + " inserted.");
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    ele = sc.nextInt();
                    t.delete(ele);
                    System.out.println(ele + " deleted.");
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    ele = sc.nextInt();
                    if (t.search(ele))
                        System.out.println(ele + " found in tree.");
                    else
                        System.out.println(ele + " not found in tree.");
                    break;

                case 4:
                    t.inorder();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}