/*
This class is responsible for keeping track of students fees, name, id, grade.
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Create a new student by initializing.
     * Fees for every student is going to be $30,000 /year
     * Fees paid initially is 0.
     * @param id - id for the student: unique value
     * @param name - name of the student.
     * @param grade - grade level of the student.
     */
    public Student(int id, String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30_000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //Not going to alter student's name.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * i.e. feespaid = 10,000 + 5000 + 15000
     * Keep adding the fees to fees paid field. (running total)
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays (at a given time)
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade level of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
    @Override
    public String toString() {
        return "Student's name : " + name +
                " Total fees paid so far $" + feesPaid;
    }

}
