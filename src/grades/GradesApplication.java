package grades;
import java.util.HashMap;
import util.Input;
//import java.util.Scanner;

public class GradesApplication {

    public static void main (String[] args){
            HashMap<String, Student> students = new HashMap<>();

            Student student1 = new Student("student1");
        System.out.println();
            students.put("CodeupStudent1",student1);
            student1.addGrade(85);
            student1.addGrade(76);
            student1.addGrade(67);
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

        //inorder to get the student usernames
        //use for loop to iterate through the HashMap key set by string type of variable
        //then print out each username

        for(String username: students.keySet()){
            System.out.print("|"+ username +"| ");

        }
        System.out.println();



        Input gradeScan = new Input();
        System.out.println("What student would you like to see more information on?");
        String userInput = gradeScan.getString();

        if(students.containsKey(userInput)) {
            Student studentInfo = students.get(userInput);
            System.out.println(studentInfo);
            System.out.println("Name: " +studentInfo.getStudentName() + " - GitHub username: " + userInput);
            System.out.println("Current Average: "+ studentInfo.getGradeAverage());
        }else {
            System.out.println("Sorry, no student found with the gihub username of \""+userInput+ "\".");
        }
        System.out.println("What student would you like to see more information on another student?");




//        System.out.println(students);
//        System.out.println(students.get("CodeupStudent2").getStudentName());
//        System.out.println(students.get("CodeupStudent3").getStudentName());
//        System.out.println(students.get("CodeupStudent4").getStudentName());







    }

}
