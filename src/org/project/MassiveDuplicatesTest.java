package org.project;

public class MassiveDuplicatesTest {

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

        int[] a = {2,2,56,2,2,576,56,7,7,2,56,1,2,1,6,8};

        for (int i = 0; i < a.length; i++) {
            if( a[Math.abs(a[i])]  > 0) {
                a[Math.abs(a[i])] = (-1) * a[Math.abs(a[i])] ;
            }//if
            else {
                System.out.println( "Duplicate numbers => " + Math.abs(a[i]));
            }//else

        }//for
    }
}