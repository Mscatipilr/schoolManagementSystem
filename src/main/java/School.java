import java.util.List;

/**
 * Many teachers, many students.
 */
public class School {


    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * adds a student to the school
     * @param student the student to be added.
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * Money paid out to teachers in form of salary
     * @param MoneySpent the money
     */
    public static void updateTotalMoneySpent(int moneySpent) {

        totalMoneyEarned -= moneySpent;
    }
}
