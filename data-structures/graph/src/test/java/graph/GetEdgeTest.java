package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest
{
    Graph<String> citiesGraph = new Graph<>();
    Graph<String> emptyGraph;
    GetEdge directFlight = new GetEdge();
    Vertex[] flightPath1;
    Vertex[] flightPath2;
    Vertex[] flightPath3;
    Vertex[] flightPath4;
    Vertex[] flightPath5;
    Vertex[] emptyFlightPath;

    @Before
    public void initData()
    {
        Vertex<String> pandora = citiesGraph.addNode("Pandora");
        Vertex<String> narnia = citiesGraph.addNode("Narnia");
        Vertex<String> arendelle = citiesGraph.addNode("Arendelle");
        Vertex<String> monstropolis = citiesGraph.addNode("Monstropolis");
        Vertex<String> metroville = citiesGraph.addNode("Metroville");
        Vertex<String> naboo = citiesGraph.addNode("Naboo");

        citiesGraph.addUnDirectedEdge(pandora, arendelle, 150);
        citiesGraph.addUnDirectedEdge(pandora, metroville, 82);
        citiesGraph.addUnDirectedEdge(arendelle, metroville, 99);
        citiesGraph.addUnDirectedEdge(arendelle, monstropolis, 42);
        citiesGraph.addUnDirectedEdge(metroville, monstropolis, 105);
        citiesGraph.addUnDirectedEdge(metroville, narnia, 37);
        citiesGraph.addUnDirectedEdge(metroville, naboo, 26);
        citiesGraph.addUnDirectedEdge(monstropolis, naboo, 73);
        citiesGraph.addUnDirectedEdge(naboo, narnia, 250);

        flightPath1 = new Vertex[] { metroville, pandora};
        flightPath2 = new Vertex[] { arendelle, monstropolis, naboo };
        flightPath3 = new Vertex[] { naboo, pandora };
        flightPath4 = new Vertex[] { narnia, arendelle, naboo };
        flightPath5 = new Vertex[] { pandora, arendelle, monstropolis, naboo, narnia };
    }

    @Test
    public void testDirectFlight()
    {
        assertEquals(
                "Successful flight paths will return a positive message and a dollar amount.",
                "The trip is possible. It will cost $82.0.",
                directFlight.directFlight(citiesGraph, flightPath1));
        assertEquals(
                "Successful flight paths will return a positive message and a dollar amount.",
                "The trip is possible. It will cost $115.0.",
                directFlight.directFlight(citiesGraph, flightPath2));
        assertEquals(
                "Successful flight paths will return a positive message and a dollar amount.",
                "The trip is possible. It will cost $515.0.",
                directFlight.directFlight(citiesGraph, flightPath5));
    }

    @Test
    public void testDirectFlight_UnsuccessfulParams()
    {
        assertEquals(
                "Unuccessful flight paths will return a neagtive message.",
                "The trip is not possible.",
                directFlight.directFlight(citiesGraph, flightPath3));
        assertEquals(
                "Unuccessful flight paths will return a neagtive message.",
                "The trip is not possible.",
                directFlight.directFlight(citiesGraph, flightPath4));
    }

    @Test
    public void testDirectFlight_EmptyParams()
    {
        assertEquals(
                "Empty params should return a null.",
                null,
                directFlight.directFlight(emptyGraph, flightPath3));
        assertEquals(
                "Empty params should return a null.",
                null,
                directFlight.directFlight(citiesGraph, emptyFlightPath));
    }
}