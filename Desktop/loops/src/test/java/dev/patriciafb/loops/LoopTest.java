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
}
