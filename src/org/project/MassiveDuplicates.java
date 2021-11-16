package org.project;

public class MassiveDuplicates {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите размерность массива: ");
//        int size = sc.nextInt();
//
//        int arr[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.println("Введите следующее значение массива: ");
//            arr[i] = sc.nextInt();
//        }

        int[] arr = {2,2,56,2,2,576,56,7,7,2,56,1,2,1,6,8};

        //Сортировка массива

        for ( int i = arr.length-1 ; i > 0 ; i--) {

            int changeIndex;

            for ( int j = 0; j < i; j++) {

                if (arr[j] < arr [j + 1]) {
                    changeIndex = arr[j];
                    arr[j] = arr [j + 1];
                    arr[j + 1] = changeIndex;
                }
                System.out.println(arr[i]);
            }
        }

        System.out.println("Duplicates:");

        int last_index = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++ )
                if (arr[i] == arr[j] && last_index != arr[j]) {
                    last_index = arr[j];
                    System.out.println(arr[j]);
            }
        }
    }
}