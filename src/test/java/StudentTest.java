import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class StudentTest {
    Student zach = new Student(0123, "Zach");

    @Test
    public void getID(){
        assertEquals(0123, zach.getId());
    }

    @Test
    public void getName(){
        assertEquals("Zach",zach.getName());
    }

    @Test
    public void addGrade(){
        Integer actual = 88;
        zach.addGrade(88);
        assertEquals(actual, zach.getGrades().get(0));
    }

    @Test
    public void getGrades(){
    zach.addGrade(10);
    zach.addGrade(22);
    zach.addGrade(77);

    List<Integer> testList = new ArrayList<>();
    testList.add(10);
    testList.add(22);
    testList.add(77);

    assertEquals(testList, zach.getGrades());
    }

    @Test
    public void getGradeAverage(){
        zach.addGrade(80);
        zach.addGrade(100);
        Integer actual = 90;

        assertEquals(actual, zach.getGradeAverage() / zach.getGrades().size());
    }
}
