package org.project;

public class MassiveSort {

    public static void main(String[] args) {

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

//        BUBBLE SORT
        System.out.println("BUBBLE SORT");

        for ( int i = arr.length-1 ; i > 0 ; i--) {

            int changeIndex;

            for ( int j = 0; j < i; j++) {

                if (arr[j] < arr [j + 1]) {
                    changeIndex = arr[j];
                    arr[j] = arr [j + 1];
                    arr[j + 1] = changeIndex;
                }
            }

            System.out.println(arr[i]);
        }

//        System.out.println("Цикл While");
//        boolean isSorted = false;
//
//        int changeIndex;
//
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < arr.length-1; i++) {
//                if(arr[i] > arr[i+1]){
//                    isSorted = false;
//                    changeIndex = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = changeIndex;
//                }
//
//                System.out.println(arr[i]);
//            }
//        }
    }
}