package graph;

import java.util.ArrayList;

public class GetEdge
{
    public GetEdge() {}

    public String directFlight(Graph citiesGraph, Vertex[] citiesArray)
    {
        if (citiesGraph == null || citiesArray == null)
        {
            return null;
        }

        StringBuilder outputMessage = new StringBuilder();
        boolean theTripIsPossible = false;
        double costOfTheTrip = 0.0;
        ArrayList<Edge<String>> neighbors;


        for(int i = 0; i < citiesArray.length - 1; i++)
        {
            // Grab the neighbors of each vertex.
            neighbors = citiesGraph.getNeighbors(citiesArray[i]);

            // Loop over the neighbors and determine if they are the next one in the array.
            for (Edge<String> neighbor : neighbors)
            {
                // If one of them is the next element of the array add its edge weight.
                if (neighbor.vertex.equals(citiesArray[i + 1]))
                {
                    costOfTheTrip += neighbor.weight;

                    // If the final element is reached set it to true and break from the loop.
                    if (neighbor.vertex.equals(citiesArray[citiesArray.length - 1]))
                    {
                        theTripIsPossible = true;
                        break;
                    }
                }
            }
        }

        if (theTripIsPossible)
        {
            outputMessage
                    .append("The trip is possible. It will cost $")
                    .append(costOfTheTrip + ".");
        }
        else
        {
            outputMessage
                    .append("The trip is not possible.");
        }

        return outputMessage.toString();
    }
}
