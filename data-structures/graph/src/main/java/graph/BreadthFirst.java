package graph;

import java.util.*;

public class BreadthFirst <Type>
{
    public Set<Vertex<Type>> breadthFirstSearch(Graph<Type> graph)
    {
        if (graph.isEmpty())
        {
            return null;
        }
        Queue<Vertex<Type>> queue = new LinkedList<Vertex<Type>>() {};
        Set<Vertex<Type>> visitedNodes = new HashSet<>();
        Vertex<Type> startNode = graph.getNodes().get(0);

        queue.add(startNode);
        visitedNodes.add(startNode);

        while (queue.size() > 0)
        {
            Vertex<Type> currentNode = queue.remove();
            List<Edge<Type>> neighbors = graph.getNeighbors(currentNode);

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
                queue.add(neighborNode);
            }
        }
        return visitedNodes;
    }
}
