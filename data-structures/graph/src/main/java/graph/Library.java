/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library
{
    public static void main(String[] args)
    {
        Graph<String> graph = new Graph<>();

        Vertex<String> node1 = graph.addNode("Washington");
        Vertex<String> node2 = graph.addNode("Montana");
        Vertex<String> node3 = graph.addNode("North Dakota");

        graph.addUnDirectedEdge(node1, node2, 10);
        graph.addUnDirectedEdge(node2, node3, 5);
        graph.addUnDirectedEdge(node3, node1, 20);


        System.out.println(graph.toString());


        Vertex vertex = graph.getVertex("Washington");
        List<Edge<String>> neighbors = graph.getNeighbors(vertex);

        System.out.println("Neighbors: " + neighbors.get(0).vertex.value);
        System.out.println("Neighbors: " + neighbors.get(1).vertex.value);


        List<Vertex<String>> listOfVertices = graph.getNodes();
        System.out.println("Vertex List: " + listOfVertices.get(0).value);
        System.out.println("Vertex List: " + listOfVertices.get(1).value);
        System.out.println("Vertex List: " + listOfVertices.get(2).value);

        System.out.println("\nNothing broke.");

    }
}
