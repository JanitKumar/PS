package school.mangement.system;
import java.util.List;
/**
 * Many teachers and many students
 * implementing teachers and students using an arraylist   
 */

public class school {
    private List<teacher> teachers;
    private List<student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //constructor
    //list of student and teachers in the school;
    public school(List<teacher> teachers, List<student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<teacher> getTeachers() {
        return teachers;
    }

    public List<student> getStudent() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //adds a teacher to the school
    //teacher here is class
    //teachers is list
    public void addTeachers(teacher newteacher) {
       teachers.add(newteacher);
    }

    public void addStudent(student newstudent) {
        students.add(newstudent);
    }

    //adds total money earned my school and MoneyEarned is money to be added
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned+=MoneyEarned;
    }

   // adds total money spent by school which is the money by school to teachers and MoneySpent is money to be added
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned-=MoneySpent;
    }
}
