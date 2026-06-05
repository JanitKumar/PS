package school.mangement.system;

public class teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    public teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public String getName(){
        return name;
    }

    public int getsalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    /*
    receive total salary
    deducts total money earned by school
     */
    public void receiveSalary(){
         salaryEarned+=salary;
         school.updateTotalMoneySpent(salary);
    }



}
