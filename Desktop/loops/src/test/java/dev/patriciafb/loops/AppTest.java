package dev.patriciafb.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class AppTest {
    @Test
    public void testApp() {
        String input = "5\n";
        System.setIn (new java.io.ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        App.main(new String[]{});

        String expectedOutput = "5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50\n";
        assertEquals(expectedOutput, baos.toString());
    }

}
