package dev.patriciafb.loops;

import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        scanner.close();

       Loop.Multiplicar(n);
    }
}
