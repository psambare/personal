package com.sambare;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Started by: pavan
 * At: 18/2/12, 11:38 PM
 */
public class Path {
    List<Edge> edges = new ArrayList<Edge>();

    public void addEdge(Edge edge) {
        if(edges.contains(edge)) {
            throw new IllegalArgumentException("Edge already exists in Path");
        }
        edges.add(edge);
    }

    //testing here too

    public List<Edge> getPath() {
        return edges;
    }
}
