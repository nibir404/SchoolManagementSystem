import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherList T1 = new TeacherList(101,"Jhonson",30000);
        TeacherList T2 = new TeacherList(102,"Shelby",35000);
        TeacherList T3 = new TeacherList(103,"Gilmour",28000);

        List<TeacherList> teacherLists = new ArrayList<>();
        teacherLists.add(T1);
        teacherLists.add(T2);
        teacherLists.add(T3);

        StudentList s1 = new StudentList(180073,"Nibirman",4);
        StudentList s2 = new StudentList(180074,"Aurther",3);
        StudentList s3 = new StudentList(180075,"Joker",0);

        List<StudentList> studentLists = new ArrayList<>();
        studentLists.add(s1);
        studentLists.add(s2);
        studentLists.add(s3);

        School sc = new School(teacherLists,studentLists);
        System.out.println("Oxford has earned $ "+sc.getTotalMoneyEarned());

        s1.payfees(30000);
        s2.payfees(27000);

        System.out.println("Oxford has earned $ "+sc.getTotalMoneyEarned());

        System.out.println("-------Making School Pay Salary-------");

        T1.recieveSalary(T1.getSalary());
        System.out.println("Oxford paid for Salary to "+T1.getName()+" and now has $"+sc.getTotalMoneyEarned());

    }
}
