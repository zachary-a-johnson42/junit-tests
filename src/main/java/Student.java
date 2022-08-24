import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private static List<Integer> grades = new ArrayList<>();

    Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public static void addGrade(Integer grade){
        grades.add(grade);
    }

    public Integer getGradeAverage(){
        Integer counter = 0;

        for (Integer grade : this.getGrades() ) {
            counter += grade;
        }

        return counter;

    }
}
