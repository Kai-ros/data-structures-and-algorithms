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
    public HashMap< Vertex<Type>, List<Edge<Type>>> adjacencyList;

    public Graph()
    {
        this(0);
    }

    public Graph(int size)
    {
        this.size = size;
        this.adjacencyList = new HashMap<>();
    }

    public Vertex<Type> addNode(Type value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("null");
        }
        Vertex<Type> node = new Vertex<>(value);
        adjacencyList.put(node, new ArrayList<>());
        size++;

        return node;
    }


    public void addUnDirectedEdge(Vertex<Type> firstVertex, Vertex<Type> secondVertex, int weight)
    {
        addDirectedEdge(firstVertex, secondVertex, weight);
        addDirectedEdge(secondVertex, firstVertex, weight);
    }

    public void addDirectedEdge(Vertex<Type> firstVertex, Vertex<Type> secondVertex, int weight)
    {
        List<Edge<Type>> edgeList = adjacencyList.get(firstVertex);
        if (edgeList == null)
        {
            throw new IllegalArgumentException("Source vertex not in graph");
        }
        if (secondVertex == null)
        {
            throw new IllegalArgumentException("Destination vertex not in graph");
        }
        Edge<Type> newEdge = new Edge<>(weight, secondVertex);
        edgeList.add(newEdge);
    }

    public Vertex<Type> getVertex(Type value)
    {
        for(Map.Entry<Vertex<Type>, List<Edge<Type>>> vertex : adjacencyList.entrySet())
        {
            Vertex<Type> node = vertex.getKey();
            if (node.value.equals(value))
            {
                return node;
            }
        }
        return null;
    }

    public ArrayList<Vertex<Type>> getNodes()
    {
        ArrayList<Vertex<Type>> vertices = new ArrayList<>();
        for(Map.Entry< Vertex<Type>, List<Edge<Type>>> vertex : adjacencyList.entrySet())
        {
            Vertex<Type> node = vertex.getKey();
            vertices.add(node);
        }
        return  vertices;
    }

    public ArrayList<Edge<Type>> getNeighbors(Vertex<Type> vertex)
    {
        return (ArrayList) adjacencyList.get(vertex);
    }

    public int size()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return (this.size == 0) ? true : false;
    }

    public String toString()
    {
        StringBuilder outputMessage = new StringBuilder();

        for(Map.Entry< Vertex<Type>, List<Edge<Type>>> entry : adjacencyList.entrySet())
        {
            outputMessage.append("Vertex: " + entry.getKey().value + " -> \n");

            for (Edge<Type> edge : entry.getValue())
            {
                outputMessage.append("Edge: " + edge.vertex.value + ", "  +  edge.weight + " -> \n");
            }

        }
        return outputMessage.toString();
    }

    public List<Type> depthFirstSearchIterative(Vertex<Type> startNode)
    {
        if (startNode == null)
        {
            return null;
        }
        Stack<Vertex<Type>> stack = new Stack<Vertex<Type>>() {};
        List<Vertex<Type>> visitedNodes = new ArrayList<>();
        List<Type> returnList = new ArrayList<>();

        stack.push(startNode);
        visitedNodes.add(startNode);

        while (stack.size() > 0)
        {
            Vertex<Type> currentNode = stack.pop();
            List<Edge<Type>> neighbors = this.getNeighbors(currentNode);

            for (Edge<Type> neighbor : neighbors)
            {
                Vertex<Type> neighborNode = neighbor.vertex;
                if (visitedNodes.contains(neighborNode))
                {
                    continue;
                }
                else
                {
                    visitedNodes.add(neighborNode);
                }
                stack.push(neighborNode);
            }
        }
        for(Vertex<Type> node : visitedNodes)
        {
            returnList.add(node.value);
        }

        return returnList;
    }

    public List<Type> depthFirstSearchRecursiveWrapper(Vertex<Type> startNode)
    {
        if (startNode == null)
        {
            return null;
        }

        List<Vertex<Type>> visitedNodes = new ArrayList<>();
        List<Type> returnList = new ArrayList<>();

        visitedNodes.add(startNode);
        depthFirstSearchRecursive(startNode, visitedNodes);

        for(Vertex<Type> node : visitedNodes)
        {
            returnList.add(node.value);
        }

        return returnList;
    }

    public List<Vertex<Type>> depthFirstSearchRecursive(Vertex<Type> currentNode, List<Vertex<Type>> visitedNodes)
    {
        List<Edge<Type>> neighbors = this.getNeighbors(currentNode);

        for (Edge<Type> neighbor : neighbors)
        {
            Vertex<Type> neighborNode = neighbor.vertex;
            if (visitedNodes.contains(neighborNode))
            {
                continue;
            }
            else
            {
                visitedNodes.add(neighborNode);
            }
            depthFirstSearchRecursive(neighborNode, visitedNodes);
        }

        return visitedNodes;
    }
}

// Resources
// https://github.com/codefellows/seattle-java-401d5/tree/master/class-35-graphs/implementation-examples
// https://courses.cs.washington.edu/courses/cse373/11wi/lectures/02-25/programs/Graph.java