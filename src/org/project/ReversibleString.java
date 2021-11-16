package org.project;

public class ReversibleString {

    public static void main(String[] args) {

        String str = "London";
        char[] arr = str.toCharArray();

        int size = arr.length;
        while (size > 0) {
            System.out.print(arr[size-1]);
            size--;
        }
    }
}