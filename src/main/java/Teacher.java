/**
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object.
     *
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    /**
     *
     * @return the id for the current teacher
     */
    public int getId() {
        return this.id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary() {
        return this.salary;
    }

    /**
     * Set the salary.
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salary.
     * Remove from the total money earned to school
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                + " Total salary earned so far $"
                + salaryEarned;
    }
}
