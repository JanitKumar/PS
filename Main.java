package school.mangement.system;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args){
        teacher Lizzy=new teacher(1,"Lizzy",5000);
        teacher mellisa=new teacher(4,"Mellisa",7000);
        teacher vandal=new teacher(2,"vandal",8000);

        List<teacher> teacherList=new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(mellisa);
        teacherList.add(vandal);

        student tamasha=new student(1,"tamasha",4);
        student rakshit=new student(2,"rakshit",4);
        student abby=new student(3,"abby",4);

        List<student> studentList= new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshit);
        studentList.add(abby);

        school ghs=new school(teacherList,studentList);
        tamasha.payFees(5000);
        rakshit.payFees(7000);

        System.out.println( "ghs has earned " + ghs.getTotalMoneyEarned());
        Lizzy.receiveSalary();
        System.out.println("ghs has given salary " + Lizzy.getsalary() + " and has spent and now has "+ghs.getTotalMoneyEarned());
    }
}
