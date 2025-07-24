package binarySearch;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = io();

        System.out.print("Enter the target to find: ");
        int target = sc.nextInt();

        int x = binSearch(arr, target);
        if (x != -1) System.out.println("Found on idx: " + x);
        else System.out.println("Not found idx: " + x);

    }

    public static int binSearch(int[] arr, int target) {
        int i = 0;
        int j = arr.length -1;

        while (i <= j) {
//            int mid = (i + j) /2;
            int mid = i + (j - i) /2;  // (i+j) may exceed the constraints

            if (arr[mid] < target) {
                i = mid +1;
            }
            else if (arr[mid] > target) {
                j = mid-1;
            }
            else {
                return mid;
            }
        }

        return -1;

    }

    public static int[] io() {

        Scanner sc = new Scanner(System.in);
//        int arrCustom[] = {1, 2, 4, 5, 6, 7};
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array: ");

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
