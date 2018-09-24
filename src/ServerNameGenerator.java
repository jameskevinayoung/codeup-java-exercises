import java.util.Random;

public class ServerNameGenerator {

    //create a method that gets a random word from a String[] as a parameters ((parameters and arguments don't have to be written the same));
    public  static String getOneAtRandom(String[] words){

        //import the random method;
        //create an integer variable that takes an array and identifies the length;
        //return the array's random integer index;

        Random randomIndex = new Random();
        int arrayIndex = randomIndex.nextInt(words.length);
        return words[arrayIndex];
    }


    //create a method that generates server name from random adjective and noun seperated by a '-' (i.e. adjective-noun)
    //in this case the method would be static because it is not a single instance
    public static String generateServerName(String[] adjectives, String[] nouns) {//we are taking an array of adjectives and an array of nouns as parameters

    //create new String variables that hold the random adjective and noun;
    //assign the randomAdj variable to the the getOneAtRandom method that takes an array and pass the adjective array as the argument;
    //assign the randomNoun variable to the the getOneAtRandom method that takes an array and pass the noun array as the argument;
    //This gives us a random adjective and noun from both lists;

        String randomAdj = getOneAtRandom(adjectives);
        String randomNoun = getOneAtRandom(nouns);

    //return a string message reflected in the exercise and concatenate it with the randomAdj, the dash, and the randomNoun;

        String serverMessage = "Here is your server name:\n";
        return serverMessage + (randomAdj + "-" + randomNoun);
    }


    public static void main(String[] args) {
       //declare your two arrays in the main
       //print out the generateServerName method with the adjectives array, and nouns array as arguments;

        String[] adjectives= {"small","large","next","old","right","big","good", "new", "long","fast"};
        String[] nouns = {"lion","tiger","bear","cricket", "panther","shark","koala","dingo", "parrot", "panda"};
        System.out.println(generateServerName(adjectives, nouns));


    }
}
