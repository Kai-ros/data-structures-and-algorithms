package graph;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph <Type>
{
    public int size = 0;
    public List<Edge<Type>> edgeList;
    public HashMap< Vertex<Type>, List<Edge<Type>>> adjacencyList;

    public Graph() {}

    public Graph(int size)
    {
        this.size = size;
        this.edgeList = new ArrayList<>();
        this.adjacencyList = new HashMap<>();
    }

    public Vertex <Type> addNode(Type value)
    {
        Vertex<Type> node = new Vertex<>(value);
        adjacencyList.put(node, edgeList);
        size++;
        return node;
    }

    public void addUnDirectedEdge(Vertex<Type> firstVertex, Vertex<Type> secondVertex, int weight)
    {
        addDirectedEdge(firstVertex, secondVertex, weight);
        addDirectedEdge(secondVertex, firstVertex, weight);
    }

    // TODO: Fix PUT block
    public void addDirectedEdge(Vertex<Type> firstVertex, Vertex<Type> secondVertex, int weight)
    {
        adjacencyList.put(firstVertex, edgeList.add(new Edge(weight, secondVertex)));

    }

    public List<Vertex<Type>> getNodes()
    {
        List<Vertex<Type>> vertices = new ArrayList<>();
        for(Map.Entry< Vertex<Type>, List<Edge<Type>>> vertex : adjacencyList.entrySet())
        {
            Vertex<Type> node = vertex.getKey();
            vertices.add(node);
        }
        return  vertices;
    }

    public List<Edge<Type>> getNeighbors(Vertex<Type> value)
    {
        return adjacencyList.get(value);
    }

    public int size() {

        return this.size;
    }

    public String toString()
    {
        StringBuilder outputMessage = new StringBuilder();

        for(Map.Entry< Vertex<Type>, List<Edge<Type>>> vertex : adjacencyList.entrySet())
        {
            outputMessage.append("Vertex " + vertex.getKey().value + " ->");

            for (int i = 0; i < adjacencyList.size(); i++)
            {
                outputMessage.append(vertex.getKey() + "," + vertex.getValue() + " ->");
            }
        }
        return outputMessage.toString();
    }
}



// Resources
// https://github.com/codefellows/seattle-java-401d5/tree/master/class-35-graphs/implementation-examples