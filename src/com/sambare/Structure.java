package com.sambare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Started by: pavan
 * At: 14/2/12, 11:01 PM
 */
public class Structure {

    static List<Path> finalPaths = new ArrayList<Path>();

    private final static int[][] array = ArrayGenerator.generateArray();


    public static void main(String[] args) {

        int rowIndex = 0;
        int columnIndex = 0;
        Path start = new Path(null, rowIndex, columnIndex, array[rowIndex][columnIndex]);
        long startTime = System.currentTimeMillis();
        
        calculateChildren(start);
        Collections.sort(finalPaths);
                
        long endTime = System.currentTimeMillis();        

        System.out.println(finalPaths.get(0) + " value :" + finalPaths.get(0).getSum());
        System.out.println("Time taken : " + (endTime - startTime));
                
    }

    private static void calculateChildren(Path path) {
        if(path.getRow() < array.length-1) {
            Path childBelow = new Path(path, path.getRow()+1, path.getColumn(), array[path.getRow()+1][path.getColumn()]);
            calculateChildren(childBelow);
            Path childDiagonal = new Path(path, path.getRow()+1, path.getColumn()+1, array[path.getRow()+1][path.getColumn()+1]);
            calculateChildren(childDiagonal);
        } else {
            finalPaths.add(path);
//            System.out.println("Path :" + path + " value :" + path.getSum());
        }

    }


    static class Path implements Comparable<Path>{
//        Path parent;
        int row;
        int column;
        int sum;

        Path(Path parent, int row, int column, int value) {
//            this.parent = parent;
            this.row = row;
            this.column = column;
            if(parent != null)
                this.sum = parent.getSum() + value;
            else
                this.sum = value;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        public int getSum() {
            return sum;
        }

        @Override
        public int compareTo(Path path) {
            return path.getSum()-this.getSum();
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
//            if(parent != null) {
//                builder.append(parent.toString());
//            }
            builder.append("{[").append(getRow()).append("][").append(getColumn()).append("]}");
            return builder.toString();
        }
    }
    
}
