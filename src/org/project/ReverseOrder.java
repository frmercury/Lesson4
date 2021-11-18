package org.project;

//Program to print the elements of an array in reverse order

public class ReverseOrder {

    public static void main(String[] args) {

        String[] arr = new String[] {"one", "two", "three", "four"};
        int size = arr.length;
        while (size > 0) {
            System.out.println(arr[size-1]);
            size--;
        }
    }
}
