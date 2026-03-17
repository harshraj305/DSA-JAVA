package recursion;

import java.util.List;
import java.util.Scanner;

public class SubsetOfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();


        findAllSubsets(s, "");

    }

    public static void findAllSubsets(String ip, String op) {

        //bc
        if (ip.isEmpty()) {
            System.out.print("'" + op + "'" + " ");
            return;
        }
        //hypothesis


//        String x = ip.substring(0, ip.length() - 1);
//        String op1 = "";
//        op1 += x;
////        String op2 = op;
//
//
//
////        String ip1 = ip.substring(0, ip.length()-1);
////        op1.con
//
//        String ip1 =
//        String ip2 = ip.substring(0, ip.length()-1);

        String newip = ip.substring(0, ip.length() - 1);

        String last = ip.substring(ip.length() - 1);
        String op1 = op.concat(last);
        findAllSubsets(newip, op1);

        findAllSubsets(newip, op);

        //induction
    }
}
