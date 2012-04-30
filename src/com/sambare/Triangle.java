package com.sambare;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Started by: pavan
 * At: 18/2/12, 11:45 PM
 */
public class Triangle {
    
    private int depth;
    private Set<Coordinate> coordinates;

    private Random random = new Random();

    public Triangle(int depth) {
        this.depth = depth;
        coordinates = new HashSet<Coordinate>();
    }

    private void initCoordinates() {
        for(int row = 0; row < depth; row++) {
            for(int column = 0; column < row; column++) {
                Coordinate coordinate = new Coordinate(row, column);
                coordinate.setValue(random.nextInt(11));
                coordinates.add(coordinate);
            }
        }
    }
    
    private void addPaths() {
        for(int i=0; i<10; i++ ) {

        }
    }
}
