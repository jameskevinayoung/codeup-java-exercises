package grades;
import java.util.HashMap;
import java.util.ArrayList;

public class GradesApplication {

    public static void main (String[] args){
            HashMap<String, Student> students = new HashMap<>();

            Student student1 = new Student("student1");
            student1.addGrade(85);
            student1.addGrade(76);
            student1.addGrade(67);
            students.put("CodeupStudent1",student1);
        System.out.println(student1.getGradeAverage());

            Student student2 = new Student("student2");
            student2.addGrade(88);
            student2.addGrade(79);
            student2.addGrade(60);
        System.out.println(student2.getGradeAverage());
            students.put("CodeupStudent2",student2);

            Student student3 = new Student("student3");
            student3.addGrade(82);
            student3.addGrade(73);
            student3.addGrade(64);
        System.out.println(student3.getGradeAverage());
            students.put("CodeupStudent3",student3);


            Student student4 = new Student("student4");
            student4.addGrade(81);
            student4.addGrade(73);
            student4.addGrade(65);
        System.out.println(student4.getGradeAverage());
        students.put("CodeupStudent4",student4);








    }

}
