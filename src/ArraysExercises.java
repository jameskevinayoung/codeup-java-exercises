import java.util.Arrays;


public class ArraysExercises {

    //1.c

    //create

    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[]newPeople = Arrays.copyOf(people, people.length+1);
        newPeople[newPeople.length-1]= newPerson;

        return newPeople;
    }



    public static void main(String[] args){

    //part 1

       //part 1.a
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //comes out as [I@3545d6 meaning an array "[" of integers "I" at memory location "@3455d6";
        //you have to use the Arrays.toString() method to format the array.
        //else you won't be able to display any information.

    //part 1.b
        //use the person object generator from Person.java;
        //Create an array that holds 3 Person objects;
        //Assign a new instance of the Person class to each element.
        //Iterate through the array and print out the name of each person in the array.

        Person[] people = new Person[3];
        people[0]= new Person ("James");
        people[1]= new Person ("Kevin");
        people[2] = new Person ("Alexander");

        for(Person person: people){
            System.out.println(person.getName());}



     // part 1.c
        Person young = new Person("Young");
        Person[] fourPeople = addPerson(people,young);
        for (Person person:fourPeople){
            System.out.println(person.getName());
        }

        }








}


