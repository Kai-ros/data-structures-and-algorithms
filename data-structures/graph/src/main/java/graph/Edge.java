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
// https://courses.cs.washington.edu/courses/cse373/11wi/lectures/02-25/programs/Graph.java