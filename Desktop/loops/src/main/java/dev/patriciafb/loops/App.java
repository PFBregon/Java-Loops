package dev.patriciafb.loops;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

       Loop.printMultiplicacionTabla(n);
    }
}
