import java.lang.reflect.Array;
import java.util.Arrays;


public class ArraysExercises {

    //1.c

    //create

    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[]newPeople = Arrays.copyOf(people, people.length+1);
        newPeople[newPeople.length-1]= newPerson;

        return newPeople;
    }

    public static int getFibSequence(int n){
        if(n <= 1){
            return n;
        }
        return getFibSequence(n-1) + getFibSequence(n-2);
    }

        //you have a method that takes in a value
        static int minCoins(int value) {
            //you have three coins that are worth 1,3,5
            int coins[] = {5, 3, 1};

            // create an array that will store coins through initial iteration; value + 1 represents the index starting at 0
            int minimumCoins[] = new int[value + 1];

            // if the given input is 0 the minimum will be 0
            minimumCoins[0] = 0;

    /**
     * Now let's iterate over the value which the minimum coins array will not have a cap.
     * so the number of slots will be equal to the value parameter.
     ___    ___     ___     ___     ___     ___     ___     ___     ___     ___     ___
    | 1 |  | 2 |   | 3 |   | 4 |   | 5 |   | 6 |   | 7 |   | 8 |   | 9 |   |10 |   |11 |
     ---    ---     ---     ---     ---     ---     ---     ---     ---     ---     ---
    | * |  | * |   | * |   | * |   | * |   | * |   | * |   | * |   | * |   | * |   | * |
     ---    ---     ---     ---     ---     ---     ---     ---     ---     ---     ---
     */
            for (int i = 1; i <= value; i++)
                minimumCoins[i] = Integer.MAX_VALUE;


            for (int i = 1; i <= value; i++) {

                // Go through all coins in the coins array
    /**
     * starting at index 0, iterate to the first index; find how many times can that coin can match the value.
     * HOw many times can coin at index 0 go into the value?  coin[0] is 5, 5 goes into value(11): 2 remainder 1
     * HOw many times can coin at index 1 go into the value?  coin[1] is 3, 3 goes into value(11): 3 with remainder of 2
     * HOw many times can coin at index 2 go into the value?  coin[2] is 1, 1 goes into value(11): 11
     * so the most number of coins you can do at each index is 2, 3, or 11; but only 1 completes the value
     */
                for (int j = 0; j < coins.length; j++)
                    //in the first index of the coins
                    if (coins[j] <= i) {

                        /**
                         * the coin at index of i - coin at index of j equals a certain amount
                         * result of i(5) - j(3) = 2
                         * if result isn't Infinity and the result + 1 is less than index of the minimum coins arra
                         */
                        int result = minimumCoins[i - coins[j]];


                        if (result != Integer.MAX_VALUE && result + 1 < minimumCoins[i]) {
                            minimumCoins[i] = result + 1;
                        }
                    }
            }
            return minimumCoins[value];
        }

        static int fibonacci(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args){

        System.out.println(getFibSequence(10));
        System.out.println(fibonacci(10));


        int Value = 6;

        System.out.println(minCoins(Value));

        //part 1
       //part 1.a
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        //comes out as [I@3545d6 meaning an array "[" of integers "I" at memory location "@3455d6";
        //you have to use the Arrays.toString() method to format the array.
        //else you won't be able to display any information.

    //part 1.b
        //use the person object generator from Person.java;
        //Create an array that holds 3 Person objects;
        //Assign a new instance of the Person class to each element.
        //Iterate through the array and print out the name of each person in the array.

//        Person[] people = new Person[3];
//        people[0]= new Person ("James");
//        people[1]= new Person ("Kevin");
//        people[2] = new Person ("Alexander");
//
//        for(Person person: people){
//            System.out.println(person.getName());}



     // part 1.c
//        Person young = new Person("Young");
//        Person[] fourPeople = addPerson(people,young);
//        for (Person person:fourPeople){
//            System.out.println(person.getName());
//        }


    }

}


