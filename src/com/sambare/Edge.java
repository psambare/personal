package com.sambare;

/**
 * Represents the edge of a path
 * Started by: pavan
 * At: 19/2/12, 12:25 AM
 */
public class Edge {

    private Coordinate from;
    private Coordinate to;

    public Edge(Coordinate from, Coordinate to) {
        this.from = from;
        this.to = to;
    }

    public Coordinate getFrom() {
        return from;
    }

    public Coordinate getTo() {
        return to;
    }
}
