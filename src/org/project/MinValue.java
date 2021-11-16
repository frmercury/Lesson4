package org.project;

public class MinValue {

    public static void main(String[] args) {

        int[] arr = {300, 7, 3, 8, 0, 12, -457, 923, -21};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Минимальное значение массива " + min);
    }
}