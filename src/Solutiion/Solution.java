package Solutiion;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double startTime = System.nanoTime();
        boolean result = polyndrome(str, 0, 0);
        if (result) {
            System.out.println("The string is polyndrome");

        }
        if (!result) {
            System.out.println("The string is not polyndrome");
        }
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Time taken: " + duration + " mls");
    }

    public static boolean polyndrome(String str, int start, int end) {
        if (str.length() == 1) {
            return true;
        }
        if (start == end) {
            return true;
        }
        if (start != end) {
            return false;
        }
        return polyndrome(str, start + 1, end - 1);
    }
}