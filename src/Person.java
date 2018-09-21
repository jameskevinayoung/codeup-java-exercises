import java.util.Scanner;

public class Person {
//PART 1


    private String name;//private string

    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName(){
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name){ //this is talking to an instance (because it's void), but is changing a value
        this.name = name;
    }
    // prints a message to the console using the person's name

    public void sayHello(){//this is talking to an instance and doesn't have a return
        System.out.println("Hello, "+ name);
    }

    public static void main (String[] args){

//        Scanner personScanner = new Scanner(System.in);//scanner to allow user feedback
//        System.out.println("what's your name");//ask for input
//        String name = personScanner.next();//the string type variable called 'name' is assigned to the user's feedback
//        Person person = new Person(name);//new Person object is constructed and is passed the parameter provided by the user
//
//        person.getName();//Call the name
//
//        System.out.println("What's your new name"); //ask for more input
//        name = personScanner.next(); //reuse the 'name' variable
//        person.setName(name); //call the setName method to change the name value
//        person.sayHello();//us the sayHello method to respond to this instance of the name


//      Expectation: Person 1 and 2 are .equals value,  but not the same person
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//      Result: true; same value, false; not the same person



//      Expectations: Person 1 is person 2 because person 2 was assigned the value of person 1;
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//      Result: true; Person 1 is person 2


//      Expecations: Persons 1 and 2 are the same person; person 2's name is changed ; person 1 and 2 are not the same.
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
//      Results: Persons 1 and 2 are the same person; person 2's name is changed as is person 1 because they are the same person


    }


}
