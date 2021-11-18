package org.project;

//Program to print the duplicate elements of an array

import java.util.Scanner;

public class arrayDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите следующее значение массива: ");
            arr[i] = sc.nextInt();
        }

        //Сортировка массива

        for ( int i = arr.length-1 ; i >= 0 ; i--) {
            for ( int j = 0; j < i; j++) {
                if (arr[j] < arr [j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr [j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        //Вывод дубликатов массива
        System.out.println("Duplicates:");
        int last_index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++ ) {
                if (arr[i] == arr[j] && last_index != arr[j]) {
                    last_index = arr[j];
                    System.out.println(arr[j]);
                }
            }
        }
    }
}