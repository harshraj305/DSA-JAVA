package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        ArrayList<Integer> arr = new ArrayList<>();
//        System.out.println("Enter the number of elements in the array: ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            Integer x = sc.nextInt();
//            arr.add(x);
//        }

        ArrayList<Integer> arr = new ArrayList<>(List.of(2, 3, 7, 6, 4, 5));

        // sorting using recursion
        sortingUsingRecursion(arr);

        System.out.println("Sorted Array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void sortingUsingRecursion(ArrayList<Integer> arr) {

        //bc
        if (arr.isEmpty()) {
            return;
        }

        //hypothesis
        int lastElement = arr.removeLast();
        sortingUsingRecursion(arr);

        //induction
        insert(arr, lastElement);

    }

    public static void insert(ArrayList<Integer> arr, int lastElement) {

        //bc
        if (arr.isEmpty() || arr.getLast() <= lastElement) {
            arr.add(lastElement);
            return;
        }

        //hypothesis
        int val = arr.removeLast();
        insert(arr, lastElement);

        //induction
        arr.add(val);
    }
}
