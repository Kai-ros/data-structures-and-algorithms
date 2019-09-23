package graph;


public class Edge <Type>
{
    public int weight;
    public Vertex <Type> vertex;

    public Edge() {}

    public Edge(int weight, Vertex <Type> vertex)
    {
        this.weight = weight;
        this.vertex = vertex;
    }
}

// Resources
// https://github.com/codefellows/seattle-java-401d5/tree/master/class-35-graphs/implementation-examples