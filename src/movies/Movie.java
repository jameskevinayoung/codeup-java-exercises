package movies;//part 3.a
import util.Input;

public class Movie {


    //part 3.b
    //created private fields for the name and category;

    private String name;
    private String category;

    //create getters for the movie name and category

    public String getMovieName(String name){
        String movieName = name;
        return movieName;
    }
    public String getMovieCategory(String category){
        String movieCategory = category;
        return movieCategory;

    }

    public String getMovie(String name, String category){
        this.name = name;
        this.category = category;
    }


}
