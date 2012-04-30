package com.sambare;

import java.util.Random;

/**
 * Started by: pavan
 * At: 18/2/12, 11:18 PM
 */
public class ArrayGenerator {
    
    public static int[][] generateArray() {
        int[][] array;
        int dimension = 5;
        int number = 10;
        Random random = new Random();

        array = new int[dimension][dimension];
        for(int row=0; row<dimension; row++) {
            for(int column=0; column<=row; column++) {
                array[row][column] = random.nextInt(11);
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
        return array;
    }
    
    public static void main(String[] args) {
        generateArray();
    }
}
