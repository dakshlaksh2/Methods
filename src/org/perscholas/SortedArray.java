package org.perscholas;

import java.util.Arrays;

public class SortedArray {


   public int[] arraySort(int[] array) {
        int[] array2 = array;
        System.out.println("The un-sorted array " + Arrays.toString(array));
      /*  Arrays.sort(array); // Big O notation - O n log(n)
        System.out.println("The sorted array " + Arrays.toString(array));*/
        return array;
    }

    public int smallestNumber(int[] array) {
        int smallNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) { // O(n)
            if (array[i] < smallNumber) {
                smallNumber = array[i];
            }
        }
        System.out.println("The smallest number = "+ smallNumber);
        return smallNumber;

    }

    public int largestNumber(int[] array) {
        int largeNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largeNumber) {
                largeNumber = array[i];
            }
        }
        System.out.println("The largest number = " +largeNumber);
        return largeNumber;
    }

    public static void main(String[] args) {
        SortedArray main = new SortedArray();
        int[] array ={4, 2, 9, 13, 1, 0};
        //int[] output = main.arraySort(input);
        main.smallestNumber(array);
        main.largestNumber(array);
    }
}
