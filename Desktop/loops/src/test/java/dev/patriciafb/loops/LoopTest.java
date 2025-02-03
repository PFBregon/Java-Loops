package dev.patriciafb.loops;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class LoopTest {
    @Test
    public void TestMultiplicar() {
        int n = 5;
        List<String> result = Loop.multiplicacionTabla(n);
        assertEquals(10, result.size());

    }

    @Test
    public void TestMultiplicarCero() {
        int n = 0;
        List<String> result = Loop.multiplicacionTabla(n);
        for (int i = 1; i <= 10; i++) {
            String expected = n + " x " + i + " = 0";
            assertEquals(expected, result.get(i - 1), "La línea " + i + " es incorrecta para n=" + n);
        }
    }

}

