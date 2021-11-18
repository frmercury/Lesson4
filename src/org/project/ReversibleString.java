package org.project;

import java.util.Scanner;

// Write a program that outputs a reversible string

public class ReversibleString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        char[] arr = sc.next().toCharArray();

        String reverseString = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseString += arr[i];
        }
        System.out.println(reverseString);
    }
}
