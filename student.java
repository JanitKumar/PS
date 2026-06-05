package school.mangement.system;

/**
 * this class is responsible for keeping the track of student
 * fees status
 * id,grade
 */


public class student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;



    //constructor
    public student(int id,String name, int grade){

        feesPaid=0;
        feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //not going to alter student's name, id


    public void setGrade(int grade){
        this.grade=grade;
    }

    public void payFees(int fees){
        feesPaid+=fees;
        school.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

 public int getRemainingFees(){
        return feesTotal-feesPaid;
 }

}
