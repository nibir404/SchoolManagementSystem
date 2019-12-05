import java.util.List;

public class School {
    private List<TeacherList> teacherLists;
    private List<StudentList> studentLists;
    private static int TotalMoneyEarned;
    private static int TotalMoneySpent;


    public School(List<TeacherList> teacherList, List<StudentList> studentList) {
        this.teacherLists = teacherList;
        this.studentLists = studentList;
        TotalMoneyEarned=0;
        TotalMoneySpent=0;
    }

    public List<TeacherList> getTeacherList() {
        return teacherLists;
    }

    public void addTeacherList(TeacherList teacherList) {
        teacherLists.add(teacherList);
    }

    public List<StudentList> getStudentList() {
        return studentLists;
    }

    public void addStudentList(StudentList studentList) {
        studentLists.add(studentList);
    }

    public int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        TotalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return TotalMoneySpent;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
       TotalMoneyEarned-=MoneySpent;
    }
}
