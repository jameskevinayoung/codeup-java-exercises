package grades;
import java.util.ArrayList;

public class Student {

    //these are private properties o
    private String studentName;
    private ArrayList<Integer> grades;


    //create a student constructor that initializes that name and the grades ArrayList is initialized as an empty list

    public Student(String name) {
        this.studentName = name;

        //to initialize a new ArrayList you normally would write "ArrayList<Integer> grades = new ArrayList<>();"
        //since this constructor is non-static you use  "this." to represent this instance of the grades ArrayList
        //and continue as you would normally write initialize a new empty object;

        this.grades = new ArrayList<>();
    }

    // returns the student's name

    public String getStudentName() {

        //use this format ".getStudentName()" at the end of your Student object to get the instance of the student's name
        return studentName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){

        //use this format ".getGrade()" at the end of your Student object to get the instance of the student's name

        grades.add(grade);
    }


    // returns the average of the students grades

    public double getGradeAverage() {
//this takes a list of grades;
//to find the average we have to go through the array list and divide by array's size;
//use a variable to hold the size of your array list;

        int numberOfGrades = grades.size();

//use an Integer object to hold all of the grades, but initialize it at 0 so you can add to it as you loop through the Array List

        Integer sumOfAllGrades = 0;

//use the enhanced loop method (forEach) to iterate over the array list
        //If the array isn't empty you will add the grade to your variable;

        if(!grades.isEmpty()){
            for (Integer grade: grades){  //this is your enhanced loop aka forEach
                sumOfAllGrades += grade; //add the grade to your variable
            }
        }
        //since your Integer variable is an object; use the .doubleValue()
        //This method returns the numeric value represented by this object after conversion to type double.
        return sumOfAllGrades.doubleValue()/numberOfGrades; //
    }


    public static void main(String[] args){


        //create a student object
        //

        Student James = new Student("James");
        Student Kevin = new Student("Kevin");
        Student Alexander = new Student("Alexander");
        Student Karilynn = new Student("Karilynn");
        Student Regina = new Student("Regina");


//        ArrayList<Integer> JamesGrades = new ArrayList<>();//create a new instance of grades arrayList for a student

        //add this student's grades to the list

        //James
        James.addGrade(84);
        James.addGrade(98);
        James.addGrade(90);

        //Kevin
        Kevin.addGrade(96);
        Kevin.addGrade(98);
        Kevin.addGrade(90);

        //Alexander
        Alexander.addGrade(85);
        Alexander.addGrade(80);
        Alexander.addGrade(79);

        //Karilynn
        Karilynn.addGrade(84);
        Karilynn.addGrade(90);
        Karilynn.addGrade(92);

        //Regina
        Regina.addGrade(78);
        Regina.addGrade(67);
        Regina.addGrade(100);



        //get the student's list of grades by using the ".grades" method which returns as an array
        //get the student's average grade
        System.out.println(James.getStudentName() + ", Grades: "+James.grades+ ", GPA: "+James.getGradeAverage());
        System.out.println(Kevin.getStudentName() + ", Grades: "+Kevin.grades+ ", GPA: "+ Kevin.getGradeAverage());
        System.out.println(Alexander.getStudentName() + ", Grades: "+Alexander.grades+ ", GPA: "+Alexander.getGradeAverage());
        System.out.println(Karilynn.getStudentName() + ", Grades: "+Karilynn.grades+ ", GPA: "+Karilynn.getGradeAverage());
        System.out.println(Regina.getStudentName() + ", Grades: "+Regina.grades+ ", GPA: "+Regina.getGradeAverage());



    }


}
