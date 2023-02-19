package JavaPractice.Test;

import JavaPractice._JUnit.SimpleCalc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalcTest {
    @Test
    void sixPlusSix() {
        var calc = new SimpleCalc();
        assertEquals(12,calc.add(6,6));
    }
    @Test
    void threePlusThree() {
        var calc = new SimpleCalc();
        assertEquals(6,calc.add(3,3));
    }

}