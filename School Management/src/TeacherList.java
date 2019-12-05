public class TeacherList {

    private int id;
    private String name;
    private int salary;
    private int salary_Earned;

    public TeacherList(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salary_Earned=0;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void recieveSalary(int  salary){
        salary_Earned+=salary;
        School.updateTotalMoneySpent(salary);
    }
}
