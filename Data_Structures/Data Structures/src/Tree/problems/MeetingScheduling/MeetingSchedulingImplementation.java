package Tree.problems.MeetingScheduling;

import java.time.LocalTime;
import java.util.Scanner;

public class MeetingSchedulingImplementation {

    public static void main(String[] args) {

    	MeetingSchedule tree = new MeetingSchedule();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== MEETING SCHEDULER =====");
            System.out.println("1. Add Meeting");
            System.out.println("2. Display All Meetings (Inorder)");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter meeting name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter start time (HH:MM) in 24-hour format: ");
                    LocalTime startTime = LocalTime.parse(sc.nextLine());
                    System.out.print("Enter end time (HH:MM) in 24-hour format: ");
                    LocalTime endTime = LocalTime.parse(sc.nextLine());
                    Meeting m = new Meeting(name, startTime, endTime);
                    tree.insert(m);
                    break;

                case 2:
                    tree.inorder();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}