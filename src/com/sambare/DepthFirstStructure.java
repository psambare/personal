package com.sambare;

/**
 * Started by: pavan
 * At: 18/2/12, 11:17 PM
 */
public class DepthFirstStructure {
    
    public static void main(String[][] args) {

        int[][] array = ArrayGenerator.generateArray();
        int rows = array.length -1;
        int columns = array[rows].length;

        Path start = new Path(rows, 0);



    }
    
    private static class Path {
        int row;
        int column;

        private Path(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }
    }
}
