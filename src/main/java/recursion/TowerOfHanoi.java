package recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter no. of discs on starting pole: ");
        n = sc.nextInt();

        String start = "S";
        String destination = "D";
        String helper = "H";

        solve(n, start, destination, helper);
    }

    public static void solve(int n, String start, String destination, String helper) {

        //bc
        if (n == 1) {
            System.out.println(start + " -------> " + destination);
            return;
        }

        //hypo
        solve(n-1, start, helper, destination);

        //induction
        System.out.println(start + " ------> " + destination);
        solve(n-1, helper, destination, start);
    }
}
