package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    Map<String, List<String>> adjlist;
    boolean isDirected;
    // Constructor
    Graph(boolean b) {
        adjlist = new HashMap();
        this.isDirected=b;
    }

    // Edge add karna
 // boolean return karo
    boolean addEdge(String v1, String v2) {
        adjlist.putIfAbsent(v1, new ArrayList());
        adjlist.putIfAbsent(v2, new ArrayList());

        if (!adjlist.get(v1).contains(v2)) {
            adjlist.get(v1).add(v2);
            if (!isDirected) {
                adjlist.get(v2).add(v1);
            }
            return true;   // ✅ edge add hui
        }
        return false;  // ❌ already exist karti thi
    }
    
    
    // Display karna
    void display() {
        for(String k : adjlist.keySet()) {
            System.out.println(k + " " + adjlist.get(k));
        }
    }
}
