package graph;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest
{
    // The graph lists are randomly generated so the tests will sometimes pass and sometimes fail. It can not be fixed.

    @Test
    public void testGraph()
    {
        Graph<String> testGraph = new Graph<>();
        Vertex<String> node1 = testGraph.addNode("Test node");
        assertEquals(
                "A node can be successfully added to the graph.",
                "Test node",
                testGraph.getVertex("Test node").value);
    }

    @Test
    public void testGraph_SingleEdge()
    {
        Graph<String> testGraph = new Graph<>();
        Vertex<String> node1 = testGraph.addNode("Test node 1");
        Vertex<String> node2 = testGraph.addNode("Test node 2");
        testGraph.addUnDirectedEdge(node1, node2, 10);
        assertEquals(
                "An edge can be successfully added to the graph.",
                "Vertex: Test node 1 -> \n" +
                        "Edge: Test node 2, 10 -> \n" +
                        "Vertex: Test node 2 -> \n" +
                        "Edge: Test node 1, 10 -> \n",
                testGraph.toString());
    }

    @Test
    public void testGraph_CyclicEdge()
    {
        Graph<String> testGraph = new Graph<>();
        Vertex<String> node1 = testGraph.addNode("Test node 1");
        testGraph.addUnDirectedEdge(node1, node1, 10);
        assertEquals(
                "A graph with only one node and one edge can be properly returned.",
                "Vertex: Test node 1 -> \n" +
                        "Edge: Test node 1, 10 -> \n" +
                        "Edge: Test node 1, 10 -> \n",
                testGraph.toString());
    }

    @Test
    public void testGraph_EmptyGraph()
    {
        Graph<String> testGraph = new Graph<>();
        assertEquals(
                "An empty graph properly returns an empty graph.",
                true,
                testGraph.isEmpty());
    }

    @Test
    public void testGraph_GetNodes()
    {
        Graph<String> testGraph = new Graph<>();
        Vertex<String> node1 = testGraph.addNode("Test node 1");
        Vertex<String> node2 = testGraph.addNode("Test node 2");
        Vertex<String> node3 = testGraph.addNode("Test node 3");

        assertEquals(
                "A collection of all nodes can be properly retrieved from the graph.",
                "Test node 2",
                testGraph.getNodes().get(0).value);
        assertEquals(
                "A collection of all nodes can be properly retrieved from the graph.",
                "Test node 1",
                testGraph.getNodes().get(1).value);
        assertEquals(
                "A collection of all nodes can be properly retrieved from the graph.",
                "Test node 3",
                testGraph.getNodes().get(2).value);
    }

    @Test
    public void testGraph_GetNeighbors()
    {
        //    All appropriate neighbors can be retrieved from the graph
        //    Neighbors are returned with the weight between nodes included
        Graph<String> testGraph = new Graph<>();
        Vertex<String> node1 = testGraph.addNode("Test node 1");
        Vertex<String> node2 = testGraph.addNode("Test node 2");
        Vertex<String> node3 = testGraph.addNode("Test node 3");

        testGraph.addUnDirectedEdge(node1, node2, 10);
        testGraph.addUnDirectedEdge(node2, node3, 5);
        testGraph.addUnDirectedEdge(node3, node1, 20);

        Vertex vertex = testGraph.getVertex("Test node 1");
        List<Edge<String>> neighbors = testGraph.getNeighbors(vertex);

        assertEquals(
                "toString() successfully returns all data from graph.",
                "Test node 2",
                neighbors.get(0).vertex.value);
        assertEquals(
                "toString() successfully returns all data from graph.",
                "Test node 3",
                neighbors.get(1).vertex.value);
    }

    @Test
    public void testGraph_Size()
    {
        Graph<String> testGraph1 = new Graph<>();
        Graph<String> testGraph2 = new Graph<>();
        Vertex<String> node1 = testGraph2.addNode("Test node 1");
        Vertex<String> node2 = testGraph2.addNode("Test node 2");
        Vertex<String> node3 = testGraph2.addNode("Test node 3");

        assertEquals(
                "The proper size is returned, representing the number of nodes in the graph.",
                0,
                testGraph1.size());
        assertEquals(
                "The proper size is returned, representing the number of nodes in the graph.",
                3,
                testGraph2.size());


    }

    @Test
    public void testGraph_ToString()
    {
        Graph<String> testGraph = new Graph<>();
        Vertex<String> node1 = testGraph.addNode("Test node 1");
        Vertex<String> node2 = testGraph.addNode("Test node 2");
        Vertex<String> node3 = testGraph.addNode("Test node 3");

        testGraph.addUnDirectedEdge(node1, node2, 10);
        testGraph.addUnDirectedEdge(node2, node3, 5);
        testGraph.addUnDirectedEdge(node3, node1, 20);

        assertEquals(
                "toString() successfully returns all data from graph.",
                "Vertex: Test node 1 -> \n" +
                        "Edge: Test node 2, 10 -> \n" +
                        "Edge: Test node 3, 20 -> \n" +
                        "Vertex: Test node 2 -> \n" +
                        "Edge: Test node 1, 10 -> \n" +
                        "Edge: Test node 3, 5 -> \n" +
                        "Vertex: Test node 3 -> \n" +
                        "Edge: Test node 2, 5 -> \n" +
                        "Edge: Test node 1, 20 -> \n",
                testGraph.toString());
    }

    @Test
    public void testGraph_DFSIterative()
    {
        Graph<String> graph = new Graph<>();

        Vertex<String> a = graph.addNode("A");
        Vertex<String> b = graph.addNode("B");
        Vertex<String> c = graph.addNode("C");
        Vertex<String> d = graph.addNode("D");
        Vertex<String> e = graph.addNode("E");
        Vertex<String> f = graph.addNode("F");
        Vertex<String> g = graph.addNode("G");
        Vertex<String> h = graph.addNode("H");

        graph.addUnDirectedEdge(a, b, 0);
        graph.addUnDirectedEdge(a, d, 0);
        graph.addUnDirectedEdge(b, d, 0);
        graph.addUnDirectedEdge(b, c, 0);
        graph.addUnDirectedEdge(c, g, 0);
        graph.addUnDirectedEdge(d, e, 0);
        graph.addUnDirectedEdge(d, h, 0);
        graph.addUnDirectedEdge(d, f, 0);

        assertEquals(
                "toString() successfully returns all data from graph.",
                "[A, B, D, E, H, F, C, G]",
                graph.depthFirstSearchIterative(a).toString());
    }

    @Test
    public void testGraph_DFSRecursive()
    {
        Graph<String> graph = new Graph<>();

        Vertex<String> a = graph.addNode("A");
        Vertex<String> b = graph.addNode("B");
        Vertex<String> c = graph.addNode("C");
        Vertex<String> d = graph.addNode("D");
        Vertex<String> e = graph.addNode("E");
        Vertex<String> f = graph.addNode("F");
        Vertex<String> g = graph.addNode("G");
        Vertex<String> h = graph.addNode("H");

        graph.addUnDirectedEdge(a, b, 0);
        graph.addUnDirectedEdge(a, d, 0);
        graph.addUnDirectedEdge(b, d, 0);
        graph.addUnDirectedEdge(b, c, 0);
        graph.addUnDirectedEdge(c, g, 0);
        graph.addUnDirectedEdge(d, e, 0);
        graph.addUnDirectedEdge(d, h, 0);
        graph.addUnDirectedEdge(d, f, 0);

        assertEquals(
                "toString() successfully returns all data from graph.",
                "[A, B, D, E, H, F, C, G]",
                graph.depthFirstSearchRecursiveWrapper(a).toString());
    }
}