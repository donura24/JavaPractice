package JavaPractice.Test;

import JavaPractice._JUnit.Grader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class determineLetterGradeTest {
    @Test
    void fiftyNineEQ_F(){
        var grade = new Grader();
        assertEquals('F', grade.determineLetterGrade(59));

    }
    @Test
    void sixtyNineEQ_D(){
        var grade = new Grader();
        assertEquals('D', grade.determineLetterGrade(69));

    }
    @Test
    void seventyNineEQ_F(){
        var grade = new Grader();
        assertEquals('C', grade.determineLetterGrade(79));

    }
    @Test
    void eightyNineEQ_F(){
        var grade = new Grader();
        assertEquals('B', grade.determineLetterGrade(89));

    }
    @Test
    void ninetyNineEQ_F(){
        var grade = new Grader();
        assertEquals('A', grade.determineLetterGrade(99));

    }

}