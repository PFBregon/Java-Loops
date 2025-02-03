package dev.patriciafb.loops;

import java.util.ArrayList;
import java.util.List;

public class Loop {

    public static void Multiplicar(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static List<String> multiplicacionTabla(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(n + " x " + i + " = " + (n * i));
        }
        return result;
    }
}
