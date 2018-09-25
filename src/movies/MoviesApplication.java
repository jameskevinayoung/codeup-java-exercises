package movies;

import util.Input;
import java.util.Arrays;
public class MoviesApplication {
//part 3.d

    //VOID: it is going to print out to the system (console.log)
    private static void  displayMovie(String filter){ //this is a method to display the movie options by category;
        Movie[] all = MoviesArray.findAll();//create a variable for a movie array and assign the Movies array findAll method to it.
        if(filter.equals("all"))//if the user selects 1 then display all the movies
            for(Movie movie: all) System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());//loop through each movie and print out the name and category
        else{
            for(Movie movie: all){
//otherwise loop through each movie and if the movie category equals the user's selection print out the movies' name and category associated with the selection;
                if(movie.getMovieCategory().equals(filter))System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
            }
        }
    }
//used the addPerson
//    private static Movie[] addMovie(Movie[] oldArray){
//        Movie newMovie = Arrays.copyOf(Movie, Movie.length+1);
//        newMovie[newMovie.length-1]= newMovie;
//
    //for loop




//        return newMovie;
//    }



    public static void main(String[] args){

        //part 3.e
        //give users a list of options
        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n"+
                "6 - add a movie and category");

        //use the input packet from previous exercise and use the scanner from there

       Movie[] newMoviesArray = MoviesArray.findAll();
        Input movieInput = new Input();


        //must put the choice in a loop inorder to continue until the user exits
        while(true) {
            System.out.print("Enter your choice: ");

            int userChoice = movieInput.getInt();

            switch (userChoice) {
                case 0:
                    return;
                case 1:
                    displayMovie("all");
                    break;
                case 2:
                    displayMovie("animated");
                    break;
                case 3:
                    displayMovie("drama");
                    break;
                case 4:
                    displayMovie("horror");
                    break;
                case 5:
                    displayMovie("scifi");
                    break;
                case 6:
                    Input userAdd = new Input();//create a new input called userAdd to add another movie
                    System.out.println("Enter the name of the movie you would like to add");//ask the user to input a string name
                    String addedName = userAdd.getString();//took the user's input
                    System.out.println("Enter the category of the movie you would like to add");//asked user to input a string category
                    String addedCategory = movieInput.getString();//took the user's input
//                    System.out.println(addMovie(addedName, addedCategory));//printed out the addMovie method with the user's movie name, and category
                    break;//results did not work because no suitable method was found for the Movies array
            }
        }

    }
}
