public class StudentList {
     private int id;
     private String name;
     private int grade;
     private int feePaid;
     private int fess_total;

     public StudentList(int id,String name,int grade){
         this.id=id;
         this.name=name;
         this.grade=grade;
         this.feePaid=0;
         this.fess_total=320000;

     }

     public void getGrade(int grade){
         this.grade=grade;
     }

     public void payfees(int fees){
         feePaid+=fees;
         School.updateTotalMoneyEarned(feePaid);
     }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public int getFess_total() {
        return fess_total;
    }

    public int getremainingFees(){
         return fess_total - feePaid;
    }

}
