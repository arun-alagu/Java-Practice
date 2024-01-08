package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    public static void main(String[] args) {
        int numberOfVertices = 5;  // You can change the number of vertices as needed
        int numberOfEdges = 7;  // You can change the number of edges as needed

        // Assuming the edges are given in pairs (vertex1, vertex2)
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 2},
                {1, 3},
                {2, 4},
                {3, 4},
                {4, 0}
        };

        List<Integer>[] graph = new ArrayList[numberOfVertices];

        // Initialize the array of lists
        for (int i = 0; i < numberOfVertices; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < numberOfEdges; i++){
            graph[edges[i][0]].add(edges[i][1]);
        }
        int k = 0;
        for(List<Integer> g : graph)
            System.out.println((k++)+"->"+(g));

    }
}
