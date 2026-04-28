package graph;

import java.util.*;

public class GraphImplementation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Graph g = null;
        boolean graphBana = false;

        while (true) {
            System.out.println("\n===== GRAPH MENU =====");
            System.out.println("1. Graph banao (Directed/Undirected choose karo)");
            System.out.println("2. Edge add karo");
            System.out.println("3. Graph display karo");
            System.out.println("4. Exit");
            System.out.print("Choice do: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Graph kaisa chahiye?");
                    System.out.println("1. Directed");
                    System.out.println("2. Undirected");
                    System.out.print("Choice do: ");
                    int type = sc.nextInt();

                    if (type == 1) {
                        g = new Graph(true);
                        System.out.println("✅ Directed Graph bana!");
                    } else {
                        g = new Graph(false);
                        System.out.println("✅ Undirected Graph bana!");
                    }
                    graphBana = true;
                    break;

                case 2:
                    if (!graphBana) {
                        System.out.println("❌ Pehle Graph banao! (Option 1)");
                        break;
                    }
                    System.out.print("V1 enter karo: ");
                    String v1 = sc.next();
                    System.out.print("V2 enter karo: ");
                    String v2 = sc.next();

                    // ✅ ab result check karo
                    boolean added = g.addEdge(v1, v2);

                    if (added) {
                        System.out.println("✅ Edge add ho gayi: " + v1 + " -- " + v2);
                    } else {
                        System.out.println("⚠️ Edge already exists: " + v1 + " -> " + v2);
                    }
                    break;

                case 3:
                    if (!graphBana) {
                        System.out.println("❌ Pehle Graph banao! (Option 1)");
                        break;
                    }
                    System.out.println("\n📋 Adjacency List:");
                    g.display();
                    break;

                case 4:
                    System.out.println("👋 Bye Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Galat choice! 1-4 ke beech choose karo.");
            }
        }
    }
}