package test;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

//Create a List of integer numbers. Add to the list first 'n' numbers that are multipliers of 5 (starting from 0 inclusive).
public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        out.print("n= ");
        int n = scan.nextInt();
        list(list, n);
        out.println(list.toString()
                .replaceAll("\\[", "")
                .replaceAll("]", ""));

    }

    private static boolean isFiveMultipliers(int n) {
        return n % 5 == 0;
    }

    private static void list(ArrayList<Integer> list, int n) {
        for (int index = 0; list.size() < n; index++) {
            if (isFiveMultipliers(index)) {
                list.add(index);
            }
        }
    }

}