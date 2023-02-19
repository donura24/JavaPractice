package JavaPractice.Test;

import JavaPractice._JUnit.Grader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class determineLetterGradeTest {
    @Test
    void fiftyNineEQ_F() {
        var grade = new Grader();
        assertEquals('F', grade.determineLetterGrade(59));

    }

    @Test
    void sixtyNineEQ_D() {
        var grade = new Grader();
        assertEquals('D', grade.determineLetterGrade(69));

    }

    @Test
    void seventyNineEQ_C() {
        var grade = new Grader();
        assertEquals('C', grade.determineLetterGrade(79));

    }

    @Test
    void eightyNineEQ_B() {
        var grade = new Grader();
        assertEquals('B', grade.determineLetterGrade(89));

    }

    @Test
    void ninetyNineEQ_A() {
        var grade = new Grader();
        assertEquals('A', grade.determineLetterGrade(99));

    }

    @Test
    void eightyEQ_B() {
        var grade = new Grader();
        assertEquals('B', grade.determineLetterGrade(80));

    }

    @Test
    void ninetyEQ_A() {
        var grade = new Grader();
        assertEquals('A', grade.determineLetterGrade(90));

    }

    @Test
    void seventyEQ_C() {
        var grade = new Grader();
        assertEquals('C', grade.determineLetterGrade(70));

    }

    @Test
    void sixtyEQ_D() {
        var grade = new Grader();
        assertEquals('D', grade.determineLetterGrade(60));

    }

    @Test
    void zeroEQ_F() {
        var grade = new Grader();
        assertEquals('F', grade.determineLetterGrade(0));

    }

    @Test
    void negOneShouldReturnIllegalArgumentException() {
        var grade = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grade.determineLetterGrade(-1);
                });
    }

}