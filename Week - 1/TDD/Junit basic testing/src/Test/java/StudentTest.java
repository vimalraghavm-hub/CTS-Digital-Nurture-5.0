import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student = new Student();
        System.out.println("Setup");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown");
    }

    @Test
    public void testStudentName() {

        String expected = "Vimal";

        String actual = student.getName();

        assertEquals(expected, actual);

    }
}