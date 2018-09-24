package movies;

import java.sql.SQLOutput;
import java.util.Scanner;
import util.Input;

public class MoviesApplication {
//part 3.d

    //VOID: it is going to print out to the system (console.log)
    private static void  displayMovie(String filter) {
        Movie[] all = MoviesArray.findAll();
        if(filter.equals("all"))
            for(Movie movie: all) System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
        else{
            for(Movie movie: all){
                if(movie.getMovieCategory().equals(filter))System.out.println(movie.getMovieName() + "--" + movie.getMovieCategory());
            }
        }
    }



    public static void main(String[] args){

        //part 3.e
        //give users a list of options
        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        System.out.print("Enter your choice: ");
//        Scanner movieScan = new Scanner(System.in);
//        int userInput = movieScan.nextInt();
        Input movieInput = new Input();
        int userChoice = movieInput.getInt();

        switch(userChoice){
            case 0: return;
            case 1: displayMovie("all"); break;
            case 2: displayMovie("animated"); break;
            case 3: displayMovie("drama"); break;
            case 4: displayMovie("horror"); break;
            case 5: displayMovie("scifi"); break;



        }

    }
}
