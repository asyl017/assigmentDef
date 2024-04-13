package pascalTriangle;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(bimCoef(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int bimCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return bimCoef(n - 1, k - 1) + bimCoef(n - 1, k);
        }
    }
}
