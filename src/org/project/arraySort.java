package org.project;

// Write a program that sorts an array from minimum to maximum

public class arraySort {

    public static void main(String[] args) {
        System.out.println("SELECT SORT");                       //SELECTION SORT
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < arr.length; i++) {

            int minValue = arr[i];
            int minIndex = i;
            int changeIndex;

            for ( int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
                if (i != minIndex) {
                    changeIndex = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = changeIndex;
                }

            System.out.println(arr[i]);
        }
        System.out.println("");
                                                                 //BUBBLE SORT
        System.out.println("BUBBLE SORT");

        for ( int i = arr.length-1 ; i >= 0 ; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] < arr [j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr [j + 1];
                    arr[j + 1] = swap;
                }
            }
            System.out.println(arr[i]);
        }
    }
}