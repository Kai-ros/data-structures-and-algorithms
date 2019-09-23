package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void testBreadthFirstSearch()
    {
        Graph<String> graph = new Graph<>();
        BreadthFirst<String> bfs = new BreadthFirst<>();

        Vertex<String> node1 = graph.addNode("Washington");
        Vertex<String> node2 = graph.addNode("Montana");
        Vertex<String> node3 = graph.addNode("North Dakota");

        graph.addUnDirectedEdge(node1, node2, 10);
        graph.addUnDirectedEdge(node2, node3, 5);
        graph.addUnDirectedEdge(node3, node1, 20);

        StringBuilder testString = new StringBuilder();

        for(Vertex<String> node : bfs.breadthFirstSearch(graph))
        {
            testString.append(node.value + " \n");

        }
        assertEquals(
                "string",
                "North Dakota \n" +
                        "Washington \n" +
                        "Montana \n",
                         testString.toString());
    }

    @Test
    public void testBreadthFirstSearch_EmptyGraph()
    {
        Graph<String> graph = new Graph<>();
        BreadthFirst<String> bfs = new BreadthFirst<>();

        assertEquals(
                "An empty graph should return null.",
                null,
                bfs.breadthFirstSearch(graph));
    }

    @Test
    public void testBreadthFirstSearch_SingleNode()
    {
        Graph<String> graph = new Graph<>();
        BreadthFirst<String> bfs = new BreadthFirst<>();

        Vertex<String> nodeAdded = graph.addNode("Washington");
        Vertex<String> nodeExists = bfs.breadthFirstSearch(graph).stream().findFirst().get();

        assertEquals(
                "An empty graph should return null.",
                "Washington",
                nodeExists.value);
    }
}