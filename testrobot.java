import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testrobot {

    @Test
    void noMovement() {
        String input = "";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Robot.finalPosition(input);

        String expectedOutput = "position is(0, 0)\nNone\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void singleMovement() {
        String input = "U";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Robot.finalPosition(input);

        String expectedOutput = "position is(0, 1)\nNorth\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void multipleMovements() {
        String input = "UDDLRL";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Robot.finalPosition(input);

        String expectedOutput = "position is(-1, -1)\nSouth\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void eastDirection() {
        String input = "RR";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Robot.finalPosition(input);

        String expectedOutput = "position is(2, 0)\nEast\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void westDirection() {
        String input = "LL";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Robot.finalPosition(input);

        String expectedOutput = "position is(-2, 0)\nWest\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}